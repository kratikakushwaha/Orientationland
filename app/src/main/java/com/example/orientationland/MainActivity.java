package com.example.orientationland;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static  String TAG=MainActivity.class.getSimpleName();
    private EditText e1,e2,e3,e4;

    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"is method onCreate");
        e1=findViewById(R.id.email);
        e2=findViewById(R.id.password);
        e3=findViewById(R.id.email1);
        e4=findViewById(R.id.password1);
        bt=findViewById(R.id.btn);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"is method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"is method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"is method onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"is method onSaveInstanceState");

        String save=e1.getText().toString();
        String set=e2.getText().toString();
        outState.putString("name",save);
        outState.putString("na",set);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"is method onRestoreInstanceState");



        e3.setText(savedInstanceState.getString("name"));
        e4.setText(savedInstanceState.getString("na"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"is method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"is method onDestroy");
    }
    }


