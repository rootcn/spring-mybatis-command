/**
 * 
 */
package com.berry.cmd.bo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.berry.cmd.po.Person;
import com.berry.cmd.service.PersonService;

/**
 * @author berry
 * business
 */
@Component
public class PersonBo {
	Logger log = LoggerFactory.getLogger(PersonBo.class);
	
	@Autowired
	@Qualifier("personServiceImpl")
	private PersonService personService;

	public void add(Integer id, String name) {
		Person p = new Person();
		p.setKeyId(1);
		p.setName("测试姓名");
		personService.create(p);
	}
	
	public void update(Integer id, String name) {
		Person p = new Person();
		p.setKeyId(1);
		p.setName("测试姓名");
		personService.update(p);
	}
	
	public void remove(Integer id) {
		personService.remove(id);
	}
	
	public void addTestTx() {
		personService.remove(1);
		
		log.debug("remove 1");
		
		Person p = new Person();
		p.setKeyId(1);
		p.setName("测试姓名");
		personService.create(p);
		if (true) {
			throw new RuntimeException("xxx");
		}
		Person p2 = personService.getById(1);
		log.debug(p2.getName());
		
		p.setName("姓名2");
		personService.update(p);

		Person p3 = personService.getById(1);
		log.debug(p3.getName());
	}
}
