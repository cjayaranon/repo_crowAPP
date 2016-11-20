package com.example.manongjurris.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//import android.view.View.OnClickListener;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LoginBtn = (Button)findViewById(R.id.button2);
        Button RegisterBtn = (Button)findViewById(R.id.button);
        final EditText userNumber = (EditText)findViewById(R.id.editText);
        final EditText userPassword = (EditText)findViewById(R.id.editText2);

        LoginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(userNumber.getText().toString().equals("8888") && userPassword.getText().toString().equals("admin")) {
                    Intent androidsolved_intent = new Intent(getApplicationContext(), ChoosePage.class);
                    startActivity(androidsolved_intent);
                    finish();
                }
                else{
                    userPassword.setError("Username or Password Incorrect!");
                }
            }
        });

        RegisterBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                    Intent androidsolved_intent = new Intent(getApplicationContext(), Register.class);
                    startActivity(androidsolved_intent);
                    finish();
            }
        });

    }
}
