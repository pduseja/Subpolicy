package com.tf.subpolicy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tf.subpolicy.entity.Policy;
import com.tf.subpolicy.repository.PolicyRepository;


@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyRepository repository;
	
	
	
	@Override
	public List<Policy> getAllPolicy(String userName) {
		return repository.getAllPolicies(userName);
	}
	
	@Override
	public Policy getPolicy(Long policyId) {
		return repository.findOne(policyId);
	}

}
