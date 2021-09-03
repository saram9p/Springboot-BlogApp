package com.cos.blogapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// DAO
//@Repository // 내부적으로 부모에 걸려있어서 안해도 됨, IOC 컨테이너에 등록됨
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "insert into user (username, password, email) values (:username, :password, :email)", nativeQuery = true)
	void join(String username, String password, String email);
}
