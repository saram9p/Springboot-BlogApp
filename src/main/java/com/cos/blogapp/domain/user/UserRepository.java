package com.cos.blogapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// save() 인서트, 업데이트
// findById(1) 셀렉트
// findAll() 전체셀렉트
// deleteByid(1)) 한건 삭제
// DAO
//@Repository // 내부적으로 부모에 걸려있어서 안해도 됨, IOC 컨테이너에 등록됨
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "insert into user (username, password, email) values (:username, :password, :email)", nativeQuery = true)
	void join(String username, String password, String email);
	
	@Query(value = "select * from user where username = :username and password = :password", nativeQuery = true)
	User mLogin(String username, String password);  // m : 내가 만든 것
}
