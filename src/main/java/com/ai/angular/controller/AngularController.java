package com.ai.angular.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.angular.service.AngularService;


@Controller
@RequestMapping(value="angular")
public class AngularController {

	private static final Logger logger = LoggerFactory.getLogger(AngularController.class);
	
	@Autowired
	private AngularService angularService;
	
	@RequestMapping(value="/login")
	@ResponseBody
	public Map<String, Object> login() {
		Map<String, Object> returnValue = new HashMap<String, Object>();
		logger.debug("start angular controller login");
		angularService.login();
		return returnValue;
	}
}
