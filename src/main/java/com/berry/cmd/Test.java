package com.berry.cmd;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.berry.cmd.po.Person;
import com.berry.cmd.service.PersonService;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext(
				new String[] { "config/applicationContext.xml" });
		BeanFactory factory = resource;
		PersonService personService = (PersonService) factory
				.getBean("personServiceImpl");

		System.out.println(personService);
		
		personService.remove(1);
		
		Person p = new Person();
		p.setKeyId(1);
		p.setName("测试姓名");
		personService.create(p);
		
		Person p2 = personService.getById(1);
		System.out.println(p2.getName());
		
		p.setName("姓名2");
		personService.update(p);
		
		Person p3 = personService.getById(1);
		System.out.println(p3.getName());
	}

}
