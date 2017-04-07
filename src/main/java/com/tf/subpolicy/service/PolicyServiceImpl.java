package com.tf.subpolicy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tf.subpolicy.entity.Policy;
import com.tf.subpolicy.entity.User;
import com.tf.subpolicy.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Policy> getAllPolicy(User user) {
		RestTemplate restTemplate = new RestTemplate();
		List<Policy> policies = (List<Policy>) restTemplate.postForObject("http://localhost:8090/qqGetAllPolicy", user, List.class);
		return policies;
	}

}
