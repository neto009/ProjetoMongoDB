package com.example.demo.services;

import com.example.demo.entities.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/costumer")
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        Optional<Customer> currentCustomer = customerRepository.findById(customer.getId());
        if(currentCustomer.isPresent()){
            return customerRepository.save(customer);
        }
        throw new RuntimeException("Fail");
    }

    @DeleteMapping
    public void deleteCustomer(@RequestBody Customer customer){
        Optional<Customer> currentCustomer = customerRepository.findById(customer.getId());
        if(currentCustomer.isPresent()){
            customerRepository.delete(customer);
        }
        throw new RuntimeException("Fail");
    }

}
