package com.poc.specification.service;


import static org.springframework.data.jpa.domain.Specification.where;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.poc.specification.PersonSpecification;
import com.poc.specification.domain.Person;
import com.poc.specification.repositories.PersonRepository;
/**
 * 
 * @author EvelynVieira
 *
 */
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public Page<Person> list(String name, Integer cpf, Integer phone, Pageable pageable) {
		return personRepository.findAll(where(PersonSpecification.name(name)).or(PersonSpecification.cpf(cpf)).and(PersonSpecification.phone(phone)), pageable);		
	}

}
