package com.example.teamgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "vvvvv";
    private Object Thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "我是关鑫", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "我是何忠苗", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "我是何忠苗", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "我是何忠苗", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "我是何忠苗", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "我是何忠苗", Toast.LENGTH_SHORT).show();

        Log.i(TAG, "onCreate: sstheguan");

        Thread = new Thread();

    }
}