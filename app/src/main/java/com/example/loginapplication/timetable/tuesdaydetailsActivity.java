package com.example.loginapplication.timetable;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginapplication.MainActivity;
import com.example.loginapplication.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class tuesdaydetailsActivity extends AppCompatActivity {
    private List<ListDatatuesday> listDatatuesdays;
    private RecyclerView rv;
    private MyAdaptertuesday adapter;
    String dbpath;
    String childpath;
    private long pressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesdaydetails);
        rv = (RecyclerView) findViewById(R.id.recyclerview);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        listDatatuesdays = new ArrayList<>();
      dbpath=getIntent().getExtras().getString("Value");
      childpath=getIntent().getExtras().getString("Value1");

        final DatabaseReference nm = FirebaseDatabase.getInstance().getReference(dbpath).child(childpath);
        nm.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                if (dataSnapshot.exists()) {
                    for (DataSnapshot npsnapshot : dataSnapshot.getChildren()) {
                        ListDatatuesday l = npsnapshot.getValue(ListDatatuesday.class);
                        listDatatuesdays.add(l);

                    }
                    adapter = new MyAdaptertuesday(listDatatuesdays);
                    rv.setAdapter(adapter);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(tuesdaydetailsActivity.this, MainActivity.class);

        startActivity(intent);
    }
}

