package com.example.myapplication.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class GameActivity extends AppCompatActivity {

    private TextView mQuestionTextView;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionTextView = findViewById(R.id.game_activity_textview_question);
        mButton1 = findViewById(R.id.game_activity_button_1);
        mButton2 = findViewById(R.id.game_activity_button_2);
        mButton3 = findViewById(R.id.game_activity_button_3);
        mButton4 = findViewById(R.id.game_activity_button_4);


    }
}