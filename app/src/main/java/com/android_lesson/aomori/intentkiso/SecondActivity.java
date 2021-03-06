package com.android_lesson.aomori.intentkiso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String event_date = intent.getStringExtra("event_date");
        String event_name = intent.getStringExtra("event_name");
        int lucky_number = intent.getIntExtra("lucky_number", 0);

        Toast.makeText(getApplicationContext(), event_date + ":" + event_name + ":" + lucky_number, Toast.LENGTH_SHORT).show();
    }
}
