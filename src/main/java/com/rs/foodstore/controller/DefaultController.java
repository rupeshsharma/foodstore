package com.rs.foodstore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rs.foodstore.data.UserData;

@RestController
@RequestMapping(value="/api")
public class DefaultController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<UserData> getCustomerDefault() {
		return new ResponseEntity<UserData>(new UserData(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value="/default")
	public ResponseEntity<UserData> getCustomer() {
		return new ResponseEntity<UserData>(new UserData(), HttpStatus.OK);
	} 
}
