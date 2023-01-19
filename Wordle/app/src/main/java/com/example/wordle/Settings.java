package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

public class Settings extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id==R.id.action_login)
        {
            Intent intent = new Intent(Settings.this, Login.class);
            startActivity(intent);
        }
        if(id==R.id.action_Credits)
        {
            Intent intent = new Intent(Settings.this, Credits.class);
            startActivity(intent);
        }
        if(id==R.id.action_Main)
        {
            Intent intent = new Intent(Settings.this, MainActivity.class);
            startActivity(intent);
        }
        if(id==R.id.action_SignUp)
        {
            Intent intent = new Intent(Settings.this, SignUp.class);
            startActivity(intent);
        }
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}