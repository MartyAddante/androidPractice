package com.martyaddante.interviewquestions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView behavioral = (TextView)findViewById(R.id.behavioral);

        behavioral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent behaviorIntent = new Intent(MainActivity.this, InterviewQuestionActivity.class);

                startActivity(behaviorIntent);
            }
        });

        TextView technical = (TextView) findViewById(R.id.technical);

        technical.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent technicalIntent = new Intent(MainActivity.this, TechnicalQuestionsActivity.class);

                startActivity(technicalIntent);
            }
        });
    }






/*
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button newQuestionBtn = (Button) findViewById(R.id.newQuestionBtn);
            newQuestionBtn.setOnClickListener(new View.OnClickListener() {
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

        BehavioralQuestions.add("What are your goals for the future?");
        BehavioralQuestions.add("What is your greatest strength?");
        BehavioralQuestions.add("Tell me about yourself.");
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
    }*/
}

