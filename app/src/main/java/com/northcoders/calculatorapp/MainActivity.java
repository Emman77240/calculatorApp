package com.northcoders.calculatorapp;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        // Set onClick listeners for math addition operation button
        Button addButton = findViewById(R.id.add);
        addButton.setOnClickListener(v -> {
            double result = Double.parseDouble(numberInput1.getText().toString()) + Double.parseDouble(numberInput2.getText().toString());

            // Format and display result from calculation
            DecimalFormat df = new DecimalFormat("#.##");
            resultTextView.setText(String.format("Result: %s", df.format(result)));
        });

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}