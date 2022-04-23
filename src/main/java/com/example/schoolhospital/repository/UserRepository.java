package com.example.schoolhospital.repository;

import com.example.schoolhospital.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
