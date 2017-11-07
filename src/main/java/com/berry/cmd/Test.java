package com.berry.cmd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.berry.cmd.bo.PersonBo;
import com.berry.cmd.po.Person;
import com.berry.cmd.service.PersonService;

public class Test {
	static Logger log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext(
				new String[] { "config/applicationContext.xml" });
		BeanFactory factory = resource;

		String command = System.getProperty("command");

		SmcSocket smcSocket = (SmcSocket) factory.getBean("smcSocket");
		smcSocket.command(command);
		// t1(factory);

		//t2(factory);
		PersonTest personTest = (PersonTest) factory.getBean("personTest");
		
		Person p1 = personTest.getPerson(1);
		
		if (p1 == null) {
			personTest.addPerson(1, "姓名1");
		} else {
			personTest.updatePerson(1, "姓名2");
		}
		personTest.removePerson(1);

		resource.close();
	}

}
