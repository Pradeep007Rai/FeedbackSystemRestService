package com.tresk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tresk.dao.BasicInfoDao;

@Service
public class BasicInfoServiceImpl implements BasicInfoService{

	@Autowired
	BasicInfoDao dao;
}
