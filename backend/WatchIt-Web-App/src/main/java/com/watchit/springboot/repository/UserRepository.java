package com.watchit.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.watchit.springboot.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
