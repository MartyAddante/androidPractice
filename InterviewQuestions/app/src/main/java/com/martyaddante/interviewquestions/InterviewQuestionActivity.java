package com.martyaddante.interviewquestions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class InterviewQuestionActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_interview_question);

            TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            resultTextView.setText(CreateList().get(0));

            Button newQuestionButton = (Button) findViewById(R.id.newQuestionBtn);
            newQuestionButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                    String result = (getRandomQuestion(CreateList()));

                    resultTextView.setText(result);
                }
            });

        }

    private String getRandomQuestion(ArrayList<String> questionList) {
        Random rand = new Random();
        int  n = rand.nextInt(questionList.size()-1) + 0;
        return questionList.get(n);
    }






    private ArrayList<String> CreateList() {
        ArrayList<String> BehavioralQuestions = new ArrayList<>();

        BehavioralQuestions.add("Tell me about yourself.");
        BehavioralQuestions.add("What is your greatest strength?");
        BehavioralQuestions.add("What are your goals for the future?");
        BehavioralQuestions.add("What is your greatest weakness?");
        BehavioralQuestions.add("Why should we hire you?");
        BehavioralQuestions.add("What are your salary expectations?");
        BehavioralQuestions.add("Why are you leaving or have left your job?");
        BehavioralQuestions.add("Why do you want this job?");
        BehavioralQuestions.add("How do you handle stress and pressure?");
        BehavioralQuestions.add("Describe a difficult work situation / project and how you overcame it.");
        BehavioralQuestions.add("How do you handle success?");
        BehavioralQuestions.add("How do you handle failure?");
        BehavioralQuestions.add("Do you work well with other people?");
        BehavioralQuestions.add("What can you do better for us than the other applicants?");

        return BehavioralQuestions;
    }
}


