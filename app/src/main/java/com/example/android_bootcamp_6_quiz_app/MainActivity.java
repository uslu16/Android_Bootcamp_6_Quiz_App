package com.example.android_bootcamp_6_quiz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textId;
    Button trueId;
    Button falseId;
    int question;
    int questionIndex;
   ProgressBar pBarId;

    private TrueFalse[] mQuestionBank = new TrueFalse[] {
            new TrueFalse(R.string.question_1, true),
            new TrueFalse(R.string.question_2, true),
            new TrueFalse(R.string.question_3, true),
            new TrueFalse(R.string.question_4, true),
            new TrueFalse(R.string.question_5, true),
            new TrueFalse(R.string.question_6, false),
            new TrueFalse(R.string.question_7, true),
            new TrueFalse(R.string.question_8, false),
            new TrueFalse(R.string.question_9, true),
            new TrueFalse(R.string.question_10, true),
            new TrueFalse(R.string.question_11, false),
            new TrueFalse(R.string.question_12, false),
            new TrueFalse(R.string.question_13,true)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pBarId= findViewById(R.id.pBarId);


        textId= findViewById(R.id.textId);
       questionIndex =0;
        question = mQuestionBank[questionIndex].getmQuestionId();
        textId.setText( question);

        textId=findViewById(R.id.textId);

        trueId = findViewById(R.id.trueId);
        falseId = findViewById(R.id.falseId);

        falseId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextQuestion();
                Toast.makeText(MainActivity.this, "falseId", Toast.LENGTH_SHORT).show();
            }
        });

        trueId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextQuestion();
                Toast.makeText(MainActivity.this, "True", Toast.LENGTH_SHORT).show();
            }
        });


        TrueFalse questionTemplate = new TrueFalse( R.string.question_1, true) ;






    }

    private void nextQuestion() {
        questionIndex= (questionIndex +1) % mQuestionBank.length  ;
        question = mQuestionBank[questionIndex].getmQuestionId();
        textId.setText( question);
        pBarId.incrementProgressBy(8);


    }



}
