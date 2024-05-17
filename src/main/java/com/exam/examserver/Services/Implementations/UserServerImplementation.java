package com.exam.examserver.Services.Implementations;

import com.exam.examserver.Services.UserService;
import com.exam.examserver.Entity.User;
import com.exam.examserver.Entity.UserRole;
import com.exam.examserver.Repo.RoleRepository;
import com.exam.examserver.Repo.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class UserServerImplementation implements UserService {
    private static final  Logger log = LoggerFactory.getLogger(UserServerImplementation.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) {
        boolean isDuplicate = (this.userRepository.findUserByUsername(user.getUsername())!=null);
        if (isDuplicate) {
            log.error("User is Duplicate");
            throw new RuntimeException("Something went wrong");
        } else {
            User local = this.userRepository.findUserByUsername(user.getUsername());
            for(UserRole userRole: userRoles) {
                roleRepository.save(userRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local=this.userRepository.save(user);
            return local;
        }
    }

    @Override
    public User getUser(String username) {
        return this.userRepository.findUserByUsername(username);
    }

    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
