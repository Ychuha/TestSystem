package com.example.kursovai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button button2 = (Button) findViewById(R.id.button2);
        ImageButton exitbtn = (ImageButton) findViewById(R.id.imbtm4);
        button2.setOnClickListener(this);

        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(MainActivity5.this, MainActivity2.class);
            }
        });
    }

    @Override
    public void onClick(View view) {
            Intent j;
            j = new Intent(this, MainActivity7.class);
            startActivity(j);

    }
}

