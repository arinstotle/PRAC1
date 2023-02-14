package com.example.prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Practika1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate method called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate method called");
        Log.e(TAG, "This is error");
        Log.w(TAG, "This is warning");
        Log.d(TAG, "This is debug log");
        Log.v(TAG, "This is verbose log");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume method called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume method called");
        Log.e(TAG, "This is error");
        Log.w(TAG, "This is warning");
        Log.d(TAG, "This is debug log");
        Log.v(TAG, "This is verbose log");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause method called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause method called");
        Log.e(TAG, "This is error");
        Log.w(TAG, "This is warning");
        Log.d(TAG, "This is debug log");
        Log.v(TAG, "This is verbose log");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart method called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart method called");
        Log.e(TAG, "This is error");
        Log.w(TAG, "This is warning");
        Log.d(TAG, "This is debug log");
        Log.v(TAG, "This is verbose log");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop method called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop method called");
        Log.e(TAG, "This is error");
        Log.w(TAG, "This is warning");
        Log.d(TAG, "This is debug log");
        Log.v(TAG, "This is verbose log");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy method called", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy method called");
        Log.e(TAG, "This is error");
        Log.w(TAG, "This is warning");
        Log.d(TAG, "This is debug log");
        Log.v(TAG, "This is verbose log");
    }
}