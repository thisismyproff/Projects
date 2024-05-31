package com.exam.examserver.Repo;

import com.exam.examserver.Entity.Exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
}
