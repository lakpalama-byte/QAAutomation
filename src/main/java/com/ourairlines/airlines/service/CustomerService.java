package com.ourairlines.airlines.service;

import com.ourairlines.airlines.entity.Customer;
import com.ourairlines.airlines.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Optional<Customer> getCustomerById(Long id) {

        return customerRepo.findById(id);
    }

    // Other service methods for CRUD operations

    // Example of adding business logic
    public Customer createorUpdateCustomer(Customer customer) {
        Optional<Customer> existingCustomer=customerRepo.findById(id);
        if(existingCustomer.isPresent()) {
            Customer modifyCustomer=existingCustomer.get();
           // todo need to put more way.
        }


        // Additional logic like validation checks, data transformations, etc.
        return customerRepo.save(customer);
    }





    private boolean isValidEmail(String email)  {

        String testEmail="lakpa.tashi@example.com";
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(testEmail);
        return matcher.matches();
    }
}
