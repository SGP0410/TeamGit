package com.example.teamgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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
        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "哈哈", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(MainActivity3.this,MainActivity.class);
        startActivity(intent);
        Log.i(TAG, "onCreate: ");


    }
}