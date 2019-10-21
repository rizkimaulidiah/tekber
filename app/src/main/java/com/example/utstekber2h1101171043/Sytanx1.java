package com.example.utstekber2h1101171043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sytanx1 extends AppCompatActivity {
Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sytanx1);
        back1=(Button) findViewById(R.id.back1);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bck1=new Intent(Sytanx1.this,MainActivity.class);
                startActivity(bck1);
            }
        });
    }
}
