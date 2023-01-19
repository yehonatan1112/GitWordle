package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id==R.id.action_login)
        {
            Intent intent = new Intent(Credits.this, Login.class);
            startActivity(intent);
        }
        if(id==R.id.action_Main)
        {
            Intent intent = new Intent(Credits.this, MainActivity.class);
            startActivity(intent);
        }
        if(id==R.id.action_Settings)
        {
            Intent intent = new Intent(Credits.this, Settings.class);
            startActivity(intent);
        }
        if(id==R.id.action_SignUp)
        {
            Intent intent = new Intent(Credits.this, SignUp.class);
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