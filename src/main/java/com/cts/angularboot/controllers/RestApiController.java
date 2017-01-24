package com.cts.angularboot.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.angularboot.pojo.User;
import com.cts.angularboot.services.UserService;

@RestController
@RequestMapping("/rest")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user/", method=RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers(){
		
		List<User> users = userService.findAllUsers();
		if(users.isEmpty()){
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
}
