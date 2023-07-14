package com.example.demo_meet1;


import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.demo_meet1.databinding.ActivityMainBinding;
import com.example.demo_meet1.databinding.ActivityMainBinding;
//import com.example.invgrowfinal.databinding.*MainActivity*Binding;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

     TextView editText2;
    ListView list;
    String output;
    private Button Button1, Button2, Button3, Button4;
   // ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main2); //R.layout.activity_main2    binding.getRoot

        editText2 = findViewById(R.id.editTextText2);
        output=getIntent().getExtras().getString("value");
        editText2.setText("Hello " + output);
       // editText2.setText("Hello " + editText.getText());

        int[] ImageId = {R.drawable.dd, R.drawable.download, R.drawable.career, R.drawable.sss};
        String[] name = {"Arcade Showdown", "All You Can Eat", "Career Convo", "Skaters Place"}; //, "Career Convo", "Skaters Place"
        String[] date = {"9:05 PM", "11:30 AM" , "10:10 AM", "1:00 PM"}; //, "10:10 AM", "1:00 PM"

        list = (ListView) findViewById(R.id.listview22);
        ListAdapter listAdapter = new ListAdapter(getApplicationContext(), name, date, ImageId);
        list.setAdapter(listAdapter);


        Button1 = (Button) findViewById(R.id.button5);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity2.this, MainActivity33.class);
                startActivity(intent);
                finish();
            }
        });

        Button2 = (Button) findViewById(R.id.button6);

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity2.this, MainActivity44.class);
                startActivity(intent);
                finish();
            }
        });






        Button3 = (Button) findViewById(R.id.button7);

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity2.this, MainActivity66.class);
               startActivity(intent);
                finish();
            }
        });


        Button4 = (Button) findViewById(R.id.button8);

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity2.this, MainActivity55.class);
                startActivity(intent);
                finish();
            }
        });

       // ArrayList<Events>eventsArrayList = new ArrayList<>();

       // for(int i = 0; i < ImageId.length; i++){
        //    Events events = new Events(name[i], date[i], ImageId[i]);
       //     eventsArrayList.add(events);
       // }

       // ListAdapter listAdapter = new ListAdapter(MainActivity2.this, eventsArrayList);
       // binding.listview22.setAdapter(listAdapter);
      //  binding.listview22.setClickable(true);
    }
}