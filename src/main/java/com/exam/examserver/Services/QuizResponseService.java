package com.exam.examserver.Services;

import com.exam.examserver.Entity.Exam.QuizResponse;

import java.util.List;

public interface QuizResponseService {
    public QuizResponse addQuizResponse(QuizResponse quizResponse);
    public List<QuizResponse> getQuizResponse();

}
