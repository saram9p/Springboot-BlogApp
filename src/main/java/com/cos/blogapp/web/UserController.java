package com.cos.blogapp.web;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.blogapp.domain.user.UserRepository;
import com.cos.blogapp.web.dto.LoginReqDto;

//@RequiredArgsConstructor // 꼭 필요한 Argument들은 생성자를 만든다
@Controller
public class UserController {

private UserRepository userRepository;

//	private final UserRepository userRepository;
	
//	@Autowired
//	private UserRepository userRepository;
	
	// DI
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/test/query/join")
	public void testQueryJoin() {
		userRepository.join("cos", "1234", "cos@nate.com");
	}
	
	@GetMapping("/test/join")
	public void testJoin() {
		com.cos.blogapp.domain.user.User user = new com.cos.blogapp.domain.user.User();
		user.setUsername("ssar");
		user.setPassword("1234");
		user.setEmail("ssar@nate.com");
		
		userRepository.save(user);
	}
	
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
	public String login(LoginReqDto dto) {
		// 1. username, password 받기
		System.out.println(dto.getUsername());
		System.out.println(dto.getPassword());
		// 2. DB -> 조회
		// 3. 있으면
		// 4. session에 저장
		// 5. 메인페이지를 돌려주기
		return "home";
	}
	
}
