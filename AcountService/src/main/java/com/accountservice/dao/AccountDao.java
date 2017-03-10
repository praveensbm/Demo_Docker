package com.accountservice.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accountservice.beans.AccountBean;

public interface AccountDao extends JpaRepository<AccountBean, Long>{

}
