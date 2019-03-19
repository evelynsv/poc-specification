
package com.poc.specification.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.poc.specification.domain.Person;

/**
 * @author EvelynVieira
 */
@Component
public interface PersonService {

	Page<Person> list(String name, Integer cpf, Integer phone, Pageable pageable);

}
