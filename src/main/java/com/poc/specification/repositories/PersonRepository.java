package com.poc.specification.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.poc.specification.domain.Person;
/**
 * 
 * @author EvelynVieira
 *
 */
public interface PersonRepository extends JpaRepository<Person, Integer>, JpaSpecificationExecutor<Person> {

}
