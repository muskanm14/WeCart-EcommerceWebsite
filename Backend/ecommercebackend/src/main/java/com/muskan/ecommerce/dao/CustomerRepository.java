package com.muskan.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muskan.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository <Customer, Long>{

}
