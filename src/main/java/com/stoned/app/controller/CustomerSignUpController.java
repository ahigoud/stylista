package com.stoned.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stoned.app.model.CustomerSignUp;
import com.stoned.app.service.SignUpService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/sign")
public class CustomerSignUpController {
	@Autowired
	private SignUpService service;
	
	 @PostMapping("/post")
	 
	    public CustomerSignUp saveDetails(   @RequestBody @Valid CustomerSignUp signup)
	    {
	        return service.saveDetails( signup);
	    }
	 
	    // Read operation
	    @GetMapping("/get")
	 
	    public List<CustomerSignUp> getDetails()
	    {
	        return service.getDetails();
	    }

}
