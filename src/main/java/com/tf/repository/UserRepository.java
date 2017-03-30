package com.tf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tf.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
