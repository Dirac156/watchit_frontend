// Author : Fiona Mukuhi Ng'ang'a

package com.watchit.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.watchit.springboot.domain.User;

@Repository
// this interface is responsible for persistence and query operations
public interface UserRepository extends JpaRepository<User, Long>{

}
