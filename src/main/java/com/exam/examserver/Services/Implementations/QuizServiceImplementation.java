package com.exam.examserver.Services.Implementations;

import com.exam.examserver.Entity.Exam.Quiz;
import com.exam.examserver.Repo.QuizRepository;
import com.exam.examserver.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class QuizServiceImplementation implements QuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Set<Quiz> getAllQuiz() {
        return new LinkedHashSet<>(this.quizRepository.findAll());
    }

    @Override
    public Quiz getQuiz(Long id) {
        return this.quizRepository.getOne(id);
    }

    @Override
    public void deleteQuiz(Long id) {
        this.quizRepository.deleteById(id);
    }
}
