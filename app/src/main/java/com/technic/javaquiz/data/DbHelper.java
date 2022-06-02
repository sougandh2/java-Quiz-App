package com.technic.javaquiz.data;
import java.util.ArrayList;
import java.util.List;

import com.technic.javaquiz.Question;


public class DbHelper  {

    public List<Question> ques = new ArrayList<Question>();
    private void addQuestions()
    {
        Question q1=new Question("1. Which of the following option leads to the portability and security of Java?", "a)Bytecode is executed by JVM ", "b)The applet makes the Java code secure and portable", "c)Use of exception handling", "d)Dynamic binding between objects", "a)Bytecode is executed by the JVM.");
        this.addQuestion(q1);
        Question q2=new Question("2. Which of the following is not a Java features?","a)Dynamic","b)Architecture Neutral","c)Use of pointers","d)Object-oriented","c)Use of pointers");
        this.addQuestion(q2);
        Question q3=new Question("3.The \u0021 article referred to as a","a)Unicode escape sequence","b)Octal escape","c)Hexadecimal","d)Line feed","a)Unicode escape sequence" );
        this.addQuestion(q3);
        Question q4=new Question("4. _____ is used to find and fix bugs in the Java programs.","a)JVM","b)JRE","c)JDK","d)JDB","d)JDB");
        this.addQuestion(q4);
        Question q5=new Question("5. What is the return type of the hashCode() method in the Object class?","a)object","b)int","c)long","d)void","b)int");
        this.addQuestion(q5);
    }
    public void addQuestion(Question quest) {
        ques.add(quest);
    }
    public List<Question> getAllQuestions() {
        return ques;
    }

}