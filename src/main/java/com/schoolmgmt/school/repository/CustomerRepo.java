package com.schoolmgmt.school.repository;

import com.schoolmgmt.school.entity.Student;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Student, Long> {


    Optional<Student> findById(SingularAttribute<AbstractPersistable, Serializable> id);
}

