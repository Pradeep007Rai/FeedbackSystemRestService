package com.tresk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tresk.dao.AdminDao;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao dao;
	
}
