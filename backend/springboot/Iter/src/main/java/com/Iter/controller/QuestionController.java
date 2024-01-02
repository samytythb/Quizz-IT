package com.Iter.controller;

import com.Iter.model.Tech.exam.Question;
import com.Iter.model.Tech.exam.Quiz;
import com.Iter.service.QuestionService;
import com.Iter.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.*;
@RestController
@RequestMapping("/question")
@CrossOrigin("*")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuizService quizService;

    @PostMapping("/")
    public ResponseEntity<?> addQuestion(@RequestBody Question question) {
        Question question1 = questionService.addQuestion(question);
        return ResponseEntity.ok(question1);
    }

    @PutMapping("/")
    public ResponseEntity<?> updateQuestion(@RequestBody Question question) {
        Question question1 = questionService.updateQuestion(question);
        return ResponseEntity.ok(question1);
    }

    @GetMapping("/quiz/{qid}")
    public ResponseEntity<?> getQuestionsOfQuiz(@PathVariable("qid") Long qid) {
        Quiz quiz = quizService.getQuiz(qid);
        Set<Question> questions = quiz.getQuestions();
        List<Question> list = new ArrayList<>(questions);
        if (list.size() > Integer.parseInt(quiz.getNumberOfQuestions())) {
            list = list.subList(0, Integer.parseInt(quiz.getNumberOfQuestions() + 1));
        }
        Collections.shuffle(list);
        return ResponseEntity.ok(list);
    }


    @GetMapping("/quiz/all/{qid}")
    public ResponseEntity<?> getQuestionsOfQuizAdmin(@PathVariable("qid") Long qid) {
        Quiz quiz=new Quiz();
        quiz.setQid(qid);
        Set<Question> questionsofQuiz=questionService.getQuestionsOfQuiz(quiz);
        return ResponseEntity.ok(questionsofQuiz);

    }

    @GetMapping("/{quesid}")
    public ResponseEntity<Question> getQuestion(@PathVariable("quesid") Long quesid) {

        return ResponseEntity.ok(questionService.getQuestion(quesid));
    }

    @DeleteMapping("/{quesid}")
    public void deleteQuestion(@PathVariable("quesid") Long quesid) {
        questionService.deleteQuestion(quesid);
    }

}