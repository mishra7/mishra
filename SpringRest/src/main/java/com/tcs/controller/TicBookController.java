package com.tcs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dto.User;

@RestController
public class TicBookController {

@RequestMapping(method=RequestMethod.POST,produces="application/json")	
public ResponseEntity<User> createUser(User user)	
{

	return new ResponseEntity<User>(user,HttpStatus.OK);
}

}

