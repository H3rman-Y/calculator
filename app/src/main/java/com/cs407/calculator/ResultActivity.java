package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class ResultActivity extends AppCompatActivity {
    TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultTextView = findViewById(R.id.resultTextView);
        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        resultTextView.setText("Result: " + result);
    }
}
