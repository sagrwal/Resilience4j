package com.primesoft.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;





public class FallBackMethodsController {
	
	   
    @GetMapping("/userServiceFallBackMethod")
	public String userServiceFallBackMethod() {
		return "User Service is taking longer then Expectation.."+"Please Try again latter";
		
		
	}

    

	@GetMapping("/departmentServiceFallBackMethod")
	public String departmentServiceFallBackMethod() {

		return "Department Service is taking longer then Expectation.."+"Please Try again latter";
	}
}
