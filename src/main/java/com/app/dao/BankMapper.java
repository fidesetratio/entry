package com.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.app.domain.Bank;

@Mapper
public interface BankMapper {
	List<Bank> findAll();
}
