package com.northcoders.calculatorapp;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // Declare variables to hold UI elements
    private EditText numberInput1;
    private EditText numberInput2;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize UI elements from app layout
        numberInput1 = findViewById(R.id.editTextNumber);
        numberInput2 = findViewById(R.id.editTextNumber2);
        resultTextView = findViewById(R.id.textView);

        // Set onClick listener to calculate input values
        Button addButton = findViewById(R.id.add);
        addButton.setOnClickListener(v -> {

            // Get user input values
            String numberInputOne = numberInput1.getText().toString();
            String numberInputTwo = numberInput2.getText().toString();

            // Check user input for empty values
            if(numberInputOne.isEmpty() || numberInputTwo.isEmpty()) resultTextView.setText(R.string.user_input_warning_for_empty_values);

            // Calculate sum of input values
            double result = Double.parseDouble(numberInputOne) + Double.parseDouble(numberInputTwo);

            // Format and display result from calculation
            DecimalFormat df = new DecimalFormat("#.##");
            resultTextView.setText(String.format("Result: %s", df.format(result)));
        });


    }
}