package com.poc.specification.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * 
 * @author EvelynVieira
 *
 */
@Data
@Table
@Entity
public class Person {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private String name;
	    private Integer cpf, phone;

}
