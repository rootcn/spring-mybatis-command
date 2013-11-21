/**
 * 
 */
package com.berry.cmd;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * socket control.
 * 
 * @author berry
 */
@Component
public class SmcSocket {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(SmcSocket.class);

	/** The port. */
	private Integer port = 1000;
	/** The command startup. */
	private static String COMMAND_STARTUP = "startup";

	/** The command shutdown. */
	private static String COMMAND_SHUTDOWN = "shutdown";

	/** The echo end. */
	private static String ECHO_END = "end";

	/** The listening. */
	private boolean listening = false;

	/**
	 * Gets the port.
	 * 
	 * @return the port
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * Sets the port.
	 * 
	 * @param port
	 *            the port to set
	 */
	@Value("#{smcProp['socket.port']}")
	public void setPort(Integer port) {
		this.port = port;
	}

	/**
	 * http://docs.oracle.com/javase/tutorial/networking/sockets/examples/
	 * EchoServer.java
	 */
	private void startupSocketServer() {
		if (listening == true) {
			return;
		}
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		PrintWriter out = null;
		Scanner in = null;
		try {
			serverSocket = new ServerSocket(port);
			listening = true;

			logger.warn("startup system, on port[" + port + "]");
			init();

			while (listening) {
				clientSocket = serverSocket.accept();
				in = new Scanner(new InputStreamReader(
						clientSocket.getInputStream()));
				out = new PrintWriter(clientSocket.getOutputStream(), true);

				StringBuffer buff = new StringBuffer();
				while (in.hasNextLine()) {
					buff.append(in.nextLine());
					break;
				}
				out.println(ECHO_END);
				// close client
				clientSocket.close();

				logger.warn("receive command: " + buff.toString());

				if (COMMAND_SHUTDOWN.equals(buff.toString())) {
					logger.warn("shutdown system.");
					listening = false;
					stop();
					// close server
					serverSocket.close();
					try {
						Thread.sleep(10000);
						System.exit(0);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					logger.warn("unknow command:" + buff.toString());
				}
			}
		} catch (IOException e) {
			logger.warn(e.getMessage(), e);
			System.err.println("Could not listen on port " + port);
			System.exit(-1);
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			if (serverSocket != null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
					logger.warn(e.getMessage(), e);
				}
			}
			if (clientSocket != null) {
				try {
					clientSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
					logger.warn(e.getMessage(), e);
				}
			}
		}
	}

	/**
	 * http://docs.oracle.com/javase/tutorial/networking/sockets/examples/
	 * EchoClient.java
	 * 
	 * @param command
	 *            the command
	 */
	private void sendSocketCommand(String command) {
		String hostName = "localhost";
		Socket echoSocket = null;
		Scanner in = null;
		PrintWriter out = null;
		try {
			echoSocket = new Socket(hostName, port);

			in = new Scanner(new InputStreamReader(echoSocket.getInputStream()));
			out = new PrintWriter(echoSocket.getOutputStream(), true);
			out.println(command);
			// echoSocket.close();

			StringBuffer buff = new StringBuffer();
			while (in.hasNextLine()) {
				buff.append(in.nextLine());
				break;
			}

			if (ECHO_END.equals(buff.toString())) {
				echoSocket.close();
			}
		} catch (UnknownHostException e) {
			logger.warn(e.getMessage(), e);
			System.err.println("Don't know about host " + hostName);
			System.exit(1);
		} catch (IOException e) {
			logger.warn(e.getMessage(), e);
			System.err.println("Couldn't get I/O for the connection to "
					+ hostName);
			System.exit(1);
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			if (echoSocket != null) {
				try {
					echoSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
					logger.warn(e.getMessage(), e);
				}
			}
		}
	}

	/**
	 * Command.
	 * 
	 * @param command
	 *            the command
	 */
	public void command(String command) {
		if (COMMAND_STARTUP.equalsIgnoreCase(command)) {
			startupSocketServer();
		} else if (COMMAND_SHUTDOWN.equalsIgnoreCase(command)) {
			sendSocketCommand(COMMAND_SHUTDOWN);
		}
	}

	/**
	 * Inits the.
	 */
	private void init() {
		System.out.println("init....");
	}

	/**
	 * Stop.
	 */
	private void stop() {
		System.out.println("stop...");
	}
}
