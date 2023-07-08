package com.example.demo_meet1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

     TextView editText2;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText2 = findViewById(R.id.editTextText2);
        output=getIntent().getExtras().getString("value");
        editText2.setText("Hello " + output);
       // editText2.setText("Hello " + editText.getText());
    }
}