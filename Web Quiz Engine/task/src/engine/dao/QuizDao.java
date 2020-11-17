package engine.dao;

import engine.model.Answer;
import engine.model.Question;
import engine.model.QuestionNoAnswer;
import java.util.List;


public interface QuizDao {

    List<QuestionNoAnswer> getAllQuestions();

    Answer getAnswer(Integer id, Integer answer);

    QuestionNoAnswer insertQuestion(Question question);

    QuestionNoAnswer getQuestionById(int id);
}
