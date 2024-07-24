package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("log")
	public String getLog() {
		logger.debug("debug log...");
		logger.info("info log...");
		logger.warn("warn log...");
		logger.error("error log...");

		return "index";
	}

}
