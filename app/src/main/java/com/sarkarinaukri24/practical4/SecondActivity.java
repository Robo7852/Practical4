package com.sarkarinaukri24.practical4;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Dialog dialog;
    private Button ShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent in = getIntent();

        ShowDialog = findViewById(R.id.logout_btn);

        //Create the Dialog here
        dialog = new Dialog(this);

        dialog.setContentView(R.layout.custom_layout);
        dialog.setCancelable(false);

        Button YesBtn = dialog.findViewById(R.id.Yes_btn);
        Button noBtn = dialog.findViewById(R.id.No_btn);
        //dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //Setting the animations to dialog

        ShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.show(); // Showing the dialog here
            }
        });


        YesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });





    }


    public void onBackPressed() {
        Dialog customDialog = new Dialog(this);

        customDialog.setContentView(R.layout.custom_layout);
        customDialog.setCancelable(false);

        Button YesBtn = customDialog.findViewById(R.id.Yes_btn);
        Button noBtn = customDialog.findViewById(R.id.No_btn);

        YesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondActivity.super.onBackPressed();
            }


        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog.cancel();
            }


        });
        customDialog.show();
    }
}