package com.accountservice.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT_DETAILS")
public class AccountBean implements Serializable {

	@Id
	@Column(name = "ACCOUNT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountId;
	@Column(name = "ACCOUNT_NUMBER")
	private int accountNo;
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
}
