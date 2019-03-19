
package com.poc.specification;

import org.springframework.data.jpa.domain.Specification;

import com.poc.specification.domain.Person;
import com.poc.specification.domain.Person_;

/**
 * @author EvelynVieira
 */
public class PersonSpecification {

	public static Specification<Person> name(String name) {
		return (root, criteriaQuery, criteriaBuilder) -> {
			criteriaQuery.distinct(true);
			return criteriaBuilder.and(criteriaBuilder.equal(root.get(Person_.name), name));
		};
	}

	public static Specification<Person> phone(Integer phone) {
		return (root, criteriaQuery, criteriaBuilder) -> {
			criteriaQuery.distinct(true);
			return criteriaBuilder.and(criteriaBuilder.equal(root.get(Person_.phone), phone));
		};
	}

	public static Specification<Person> cpf(Integer cpf) {
		return (root, criteriaQuery, criteriaBuilder) -> {
			criteriaQuery.distinct(true);
			return criteriaBuilder.and(criteriaBuilder.equal(root.get(Person_.cpf), cpf));
		};
	}

}
