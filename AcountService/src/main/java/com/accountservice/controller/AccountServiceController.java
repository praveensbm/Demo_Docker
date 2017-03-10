package com.accountservice.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accountservice.beans.AccountBean;
import com.accountservice.dao.AccountDao;

@RestController
@RequestMapping("/account")
public class AccountServiceController {

	@Autowired
	private AccountDao accountDao;
	
	@RequestMapping("/test")
	public String test(){
		return "Hello";
	}
	@RequestMapping(value="/details")
	@ResponseBody
	public List<AccountBean> accountDetails(){
		List<AccountBean> accountBean = accountDao.findAll();
		return accountBean;
	}
	@RequestMapping(value="/add")
	@ResponseBody
	public AccountBean addAccount(AccountBean entity){
		AccountBean accountBean = accountDao.save(entity);
		return accountBean;
	}
}
