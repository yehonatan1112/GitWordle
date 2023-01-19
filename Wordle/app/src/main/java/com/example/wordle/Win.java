package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Win extends AppCompatActivity {
    Button btn;
    TextView MassageView;
    String Massage="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        btn=(Button) findViewById(R.id.playagainwinbtn);
        MassageView=(TextView) findViewById(R.id.WinMassage);
            Massage="Good Job! \n The Correct Answer Was '"+ getIntent().getStringExtra("CorrectWord").toUpperCase()+"'";
        MassageView.setText(Massage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Win.this,Modes.class);
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
            Intent intent = new Intent(Win.this, Modes.class);
            startActivity(intent);
        }
        if(id==R.id.action_Credits)
        {
            Intent intent = new Intent(Win.this, Credits.class);
            startActivity(intent);
        }
        if(id==R.id.action_EditUser)
        {
            Intent intent = new Intent(Win.this, EditUser.class);
            startActivity(intent);
        }
        if(id==R.id.action_LogOut)
        {
            Intent intent = new Intent(Win.this, MainActivity.class);
            startActivity(intent);
        }
        if(id==R.id.action_Settings)
        {
            Intent intent = new Intent(Win.this, Settings.class);
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