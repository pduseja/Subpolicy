package com.tf.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tf.entity.Policy;
import com.tf.entity.User;
import com.tf.repository.PolicyRepository;
import com.tf.repository.UserRepository;

@Component
public class DatabaseInitializer implements CommandLineRunner {
	
	@Autowired
	private PolicyRepository policyRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1985);
		calendar.set(Calendar.MONTH, 1);
		calendar.set(Calendar.DATE, 21);
		
		User user = new User();
		user.setUserName("James21");
		user.setPassword("JamesHill");
		user.setAge(32);
		user.setFirstName("James");
		user.setLastName("Hill");
		user.setDob(calendar.getTime());
		user.setSmokerFlag('N');
		user.setState("California");
		userRepo.save(user);
		
		
		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, 1);
		calendar.set(Calendar.DATE, 1);
		Policy policy = new Policy();
		policy.setUser(user);
		policy.setPolicyDate(calendar.getTime());
		policy.setPremium(12000F);
		policy.setStatus('Y');
		policy.setTerm(5);
		policy.setSumAssured(2000000F);
		policyRepo.save(policy);
		
		
		
		
		
		calendar.set(Calendar.YEAR, 1986);
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.DATE, 10);
		
		User user2 = new User();
		user2.setPassword("Alex321");
		user2.setUserName("Alex321");
		user2.setAge(31);
		user2.setFirstName("Alex");
		user2.setLastName("Gates");
		user2.setDob(calendar.getTime());
		user2.setSmokerFlag('Y');
		user2.setState("Florida");
		userRepo.save(user2);
		
		
		calendar.set(Calendar.YEAR, 2011);
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.DATE, 12);
		policy = new Policy();
		policy.setPolicyDate(calendar.getTime());
		policy.setUser(user2);
		policy.setPremium(10000F);
		policy.setStatus('Y');
		policy.setTerm(9);
		policy.setSumAssured(1950000F);
		policyRepo.save(policy);
		
		
		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.DATE, 12);
		policy = new Policy();
		policy.setUser(user2);
		policy.setPolicyDate(calendar.getTime());
		policy.setPremium(14000F);
		policy.setStatus('Y');
		policy.setTerm(8);
		policy.setSumAssured(2140000F);
		policyRepo.save(policy);
		
		
		calendar.set(Calendar.YEAR, 1987);
		calendar.set(Calendar.MONTH, 01);
		calendar.set(Calendar.DATE, 11);
		User user3 = new User();
		user3.setUserName("Mark23");
		user3.setPassword("Mark23");
		user3.setAge(30);
		user3.setFirstName("Mark");
		user3.setLastName("Phillips");
		user3.setDob(calendar.getTime());
		user3.setSmokerFlag('N');
		user3.setState("Texas");
		userRepo.save(user3);
		
		
		calendar.set(Calendar.YEAR, 2014);
		calendar.set(Calendar.MONTH, 04);
		calendar.set(Calendar.DATE, 05);
		policy = new Policy();
		policy.setUser(user3);
		policy.setPolicyDate(calendar.getTime());
		policy.setPremium(13600F);
		policy.setStatus('Y');
		policy.setTerm(10);
		policy.setSumAssured(2570000F);
		policyRepo.save(policy);
		
		
		
		
	}

}
