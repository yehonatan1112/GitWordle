package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignUp extends AppCompatActivity {

    private EditText etfirstname, etlastname, etemail, etid,etpassword;
    private Button btnInsert;
    private DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etfirstname = (EditText)findViewById(R.id.firstname);
        etlastname = (EditText)findViewById(R.id.lastname);
        etemail = (EditText)findViewById(R.id.email);
        etid = (EditText)findViewById(R.id.id);
        etpassword = (EditText) findViewById(R.id.password);
        btnInsert=(Button) findViewById(R.id.btnInsert);
        dbHandler = new DBHandler(SignUp.this);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstname = etfirstname.getText().toString();
                String lastname = etlastname.getText().toString();
                String email = etemail.getText().toString();
                String id = etid.getText().toString();
                String password = etpassword.getText().toString();

                if (firstname.isEmpty() && lastname.isEmpty() && email.isEmpty() && id.isEmpty()&&password.isEmpty()) {
                    Toast.makeText(SignUp.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }

                dbHandler.addNewUser(id, firstname.toLowerCase(), lastname, email,password);
                Intent i = new Intent(SignUp.this, MainActivity.class);
                Toast.makeText(SignUp.this, "User has been added.", Toast.LENGTH_SHORT).show();
                etfirstname.setText("");
                etlastname.setText("");
                etemail.setText("");
                etid.setText("");
                etpassword.setText("");
                startActivity(i);

            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id==R.id.action_login)
        {
            Intent intent = new Intent(SignUp.this, Login.class);
            startActivity(intent);
        }
        if(id==R.id.action_Credits)
        {
            Intent intent = new Intent(SignUp.this, Credits.class);
            startActivity(intent);
        }
        if(id==R.id.action_Main)
        {
            Intent intent = new Intent(SignUp.this, MainActivity.class);
            startActivity(intent);
        }
        if(id==R.id.action_Settings)
        {
            Intent intent = new Intent(SignUp.this, Settings.class);
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