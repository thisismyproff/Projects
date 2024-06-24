package com.exam.examserver.Services.Implementations;

import com.exam.examserver.Entity.Exam.QuizResponse;
import com.exam.examserver.Repo.QuizResponseRepository;
import com.exam.examserver.Services.QuizResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuizResponseServiceImplementation implements QuizResponseService {

    @Autowired
    private QuizResponseRepository quizResponseRepository;

    @Override
    public QuizResponse addQuizResponse(QuizResponse quizResponse) {
       return this.quizResponseRepository.save(quizResponse);
    }

    @Override
    public List<QuizResponse> getQuizResponse() {
        return this.quizResponseRepository.findAll();
    }
}
