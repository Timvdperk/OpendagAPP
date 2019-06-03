package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test14 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int RMIscore2 = 0;

    public static boolean Clicked53 = false;
    public static boolean Clicked54 = false;
    public static boolean Clicked55 = false;
    public static boolean Clicked56 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test14);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked53 || Clicked54 || Clicked55 || Clicked56){
                    if (Clicked53) {
                        NextPage();
                    }else if (Clicked54) {
                        Clicked53 = true;
                        Clicked54 = false;
                        RMIscore2 = RMIscore2 -2;
                        NextPage();
                    }else if (Clicked55){
                        Clicked53 = true;
                        Clicked55 = false;
                        RMIscore2 = RMIscore2 -3;
                        RMIscore2 = RMIscore2 -2;
                        NextPage();
                    }else {
                        Clicked53 = true;
                        Clicked56 = false;
                        RMIscore2 = RMIscore2 -6;
                        RMIscore2 = RMIscore2 -2;
                        NextPage();
                    }
                }else {
                    Clicked53 = true;
                    RMIscore2 = RMIscore2 -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked53 || Clicked54 || Clicked55 || Clicked56){
                    if (Clicked54) {
                        NextPage();
                    }else if (Clicked53) {
                        Clicked54 = true;
                        Clicked53 = false;
                        RMIscore2 = RMIscore2 +2;
                        NextPage();
                    }else if (Clicked55){
                        Clicked54 = true;
                        Clicked55 = false;
                        RMIscore2 = RMIscore2 -3;
                        NextPage();
                    }else {
                        Clicked54 = true;
                        Clicked56 = false;
                        RMIscore2 = RMIscore2 -6;
                        NextPage();
                    }
                }else {
                    Clicked54 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked53 || Clicked54 || Clicked55 || Clicked56){
                    if (Clicked55) {
                        NextPage();
                    } else if (Clicked53) {
                        Clicked55 = true;
                        Clicked53 = false;
                        RMIscore2 = RMIscore2 +2;
                        RMIscore2 = RMIscore2 +3;
                        NextPage();
                    }else if (Clicked54){
                        Clicked55 = true;
                        Clicked54 = false;
                        RMIscore2 = RMIscore2 +3;
                        NextPage();
                    }else {
                        Clicked55 = true;
                        Clicked56 = false;
                        RMIscore2 = RMIscore2 -6;
                        RMIscore2 = RMIscore2 +3;
                        NextPage();
                    }
                }else {
                    Clicked55 = true;
                    RMIscore2 = RMIscore2 +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked53 || Clicked54 || Clicked55 || Clicked56){
                    if (Clicked56) {
                        NextPage();
                    } else if (Clicked53) {
                        Clicked56 = true;
                        Clicked53 = false;
                        RMIscore2 = RMIscore2 +2;
                        RMIscore2 = RMIscore2 +6;
                        NextPage();
                    }else if (Clicked54){
                        Clicked56 = true;
                        Clicked54 = false;
                        RMIscore2 = RMIscore2 +6;
                        NextPage();
                    }else {
                        Clicked56 = true;
                        Clicked55 = false;
                        RMIscore2 = RMIscore2 -6;
                        RMIscore2 = RMIscore2 +6;
                        NextPage();
                    }
                }else {
                    Clicked56 = true;
                    RMIscore2 = RMIscore2 +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked53 || Clicked54 || Clicked55 || Clicked56){
                    NextPage();
                }else {
                    Toast.makeText(Study_test14.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
                }
            }
        });


        mPreviousButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Previouspage();
            }
        });

    }


    private void NextPage() {
        Intent nextpage = new Intent(this, Study_test_results.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test13.class);
        startActivity(previouspage);
    }

}