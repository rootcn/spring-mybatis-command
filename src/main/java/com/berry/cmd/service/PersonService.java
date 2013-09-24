/**
 * 
 */
package com.berry.cmd.service;

import com.berry.cmd.po.Person;

/**
 * @author berry
 *
 */
public interface PersonService {
	
	public void create(Person person);
	
	public void update(Person person);
	
	public void remove(Integer keyId);

	public Person getById(Integer id);
}
