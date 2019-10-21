package com.example.utstekber2h1101171043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sytanx3 extends AppCompatActivity {
Button back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sytanx3);
        back3=(Button) findViewById(R.id.back3);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bck3=new Intent(Sytanx3.this,MainActivity.class);
                startActivity(bck3);
            }
        });

    }
}
