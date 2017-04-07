package com.tf.subpolicy.service;

import java.util.List;

import com.tf.subpolicy.entity.Policy;
import com.tf.subpolicy.entity.User;

public interface PolicyService {
	
	public List<Policy> getAllPolicy(User user);
}
