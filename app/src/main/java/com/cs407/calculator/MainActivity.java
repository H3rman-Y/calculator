package com.cs407.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputText1, inputText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText1 = findViewById(R.id.number1EditText);
        inputText2 = findViewById(R.id.number2EditText);
    }
    public void calculateResult(View view) {
        String input1 = inputText1.getText().toString();
        String input2 = inputText2.getText().toString();
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int result = 0;
        //action of add, subtract, multiply and divide
        if (view.getId() == R.id.addButton) {
            result = num1 + num2;
        } else if (view.getId() == R.id.subtractButton) {
            result = num1 - num2;
        } else if (view.getId() == R.id.multiplyButton) {
            result = num1 * num2;
        } else if (view.getId() == R.id.divideButton) {
            if (num2 == 0) {
                Toast.makeText(this, "Invalid input cannot be divided by 0", Toast.LENGTH_SHORT).show();
                return;
            }
            result = num1 / num2;
        }
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", String.valueOf(result));
        startActivity(intent);
    }
}
