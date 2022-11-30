package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SignUp;

public interface SignUpRepository extends JpaRepository<SignUp, Long>{

	Optional<SignUp> findByemail(String email);

	Optional<SignUp> findBypassword(String password);

	Optional<SignUp> findByuserName(String userName);


	
 @org.springframework.data.jpa.repository.Query(value="Select s.email from sign_up",nativeQuery = true)
 public List<SignUp> getByallemails();




}
