package com.tf.subpolicy.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tf.subpolicy.entity.Policy;
import com.tf.subpolicy.service.PolicyService;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
public class PolicyController {
	
	private Logger log = Logger.getLogger(PolicyController.class);
	
	
	@Autowired
	private PolicyService policyService;
	
        @CrossOrigin(origins = "*")
	@RequestMapping(value="/getSubPolicy",method=RequestMethod.POST)
	public Policy getPolicy(@RequestBody Policy policy) {
		log.info("Get Policy Service Started");
		try {
			policy = policyService.getSubPolicy(policy);
		} catch(Exception exception) {
			log.error("Exception Occured while executing Get Policy Service.\n" + exception);
		}
		log.info("Get Policy Service Ended");
		return policy;
	}
	
}
