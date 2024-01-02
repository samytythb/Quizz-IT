package com.Iter.service;

import com.Iter.model.Tech.exam.Question;
import com.Iter.model.Tech.exam.Quiz;

import java.util.Set;

public interface QuestionService {
    public Question addQuestion(Question question);
    public Question updateQuestion(Question question);

    public void deleteQuestion(Long quesId);
    public Set<Question> getQuestions();
    public Question getQuestion(Long quesId);
    public Set<Question> getQuestionsOfQuiz(Quiz Quiz);
}
