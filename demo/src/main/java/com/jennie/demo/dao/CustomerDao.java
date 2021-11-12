package com.jennie.demo.dao;


import com.jennie.demo.entity.Customer;
import org.springframework.stereotype.Repository;


import org.springframework.stereotype.Repository;
@Repository
public class CustomerDao {
    public void signUp(Customer customer) {
    }

    public Customer getCustomer(String email) {
        return new Customer();
    }

}
