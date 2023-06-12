package com.stoned.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stoned.app.model.CustomerSignUp;
@Repository
public interface CustomerSignupRepo extends JpaRepository<CustomerSignUp, Integer> {


	

	

}
