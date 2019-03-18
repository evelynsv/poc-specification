package com.poc.specification.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.specification.domain.Person;
import com.poc.specification.service.PersonService;
/**
 * 
 * @author EvelynVieira
 *
 */
@RestController
@RequestMapping("/person")
public class PersonRestClient {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping
	public Page<Person> list(@RequestParam(required = false) String name,
							 @RequestParam Integer cpf,
							 @RequestParam Integer phone,
							 @RequestParam(defaultValue = "0") Pageable page){
		return personService.list(name, cpf, phone, page);
	}

}
