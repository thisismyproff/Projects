package com.exam.examserver.Repo;

import com.exam.examserver.Entity.Exam.Questions;
import com.exam.examserver.Entity.Exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionsRepository  extends JpaRepository<Questions,Long> {
    Set<Questions> findByQuiz(Quiz quiz);
}
