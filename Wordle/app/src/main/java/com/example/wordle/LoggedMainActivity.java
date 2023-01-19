package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoggedMainActivity extends AppCompatActivity {

    Button EditUser,Play,LogOut;
    ImageButton Credits,Settings;
    TextView UserName;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_main);
        EditUser=findViewById(R.id.EditUserbtn);
        Credits = (ImageButton) findViewById(R.id.creditsbtn);
        Settings = (ImageButton) findViewById(R.id.settingsbtn);
        Play = (Button) findViewById(R.id.playbtn);
        LogOut = (Button) findViewById(R.id.LogOutbtn);
        UserName=(TextView) findViewById(R.id.UserName);
        name="Hello "+getIntent().getStringExtra("Name");
        UserName.setText(name);
        EditUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedMainActivity.this,EditUser.class);
                startActivity(intent);
            }
        });
        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedMainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedMainActivity.this, Credits.class);
                startActivity(intent);
            }
        });
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedMainActivity.this, Settings.class);
                startActivity(intent);
            }
        });
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedMainActivity.this,Modes.class);
                startActivity(intent);
            }
        });
    }
}