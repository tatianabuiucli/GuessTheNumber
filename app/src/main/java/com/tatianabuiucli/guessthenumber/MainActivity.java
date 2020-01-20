package com.tatianabuiucli.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int number;

    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void generateRandomNumber(View view){

        EditText userInput = (EditText)findViewById(R.id.userInput);
        int userGuess = Integer.parseInt(userInput.getText().toString());

        if(userGuess > number){
           makeToast("Lower");
        } else if(userGuess < number){
            makeToast("Higher");
        } else {
            makeToast("Correct!");
            Random rand = new Random();
            number = rand.nextInt(20)+1;
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        number = rand.nextInt(20)+1;
    }

}
