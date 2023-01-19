package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class WordGame extends AppCompatActivity {
    private Board boardGame;
    private FrameLayout frm;
    EditText editText;
    Button btn;
    TextView Answer;
    public int numberofGuesses;
    Words Word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_game);
        boardGame = new Board(this,true,false);
        frm =findViewById(R.id.frm);
        frm.addView(boardGame);
        Answer=findViewById(R.id.Correct);
        numberofGuesses=0;
        editText=findViewById(R.id.Guess);
        Word = new Words();
        String CorrectWord = Word.GetChosenWord();
        btn=findViewById(R.id.btnGuess);
        Answer.setText(CorrectWord);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Guess = editText.getText().toString().toUpperCase();
                if (Word.isWordReal(Guess)) {
                    if (Guess.isEmpty() || Guess.length() != 5) {
                        Toast.makeText(WordGame.this, "Only 5 letters long", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        numberofGuesses++;
                        if (numberofGuesses < 6) {
                            boardGame.onSubmitGuess(Guess, numberofGuesses-1, CorrectWord.toLowerCase());
                            if (boardGame.isCorrect()) {
                                Intent intent = new Intent(WordGame.this, Win.class);
                                intent.putExtra("CorrectWord",CorrectWord);
                                startActivity(intent);
                            }
                            editText.setText(" ");
                            closeKeyboard();
                        } else {
                            Intent intent = new Intent(WordGame.this, Lose.class);
                            intent.putExtra("CorrectWord",CorrectWord);
                            startActivity(intent);
                        }
                    }
                }
                else {
                    Toast.makeText(WordGame.this, "Only Existing Words", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }

    private void closeKeyboard()
    {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager manager
                    = (InputMethodManager)
                    getSystemService(
                            Context.INPUT_METHOD_SERVICE);
            manager
                    .hideSoftInputFromWindow(
                            view.getWindowToken(), 0);
        }
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id==R.id.action_Modes)
        {
            Intent intent = new Intent(WordGame.this, Modes.class);
            startActivity(intent);
        }
        if(id==R.id.action_Credits)
        {
            Intent intent = new Intent(WordGame.this, Credits.class);
            startActivity(intent);
        }
        if(id==R.id.action_EditUser)
        {
            Intent intent = new Intent(WordGame.this, EditUser.class);
            startActivity(intent);
        }
        if(id==R.id.action_LogOut)
        {
            Intent intent = new Intent(WordGame.this, MainActivity.class);
            startActivity(intent);
        }
        if(id==R.id.action_Settings)
        {
            Intent intent = new Intent(WordGame.this, Settings.class);
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
