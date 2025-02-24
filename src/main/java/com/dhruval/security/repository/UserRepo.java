package com.dhruval.security.repository;

import com.dhruval.security.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {

    Users findByUsername(String username);
}
