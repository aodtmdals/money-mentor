package com.spring_boot_momentor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_boot_momentor.dao.ICreditLoanDAO;
import com.spring_boot_momentor.model.CreditLoanBaseVO;
import com.spring_boot_momentor.model.CreditLoanOptionVO;

@Service
public class CreditLoanService implements ICreditLoanService {
	@Autowired
	@Qualifier("ICreditLoanDAO")
	ICreditLoanDAO dao;
	
	@Override
	public void insertCreditLoanBase(CreditLoanBaseVO vo) {
		dao.insertCreditLoanBase(vo);

	}

	@Override
	public void insertCreditLoanOption(CreditLoanOptionVO vo) {
		dao.insertCreditLoanOption(vo);

	}

}