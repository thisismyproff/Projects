package com.exam.examserver.Repo;

import com.exam.examserver.Entity.Exam.QuizResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizResponseRepository extends JpaRepository<QuizResponse,Long> {
}
