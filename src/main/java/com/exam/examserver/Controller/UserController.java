package com.exam.examserver.Controller;

import com.exam.examserver.Entity.Role;
import com.exam.examserver.Entity.User;
import com.exam.examserver.Entity.UserRole;
import com.exam.examserver.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
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
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return this.userService.getUser(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        this.userService.deleteUser(id);
    }
}
