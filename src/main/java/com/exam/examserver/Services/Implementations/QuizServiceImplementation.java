package com.exam.examserver.Services.Implementations;

import com.exam.examserver.Entity.Exam.Category;
import com.exam.examserver.Entity.Exam.Quiz;
import com.exam.examserver.Repo.QuizRepository;
import com.exam.examserver.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
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
        Quiz quiz= this.quizRepository.getOne(id);
        this.quizRepository.delete(quiz);
    }

    @Override
    public List<Quiz> getQuizesOfCategory(Category category) {
        return this.quizRepository.findByCategory(category);
    }
}
