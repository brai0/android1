package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate invoked");
        findViewById(R.id.button).setOnClickListener(v -> {
            Intent intent= new Intent(MainActivity.this,SecondActivity.class);
            Toast.makeText(this, "New Activity", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart invoked");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIfeCycle","onStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","OnDestroy Invoked");
    }
}
