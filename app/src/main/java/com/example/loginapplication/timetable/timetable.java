package com.example.loginapplication.timetable;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;

import com.example.loginapplication.R;


public class timetable extends AppCompatActivity {
SwitchCompat switch1;
CardView monday,tuesday,wednesday,thursday,friday,saturday,sunday;
TextView trancourse;
    String transfercoursename;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        monday=findViewById(R.id.monday);
        tuesday=findViewById(R.id.tuesday);
        wednesday=findViewById(R.id.wednesday);
        thursday=findViewById(R.id.thursday);
        friday=findViewById(R.id.friday);
        saturday=findViewById(R.id.saturday);
        sunday=findViewById(R.id.sunday);
        trancourse=(TextView)findViewById(R.id.trancourse);
    transfercoursename=getIntent().getExtras().getString("Value");
        trancourse.setText(transfercoursename);


    monday.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(timetable.this, tuesdaydetailsActivity.class);
            startActivity(intent);
            transfercoursename=trancourse.getText().toString();
            String day="monday";

            intent.putExtra("Value",transfercoursename);
            intent.putExtra("Value1",day);
            startActivity(intent);
        }
    });



        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(timetable.this, tuesdaydetailsActivity.class);
                startActivity(intent);
                transfercoursename=trancourse.getText().toString();
                String day="tuesday";
                intent.putExtra("Value",transfercoursename);
                intent.putExtra("Value1",day);
                startActivity(intent);
            }
        });
    wednesday.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(timetable.this, tuesdaydetailsActivity.class);
            startActivity(intent);
            transfercoursename=trancourse.getText().toString();
            String day="wednesday";
            intent.putExtra("Value",transfercoursename);
            intent.putExtra("Value1",day);
            startActivity(intent);
        }
    });
    thursday.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(timetable.this, tuesdaydetailsActivity.class);
            startActivity(intent);
            transfercoursename=trancourse.getText().toString();
            String day="thursday";
            intent.putExtra("Value",transfercoursename);
            intent.putExtra("Value1",day);
            startActivity(intent);
        }
    });
    friday.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(timetable.this, tuesdaydetailsActivity.class);
            startActivity(intent);
            transfercoursename=trancourse.getText().toString();
            String day="friday";
            intent.putExtra("Value",transfercoursename);
            intent.putExtra("Value1",day);
            startActivity(intent);
        }
    });
    saturday.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(timetable.this, tuesdaydetailsActivity.class);
            startActivity(intent);
            transfercoursename=trancourse.getText().toString();
            String day="saturday";
            intent.putExtra("Value",transfercoursename);
            intent.putExtra("Value1",day);
            startActivity(intent);
        }
    });
    sunday.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(timetable.this, tuesdaydetailsActivity.class);
            startActivity(intent);
            transfercoursename=trancourse.getText().toString();
            String day="sunday";
            intent.putExtra("Value",transfercoursename);
            intent.putExtra("Value1",day);
            startActivity(intent);
        }
    });
    }
}
