package com.example.teamgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

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