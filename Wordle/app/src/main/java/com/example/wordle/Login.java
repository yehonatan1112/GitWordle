package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText etpassword,etfirstname;
    Button btnLogin;
    private DBHandler dbHandler;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etpassword=findViewById(R.id.password);
        etfirstname=findViewById(R.id.firstname);
        btnLogin=findViewById(R.id.btnLogin);
        dbHandler = new DBHandler(Login.this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstname = etfirstname.getText().toString();
                String password = etpassword.getText().toString();

              if(dbHandler.login(firstname,password))
                {
                    Toast.makeText(Login.this, "You Have Logged In", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Login.this, LoggedMainActivity.class);
                    i.putExtra("Name",firstname.toString());
                   startActivity(i);
                }
                else
                {
                    Toast.makeText(Login.this, "Try Again...", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id==R.id.action_Credits)
        {
            Intent intent = new Intent(Login.this, Credits.class);
            startActivity(intent);
        }
        if(id==R.id.action_Main)
        {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }
        if(id==R.id.action_Settings)
        {
            Intent intent = new Intent(Login.this, Settings.class);
            startActivity(intent);
        }
        if(id==R.id.action_SignUp)
        {
            Intent intent = new Intent(Login.this, SignUp.class);
            startActivity(intent);
        }
        return true;
    }
}