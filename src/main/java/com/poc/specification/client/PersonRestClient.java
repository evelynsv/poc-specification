
package com.poc.specification.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.specification.domain.Person;
import com.poc.specification.service.PersonServiceImpl;

/**
 * @author EvelynVieira
 */
@RestController
@RequestMapping("/person")
public class PersonRestClient {

	@Autowired
	private PersonServiceImpl personServiceImpl;

	@GetMapping
	public Page<Person> list(@RequestParam(required = false) String name,
			@RequestParam(required = false) Integer cpf,
			@RequestParam(required = false) Integer phone,
			@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "10") Integer size) {
		return personServiceImpl.list(name, cpf, phone, PageRequest.of(page, size));
	}

}
