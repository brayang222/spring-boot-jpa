package com.spring.spring_boot_jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

   List<Customer> findByLastName(String lastName);

   Customer findById(long id);

}
