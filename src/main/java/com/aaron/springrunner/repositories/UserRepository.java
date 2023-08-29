package com.aaron.springrunner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaron.springrunner.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
