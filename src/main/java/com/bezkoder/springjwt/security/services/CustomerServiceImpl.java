package com.bezkoder.springjwt.security.services;

import com.bezkoder.springjwt.dto.CustomerDTO;
import com.bezkoder.springjwt.exception.NotFoundException;
import com.bezkoder.springjwt.models.Customer;
import com.bezkoder.springjwt.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lam.le
 * @created 29/09/2021
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer> customerList = customerRepository.findAll();
        if (customerList.isEmpty()) {
            throw new NotFoundException("Not found Customer");
        }
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for (Customer customer : customerList) {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setNo(customer.getNo());
            customerDTO.setCustomerId(customer.getCustomerId());
            customerDTO.setName(customer.getName());
            customerDTO.setCountry(customer.getCountry());
            customerDTO.setSalesPic(customer.getSalesPic());
            customerDTO.setCreateDate(customer.getCreateDate());
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }
}
