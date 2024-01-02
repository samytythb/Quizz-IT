package com.Iter.reponsitory;
import com.Iter.model.Tech.exam.Question;
import com.Iter.model.Tech.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question,Long> {

    Set<Question> findByQuiz(Quiz quiz);
}
