package com.example.utstekber2h1101171043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sytanx5 extends AppCompatActivity {
Button back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sytanx5);

        back5=(Button) findViewById(R.id.back5);

        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bck5=new Intent(Sytanx5.this,MainActivity.class);
                startActivity(bck5);
            }
        });
    }
}
