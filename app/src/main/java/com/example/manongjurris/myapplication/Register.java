package com.example.manongjurris.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Manong Jurris on 11/19/2016.
 */
public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText regNumber = (EditText)findViewById(R.id.editText3);
        final EditText regPassword = (EditText)findViewById(R.id.editText4);
        final EditText regPassword_retype = (EditText)findViewById(R.id.editText5);
        final CheckBox regCheckbox = (CheckBox)findViewById(R.id.checkBox);
        Button regButton = (Button)findViewById(R.id.button3);


        regButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(regNumber.getText().toString().matches("") || regPassword.getText().toString().matches("") || regPassword_retype.getText().toString().matches("") ) {
                    Toast.makeText(getBaseContext(), "Input Required", Toast.LENGTH_LONG).show();
                }else if(!regCheckbox.isChecked()){
                    Toast.makeText(getBaseContext(), "You'll not be able to use Emergency Text!", Toast.LENGTH_LONG).show();
                }else{
                    if(regPassword.getText().toString().equals(regPassword_retype.getText().toString())){
                        Toast.makeText(getBaseContext(), "Congratulations!!", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getBaseContext(), ChoosePage.class);
                        finish();
                        startActivity(i);
                    }else{
                        regPassword_retype.setError("Passwords didn't match!");
                    }

                }
            }
        });
    }


}
