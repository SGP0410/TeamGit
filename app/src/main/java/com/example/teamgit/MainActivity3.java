package com.example.teamgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    private String TAG = "MainActivity3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();
        
        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(MainActivity3.this,MainActivity.class);
        startActivity(intent);
        Log.i(TAG, "onCreate: ");
        List<String> strings = new ArrayList<>();


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
    }
}