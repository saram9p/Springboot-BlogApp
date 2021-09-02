package com.cos.blogapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("/login")
	public String login(String username, String password) {
		// 1. username, password 받기
		System.out.println(username);
		System.out.println(password);
		// 2. DB -> 조회
		// 3. 있으면
		// 4. session에 저장
		// 5. 메인페이지를 돌려주기
		return "home";
	}
	
}
