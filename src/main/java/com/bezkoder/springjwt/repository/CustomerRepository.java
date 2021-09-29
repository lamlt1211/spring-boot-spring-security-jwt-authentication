package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lam.le
 * @created 29/09/2021
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
