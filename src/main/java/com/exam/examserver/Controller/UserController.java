package com.exam.examserver.Controller;

import com.exam.examserver.Entity.Role;
import com.exam.examserver.Entity.User;
import com.exam.examserver.Entity.UserRole;
import com.exam.examserver.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        Set<UserRole> roleSet = new HashSet<>();
        Role role =  new Role();
        role.setRoleId(45L);
        role.setRoleName("NORMAL");
        UserRole userRole=new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roleSet.add(userRole);
        return this.userService.createUser(user,roleSet);
        //https://youtu.be/8SXZPr4bKbs?list=PL0zysOflRCel5kT-AiGyy5oMabnlilkIS&t=875
    }
    

}
