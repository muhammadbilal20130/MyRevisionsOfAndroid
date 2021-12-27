package com.example.myrevisionsofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView TvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TvLogin = findViewById(R.id.tvUserLogin);
        TvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(), "This is my revison of andorid", Toast.LENGTH_LONG);
//                when gravity set
//                toast.setGravity(Gravity.CENTER, 0, 0);
//                toast.show();
                //deualt toast
                Toast.makeText(getApplicationContext(), "This is my revison of andorid", Toast.LENGTH_LONG).show();
            }
        });

    }
}