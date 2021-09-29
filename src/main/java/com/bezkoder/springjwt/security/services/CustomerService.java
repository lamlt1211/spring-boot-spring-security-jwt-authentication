package com.bezkoder.springjwt.security.services;

import com.bezkoder.springjwt.dto.CustomerDTO;

import java.util.List;

/**
 * @author lam.le
 * @created 29/09/2021
 */
public interface CustomerService {
    List<CustomerDTO> getAllCustomer();
}
