package com.example.utstekber2h1101171043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.utstekber2h1101171043.R;

public class komponen5 extends AppCompatActivity {
Button contoh5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen5);

        contoh5=(Button) findViewById(R.id.contoh5);

        contoh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cth5=new Intent(komponen5.this,Sytanx5.class);
                startActivity(cth5);
            }
        });
    }

    public void browser5(View view){
        Intent bro5=new Intent(Intent.ACTION_VIEW, Uri.parse("http://farninuramalia.blogspot.com/2013/06/activities-service-intent-content.html"));
        startActivity(bro5);
    }
}
