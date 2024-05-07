package com.exam.examserver.Services;

import com.exam.examserver.Entity.User;
import com.exam.examserver.Entity.UserRole;

import java.util.Set;

public interface UserService {
    public User createUser (User user, Set<UserRole> userRole);
}
