package com.tf.subpolicy.service;

import java.util.List;

import com.tf.subpolicy.entity.Policy;


public interface PolicyService {
	
	public List<Policy> getAllPolicy(String userName);

	public Policy getPolicy(Long policyId);

}
