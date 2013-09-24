/**
 * 
 */
package com.berry.cmd.dao;

import com.berry.cmd.po.Person;

/**
 * @author berry
 *
 */
public interface PersonDAO {
	
	public void create(Person person);
	
	public void update(Person person);
	
	public void remove(Integer keyId);

	public Person getById(Integer id);
}
