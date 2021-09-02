package com.cos.blogapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/home")
	public String home() {  // viewResolver가 발생
		return "home";
	}

	// http://localhost:8080/login -> login.jsp
	// /WEB-INF/views/login.jsp -> /WEB-INF/views/user/login.jsp
	// views/user/login.jsp
	@GetMapping("/loginForm") // 주소가 http://localhost:8080/login인 이유는 GetMapping에 걸어났기때문에
	public String loginForm() {
		return "user/loginForm";
	}
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
}
