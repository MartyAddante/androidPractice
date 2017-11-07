package com.martyaddante.interviewquestions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class TechnicalQuestionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_questions);

        TextView technicalTextView = (TextView) findViewById(R.id.technicalTextView);
        technicalTextView.setText(getRandomTechnical(TechnicalList()));
      /*TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            resultTextView.setText(CreateList().get(0));*/


        Button newTechnicalButton = (Button) findViewById(R.id.newTechnicalBtn);
            newTechnicalButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    TextView technicalTextView = (TextView) findViewById(R.id.technicalTextView);

                    String result = (getRandomTechnical(TechnicalList()));

                    technicalTextView.setText(result);
                }
            });

        }

    private String getRandomTechnical(ArrayList<String> questionList) {
        Random rand = new Random();
        int  n = rand.nextInt(questionList.size()-1) + 0;
        return questionList.get(n);
    }






    private ArrayList<String> TechnicalList() {
        ArrayList<String> BehavioralQuestions = new ArrayList<>();

        BehavioralQuestions.add("Name the principles of OOP?");
        BehavioralQuestions.add("What is Abstraction?");
        BehavioralQuestions.add("What is Encapsulation?");
        BehavioralQuestions.add("What is Polymorphism?");
        BehavioralQuestions.add("What is Inheritance?");
        BehavioralQuestions.add("What is the difference between html, css, and Javascript?");
        BehavioralQuestions.add("What is a join?");
        BehavioralQuestions.add("What is a subquery?");
        BehavioralQuestions.add("What's a Dictionary?");
        BehavioralQuestions.add("Describe a Stack.");
        BehavioralQuestions.add("What's the difference between a stack and a queue?");
        BehavioralQuestions.add("What is a Hashset?");
        BehavioralQuestions.add("Tell me the difference between an array and a list.");
        BehavioralQuestions.add("Describe the MVC pattern");
        BehavioralQuestions.add("What projects have you worked on?");
        BehavioralQuestions.add("Which technology or concept has given you the most trouble and why?");
        BehavioralQuestions.add("What technologies have you used");
        BehavioralQuestions.add("What have you learned?");
        BehavioralQuestions.add("What have you taught yourself?");


        return BehavioralQuestions;
    }
}

