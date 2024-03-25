package com.example.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aplikasikalkulator.R;

public class MainActivity extends AppCompatActivity {
    EditText etNumber1, etNumber2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.et_input_number_1);
        etNumber2 = findViewById(R.id.et_input_number_2);
        result = findViewById(R.id.tv_result_number_operations);
    }

    public void plus(View v) {
        double number1 = Double.parseDouble(etNumber1.getText().toString());
        double number2 = Double.parseDouble(etNumber2.getText().toString());
        double sum = number1 + number2;
        result.setText(String.valueOf(sum));
    }

    public void minus(View v) {
        double number1 = Double.parseDouble(etNumber1.getText().toString());
        double number2 = Double.parseDouble(etNumber2.getText().toString());
        double difference = number1 - number2;
        result.setText(String.valueOf(difference));
    }

    public void multiplied(View v) {
        double number1 = Double.parseDouble(etNumber1.getText().toString());
        double number2 = Double.parseDouble(etNumber2.getText().toString());
        double product = number1 * number2;
        result.setText(String.valueOf(product));
    }

    public void divided(View v) {
        double number1 = Double.parseDouble(etNumber1.getText().toString());
        double number2 = Double.parseDouble(etNumber2.getText().toString());
        if (number2 != 0) {
            double quotient = number1 / number2;
            result.setText(String.valueOf(quotient));
        } else {
            result.setText("Cannot divide by zero");
        }
    }
}
