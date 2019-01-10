package com.tresk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tresk.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	AdminService service;
}
