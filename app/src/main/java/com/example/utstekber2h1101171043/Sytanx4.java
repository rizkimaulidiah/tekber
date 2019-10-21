package com.example.utstekber2h1101171043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sytanx4 extends AppCompatActivity {
Button back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sytanx4);
        back4=(Button) findViewById(R.id.back4);

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bck4=new Intent(Sytanx4.this,MainActivity.class);
                startActivity(bck4);
            }
        });
    }
}
