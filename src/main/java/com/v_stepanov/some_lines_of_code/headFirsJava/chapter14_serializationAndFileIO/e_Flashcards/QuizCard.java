package com.v_stepanov.some_lines_of_code.headFirsJava.chapter14_serializationAndFileIO.e_Flashcards;

/**
 * Created by User on 19.09.2017.
 */
public class QuizCard {

    private String answer;
    private String question;

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public QuizCard(String a, String q) {
        this.answer = a;
        this.question = q;
    }
}
