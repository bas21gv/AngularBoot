package com.cts.angularboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.angularboot.pojo.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
