package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.dto.APIResponse;
import com.bezkoder.springjwt.dto.CustomerDTO;
import com.bezkoder.springjwt.security.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lam.le
 * @created 29/09/2021
 */
@CrossOrigin
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getAll")
    @PreAuthorize("hasRole('ROLE_MODERATOR')")
    public ResponseEntity<APIResponse<List<CustomerDTO>>> getAllCustomer() {
        List<CustomerDTO> customerDTOList = customerService.getAllCustomer();
        APIResponse<List<CustomerDTO>> response = new APIResponse<>();
        response.setMessage("Success");
        response.setStatus(HttpStatus.OK.value());
        response.setData(customerDTOList);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
