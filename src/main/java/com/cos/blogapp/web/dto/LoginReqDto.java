package com.cos.blogapp.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO = Date Transfer Object
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginReqDto {
	private String username;
	private String password;
	
	public static void main(String[] args) {
		LoginReqDto dto = new LoginReqDto();
	}
}
