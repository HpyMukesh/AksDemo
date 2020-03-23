package com.sprintboot.aksdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AKSController {
	private static int hitCount = 0;

	@RequestMapping("/demo")
	public String getMessage() {
		return "Welcome to AKS Demo Application";
	}

	@RequestMapping("/")
	public String getRootMessage() {
		return "Welcome to AKS";
	}

	@RequestMapping("/hitCount")
	public String getHitCount() {
		return "Hit count on this application : " + ++hitCount;
	}
}