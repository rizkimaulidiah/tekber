package com.example.utstekber2h1101171043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sytanx2 extends AppCompatActivity {
Button back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sytanx2);
        back2=(Button) findViewById(R.id.back2);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bck2=new Intent(Sytanx2.this,MainActivity.class);
                startActivity(bck2);
            }
        });

    }
}
