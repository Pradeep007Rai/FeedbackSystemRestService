package com.tresk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tresk.service.QuestionsService;

@RestController
public class QuestionsController {

	@Autowired
	QuestionsService service;
}
