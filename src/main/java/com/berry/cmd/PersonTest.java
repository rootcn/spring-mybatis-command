/**
 * 
 */
package com.berry.cmd;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.berry.cmd.po.Person;
import com.berry.cmd.service.PersonService;

/**
 * @author berry
 *
 * person test
 */
@Component
public class PersonTest {
	private Logger logger = LoggerFactory.getLogger(PersonTest.class);
	@Resource(name = "personServiceImpl")
	private PersonService personService;
	
	public Boolean addPerson(Integer id, String name) {
		Person p = new Person();
		p.setKeyId(id);
		p.setName(name);
		personService.create(p);
		
		logger.debug(String.format("add person: %s, %s", id, name));
		
		return (true);
	}
	
	public Boolean updatePerson(Integer id, String name) {
		Person p = new Person();
		p.setKeyId(id);
		p.setName(name);
		personService.update(p);
		
		logger.debug(String.format("update person: %s, %s", id, name));
		
		return (true);
	}

	public Boolean removePerson(Integer id) {
		personService.remove(id);
		
		logger.debug(String.format("remove person: %s", id));
		
		return (true);
	}

	public Person getPerson(Integer id) {
		logger.debug(String.format("get person: %s", id));
		return personService.getById(id);
	}
}
