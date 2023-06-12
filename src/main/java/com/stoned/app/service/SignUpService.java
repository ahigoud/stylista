package com.stoned.app.service;

import java.util.List;

import com.stoned.app.model.CustomerSignUp;





public interface SignUpService {
    


	List<CustomerSignUp> getDetails();




	CustomerSignUp saveDetails(CustomerSignUp signup);




	
    

}
