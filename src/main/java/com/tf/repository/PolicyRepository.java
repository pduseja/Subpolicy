package com.tf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tf.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
	@Query(name="policy.getAllPolicy",value="select p from Policy p where p.user.userName=:username")
	public List<Policy> getAllPolicies(@Param("username") String userName);
}
