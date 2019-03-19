
package com.poc.specification.service;

import static com.poc.specification.PersonSpecification.cpf;
import static com.poc.specification.PersonSpecification.name;
import static com.poc.specification.PersonSpecification.phone;
import static org.springframework.data.jpa.domain.Specification.where;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.poc.specification.domain.Person;
import com.poc.specification.repositories.PersonRepository;

/**
 * @author EvelynVieira
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Page<Person> list(String name, Integer cpf, Integer phone, Pageable pageable) {
		return personRepository.findAll(where(name(name)).or(cpf(cpf)).or(phone(phone)), pageable);
	}

}
