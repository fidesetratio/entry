package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.BankMapper;
import com.app.domain.Bank;
@RestController
@RequestMapping(value="/api")
public class EntryRest {
	
	  @Autowired
	  private BankMapper bankMapper;
	 
		@GetMapping("/test")
		public List<Bank> test() {

			return bankMapper.findAll();
			
		}
	  	
}
