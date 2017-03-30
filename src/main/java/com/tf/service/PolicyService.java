package com.tf.service;

import java.util.List;

import com.tf.entity.Policy;
import com.tf.entity.User;

public interface PolicyService {
	
	public List<Policy> getAllPolicy(User user);

	public Policy getPolicy(Policy policy);

}
