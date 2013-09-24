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

		// t1(factory);

		t2(factory);

		resource.close();
	}

	public static void t1(BeanFactory factory) {
		PersonService personService = (PersonService) factory
				.getBean("personServiceImpl");

		personService.remove(1);

		log.debug("remove 1");

		Person p = new Person();
		p.setKeyId(1);
		p.setName("测试姓名");
		personService.create(p);
		// if (true) {
		// throw new RuntimeException("xxx");
		// }
		Person p2 = personService.getById(1);
		log.debug(p2.getName());

		p.setName("姓名2");
		personService.update(p);

		Person p3 = personService.getById(1);
		log.debug(p3.getName());
	}

	public static void t2(BeanFactory factory) {
		PersonBo personBo = (PersonBo) factory.getBean("personBo");
		
		//personBo.remove(1);
		
		personBo.addTestTx();
	}

}
