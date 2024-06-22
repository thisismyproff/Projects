package com.exam.examserver.Repo;

import com.exam.examserver.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findUserByUsername(String username);
    public List<User> findByUsername(String username);
}
