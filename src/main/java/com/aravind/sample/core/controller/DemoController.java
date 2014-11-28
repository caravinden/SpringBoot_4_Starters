/**
 * 
 */
package com.aravind.sample.core.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aravind.sample.core.dataobject.User;

/**
 * @author aravind
 *
 */
@RestController
@RequestMapping("user")

public class DemoController {
	
	private static final Logger LOG = Logger.getLogger(DemoController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String getDetails(){
		return "welcome to spring boot";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String addDetails(@RequestBody User user){
		
		LOG.info("user details::"+user.toString());
		return user.toString();
	}

}
