package com.example.wordle;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditUser extends AppCompatActivity {

    private EditText etUpdateEmail, etDeleteEmail, etOldPassword, etNewPassword;
    private Button updateUserBtn, deleteUserBtn;
    private DBHandler dbHandler;
    String updateEmail, deleteEmail, oldPassword, newPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);

        etUpdateEmail = findViewById(R.id.emailupdate);
        etDeleteEmail = findViewById(R.id.emailDelete);
        etOldPassword = findViewById(R.id.oldpassword);
        etNewPassword = findViewById(R.id.newpassword);
        updateUserBtn = findViewById(R.id.btnUpdate);
        deleteUserBtn = findViewById(R.id.btnDelete);

        dbHandler = new DBHandler(EditUser.this);

        updateEmail = getIntent().getStringExtra("email");
        deleteEmail = getIntent().getStringExtra("email");
        oldPassword = getIntent().getStringExtra("password");
        newPassword = getIntent().getStringExtra("password");


        etUpdateEmail.setText(updateEmail);
        etDeleteEmail.setText(deleteEmail);
        etOldPassword.setText(oldPassword);
        etNewPassword.setText(newPassword);

        updateUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbHandler.updateUser(oldPassword, updateEmail,newPassword);

                Toast.makeText(EditUser.this, "User Updated..", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(EditUser.this, LoggedMainActivity.class);
                startActivity(i);
            }
        });

        deleteUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHandler.deleteUser(deleteEmail);
                Toast.makeText(EditUser.this, "User Deleted", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(EditUser.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id==R.id.action_Modes)
        {
            Intent intent = new Intent(EditUser.this, Modes.class);
            startActivity(intent);
        }
        if(id==R.id.action_Credits)
        {
            Intent intent = new Intent(EditUser.this, Credits.class);
            startActivity(intent);
        }
        if(id==R.id.action_EditUser)
        {
            Intent intent = new Intent(EditUser.this, EditUser.class);
            startActivity(intent);
        }
        if(id==R.id.action_LogOut)
        {
            Intent intent = new Intent(EditUser.this, MainActivity.class);
            startActivity(intent);
        }
        if(id==R.id.action_Settings)
        {
            Intent intent = new Intent(EditUser.this, Settings.class);
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