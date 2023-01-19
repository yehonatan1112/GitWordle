package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Modes extends AppCompatActivity {

    Button WordGame,HeWordGame,GlobGame,FootGame,NBAGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);

        WordGame = (Button) findViewById(R.id.WordsMode);
        HeWordGame = (Button) findViewById(R.id.HebrewMode);
        GlobGame = (Button) findViewById(R.id.WorldMode);
        FootGame = (Button) findViewById(R.id.FootballMode);
        NBAGame = (Button) findViewById(R.id.NBAMode);

        WordGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this, WordGame.class);
                    startActivity(intent);
                }
            });
        HeWordGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this, HebWordGame.class);
                    startActivity(intent);
                }
            });
        GlobGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this, GlobalGame.class);
                    startActivity(intent);
                }
            });
        FootGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this,FootballGame.class);
                    startActivity(intent);
                }
            });
        NBAGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this,NBAGame.class);
                    startActivity(intent);
                }
            });
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id==R.id.action_Modes)
        {
            Intent intent = new Intent(Modes.this, Modes.class);
            startActivity(intent);
        }
        if(id==R.id.action_Credits)
        {
            Intent intent = new Intent(Modes.this, Credits.class);
            startActivity(intent);
        }
        if(id==R.id.action_EditUser)
        {
            Intent intent = new Intent(Modes.this, EditUser.class);
            startActivity(intent);
        }
        if(id==R.id.action_LogOut)
        {
            Intent intent = new Intent(Modes.this, MainActivity.class);
            startActivity(intent);
        }
        if(id==R.id.action_Settings)
        {
            Intent intent = new Intent(Modes.this, Settings.class);
            startActivity(intent);
        }
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_logged_main,menu);
        return true;
    }
}