package com.example.teamgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "我是关鑫", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "我是李吉达", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "成守宇", Toast.LENGTH_SHORT).show();
    }
}