package com.sarkarinaukri24.practical4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText)findViewById(R.id.editTextTextEmailAddress);
        Password = (EditText)findViewById(R.id.editTextTextPassword);
        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userAdmin="Admin";
                String password="123";
                String getUser = Email.getText().toString();
                String getPass = Password.getText().toString();
                if(userAdmin.equals(getUser) && password.equals(getPass))
                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                            startActivity(intent);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_LONG).show();
                }
            }


        });
            }



}