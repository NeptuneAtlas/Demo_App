package com.example.demo_meet1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText editText;
private EditText editEmail;
private Button confirmButton;

String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextText);
      //  output = editText.getText().toString();
        //output = getIntent().getExtras().getString("value");
        //editText.setText(output);
        editEmail = findViewById(R.id.editTextTextEmailAddress);
        confirmButton = (Button) findViewById(R.id.button);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openActivity2();
                Intent intent = new Intent (MainActivity.this, MainActivity2.class);
                output = editText.getText().toString();
                intent.putExtra("value", output);
                startActivity(intent);
                finish();
            }
        });

        editText.addTextChangedListener(loginTextWatcher);
        editEmail.addTextChangedListener(loginTextWatcher);
    }


    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        String userTextInput =  editText.getText().toString().trim();
        String emailTextInput =  editEmail.getText().toString().trim();

        confirmButton.setEnabled(!userTextInput.isEmpty() && !emailTextInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

   // public void openActivity2(){
   //     Intent intent = new Intent (this, MainActivity2.class);
    //    intent.putExtra("value", output);
    //    startActivity(intent);
    //    finish();
    //}


}