package com.accountservice.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class AccountDetailResponseBean implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CUSTOMER_ID")
	private Long customerId;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "CUSTOMER_NUMBER")
	private String customerPhoneNumber;
	/*@OneToMany
	@JoinTable(name = "ACCOUNT_DETAILS", 
			joinColumns = { @JoinColumn(name = "CUSTOMER_ID") },
			inverseJoinColumns = { @JoinColumn(name = "ACCOUNT_ID") })
	private Set<AccountBean> accounts;*/
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	/*public Set<AccountBean> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<AccountBean> accounts) {
		this.accounts = accounts;
	}*/
}
