package com.example.demo_meet1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity33 extends AppCompatActivity {


    private Button Button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);




        Button11 = (Button) findViewById(R.id.button2);

        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  super.onBackPressed();

                //setContentView(R.layout.activity_main2);

              // Intent intent = new Intent (MainActivity33.this, MainActivity2.class);
               //startActivity(intent);
               // onBackPressed();
                finish();

            }
        });



    }
}