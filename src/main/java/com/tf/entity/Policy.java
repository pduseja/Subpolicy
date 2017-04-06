package com.tf.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;


@Entity
public class Policy {
	
	@Id
	@Column(name="POLICY_ID")
	private Long policyId;
	
	@ManyToOne
	@JoinColumn(name="USERID")
	private User user;
	
	@Column(name="POLICY_DATE")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date policyDate;
	
	
	@Column(name="PREMIUM")
	private Float premium;
	
	
	@Column(name="STATUS")
	private Character status;
	
	
	@Column(name="TERM")
	private Integer term;
	
	
	@Column(name="SUM_ASSURED")
	private Float sumAssured;
	
	
	
	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	
	
	public Date getPolicyDate() {
		return policyDate;
	}
	public void setPolicyDate(Date policyDate) {
		this.policyDate = policyDate;
	}
	public Float getPremium() {
		return premium;
	}
	public void setPremium(Float premium) {
		this.premium = premium;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public Integer getTerm() {
		return term;
	}
	public void setTerm(Integer term) {
		this.term = term;
	}
	public Float getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(Float sumAssured) {
		this.sumAssured = sumAssured;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
