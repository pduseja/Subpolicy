package com.tf.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tf.entity.Policy;
import com.tf.entity.User;
import com.tf.service.PolicyService;


@RestController
public class PolicyController {
	
	private Logger log = Logger.getLogger(PolicyController.class);
	
	
	@Autowired
	private PolicyService policyService;
	
	@RequestMapping(value="/getAllPolicy",method=RequestMethod.POST)
	public List<Policy> getAllPolicy(@RequestBody User user) {
		
		log.info("Get All Policy Service Started");
		List<Policy> policies = null;
		try {
			policies = policyService.getAllPolicy(user);
		} catch(Exception exception) {
			log.error("Exception Occured while executing Get All Policies Service.\n" + exception);
		}
		log.info("Get All Policy Service Ended");
		return policies;
	}
	
	@RequestMapping(value="/getPolicy",method=RequestMethod.POST)
	public Policy getPolicy(@RequestBody Policy policy) {
		log.info("Get Policy Service Started");
		try {
			policy = policyService.getPolicy(policy);
		} catch(Exception exception) {
			log.error("Exception Occured while executing Get Policy Service.\n" + exception);
		}
		log.info("Get Policy Service Ended");
		return policy;
	}
	
	
}
