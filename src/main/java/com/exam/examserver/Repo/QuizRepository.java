package com.exam.examserver.Repo;

import com.exam.examserver.Entity.Exam.Category;
import com.exam.examserver.Entity.Exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz,Long> {


    List<Quiz> findByCategory(Category category);
}
