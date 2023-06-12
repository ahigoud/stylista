package com.stoned.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.stoned.app.model.CustomerSignUp;
import com.stoned.app.repository.CustomerSignupRepo;
import com.stoned.app.service.SignUpService;
@Service
public class CustomerSignUpServiceImpl  implements SignUpService{
	
	 @Autowired
	    private CustomerSignupRepo repo;

	@Override
	public CustomerSignUp saveDetails(CustomerSignUp signup) {
		// TODO Auto-generated method stub
		CustomerSignUp csu=CustomerSignUp.build(0,signup.getFirstname(), signup.getLastname(), signup.getDob(), signup.getGender(), signup.getEmail(), signup.getPhnumber(), signup.getPassword());
		return repo.save(signup);
	}

	@Override
	public List<CustomerSignUp> getDetails() {
		// TODO Auto-generated method stub
		return  repo.findAll();
	}



	
	 
	 

}
