package com.project.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.spring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
