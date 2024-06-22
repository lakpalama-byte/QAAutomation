package com.ourairlines.airlines.repository;

import com.ourairlines.airlines.entity.Customer;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {


    Optional<Customer> findById(SingularAttribute<AbstractPersistable, Serializable> id);
}

