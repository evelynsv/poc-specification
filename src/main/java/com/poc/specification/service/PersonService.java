package com.poc.specification.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.poc.specification.domain.Person;
/**
 * 
 * @author EvelynVieira
 *
 */
public interface PersonService {
	
	Page<Person> list(String name, Integer cpf, Integer phone, Pageable pageable);

}
