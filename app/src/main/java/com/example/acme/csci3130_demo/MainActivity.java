package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void swapText(View view){
        EditText textBox = findViewById(R.id.editText);
        String desiredText = textBox.getText().toString();
        TextView defaultBox = findViewById(R.id.textView);
        defaultBox.setText(desiredText);
        textBox.setText("");
    }
}
