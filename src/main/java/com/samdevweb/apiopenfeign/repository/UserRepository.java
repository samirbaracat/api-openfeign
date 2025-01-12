package com.samdevweb.apiopenfeign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samdevweb.apiopenfeign.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    
}
