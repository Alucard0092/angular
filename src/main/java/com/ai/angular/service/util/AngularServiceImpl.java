package com.ai.angular.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ai.angular.service.AngularService;

@Service("angularService")
public class AngularServiceImpl implements AngularService {

	private static final Logger logger = LoggerFactory.getLogger(AngularService.class);
	
	
	@Override
	public void login() {
		// TODO Auto-generated method stub
		logger.debug("start angular service login");
	}


}
