package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Created!", Toast.LENGTH_SHORT).show();
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Start!", Toast.LENGTH_SHORT).show();

    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Resume!", Toast.LENGTH_SHORT).show();

    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Pause!", Toast.LENGTH_SHORT).show();

    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Stop!", Toast.LENGTH_SHORT).show();

    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Destroy!", Toast.LENGTH_SHORT).show();

    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "Restart!", Toast.LENGTH_SHORT).show();

    }

}