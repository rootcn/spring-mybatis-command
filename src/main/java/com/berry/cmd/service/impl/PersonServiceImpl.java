/**
 * 
 */
package com.berry.cmd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berry.cmd.dao.PersonDAO;
import com.berry.cmd.po.Person;
import com.berry.cmd.service.PersonService;

/**
 * @author berry
 *
 */
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDAO personDAO;

	public void create(Person person) {
		personDAO.create(person);
	}

	public void update(Person person) {
		personDAO.update(person);
	}

	public void remove(Integer keyId) {
		personDAO.remove(keyId);
	}

	public Person getById(Integer id) {
		return personDAO.getById(id);
	}

}
