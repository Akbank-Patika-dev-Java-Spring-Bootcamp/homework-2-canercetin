package com.example.bootcampdemo2.dao;

import com.example.bootcampdemo2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
    User findByPhoneNumber(String phoneNumber);
    List<User> findByIdBetween(Long firstId, Long lastId);
    List<User> findByIdGreaterThanEqual(Long id);


}
