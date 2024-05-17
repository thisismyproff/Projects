package com.exam.examserver;

import com.exam.examserver.Services.UserService;
import com.exam.examserver.Entity.Role;
import com.exam.examserver.Entity.User;
import com.exam.examserver.Entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting");
//		User user = new User();
//		user.setName("Mayur Joshi");
//		user.setUsername("May1");
//		user.setPassword("pass123");
//		user.setEmail("abc@gmail.com");
//
//		Role role=new Role();
//		role.setRoleId(44L);
//		role.setRoleName("ADMIN");
//		Set<UserRole> userRoleSet =new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		this.userService.createUser(user,userRoleSet);


	}
}
