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
	public Policy getSubPolicy(Policy policy) {
		RestTemplate restTemplate = new RestTemplate();
		Policy pol = (Policy) restTemplate.postForObject("http://localhost:8090/qqGetPolicy", policy, Policy.class);
		return pol;
	}

}
