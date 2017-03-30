package com.tf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tf.entity.Policy;
import com.tf.entity.User;
import com.tf.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyRepository repository;
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Policy> getAllPolicy(User user) {
		RestTemplate restTemplate = new RestTemplate();
		List<Policy> policies = (List<Policy>) restTemplate.postForObject("http://localhost:8080/qqGetAllPolicy", user, List.class);
		return policies;
	}
	
	@Override
	public Policy getPolicy(Policy policy) {
		RestTemplate restTemplate = new RestTemplate();
		Policy pol = (Policy) restTemplate.postForObject("http://localhost:8080/qqGetPolicy", policy, Policy.class);
		return pol;
	}

}
