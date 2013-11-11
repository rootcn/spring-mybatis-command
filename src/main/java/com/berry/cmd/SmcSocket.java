/**
 * 
 */
package com.berry.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author berry
 */
@Component
public class SmcSocket {
	private static Logger logger = LoggerFactory.getLogger(SmcSocket.class);
	private Integer port = 41111;
	private static String commandStartup = "startup";
	private static String commandShutdown = "shutdown";
	private boolean listening = false;

	/**
	 * @return the port
	 */
	public Integer getPort() {
		return port;
	}

	/**
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

		try {
			ServerSocket serverSocket = new ServerSocket(port);
			listening = true;

			logger.warn("startup system.");
			init();

			while (listening) {
				Socket clientSocket = serverSocket.accept();
				// PrintWriter out = new PrintWriter(
				// clientSocket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(
						clientSocket.getInputStream()));
				String inputLine;
				StringBuffer buff = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
					// out.println(inputLine);
					buff.append(inputLine);
				}

				if (commandShutdown.equals(buff.toString())) {
					logger.warn("shutdown transaction check system.");
					listening = false;
					stop();
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
		}
	}

	/**
	 * http://docs.oracle.com/javase/tutorial/networking/sockets/examples/
	 * EchoClient.java
	 */
	private void sendSocketCommand(String command) {
		String hostName = "localhost";
		try {
			Socket echoSocket = new Socket(hostName, port);
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(),
					true);
			// BufferedReader in = new BufferedReader(new InputStreamReader(
			// echoSocket.getInputStream()));
			// BufferedReader stdIn = new BufferedReader(new InputStreamReader(
			// System.in));
			// String userInput;
			// while ((userInput = stdIn.readLine()) != null) {
			// out.println(userInput);
			// System.out.println("echo: " + in.readLine());
			// }
			out.print(commandShutdown);
		} catch (UnknownHostException e) {
			logger.warn(e.getMessage(), e);
			System.err.println("Don't know about host " + hostName);
			System.exit(1);
		} catch (IOException e) {
			logger.warn(e.getMessage(), e);
			System.err.println("Couldn't get I/O for the connection to "
					+ hostName);
			System.exit(1);
		}
	}

	public void command(String command) {
		if (commandStartup.equalsIgnoreCase(command)) {
			startupSocketServer();
		} else if (commandShutdown.equalsIgnoreCase(command)) {
			sendSocketCommand(commandShutdown);
		}
	}

	private void init() {
		System.out.println("init....");
	}

	private void stop() {
		System.out.println("stop...");
	}
}
