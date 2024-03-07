package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*******************************
 * 
 * 메인화면으로 가는 Controller localhost:8081/app/main
 *
 *******************************/
@Controller
public class MainController {

	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
