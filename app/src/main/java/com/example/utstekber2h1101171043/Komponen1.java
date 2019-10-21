package com.example.utstekber2h1101171043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Komponen1 extends AppCompatActivity {
Button contoh1;
TextView isi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen1);
        contoh1=(Button) findViewById(R.id.contoh1);

        contoh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cth1=new Intent(Komponen1.this,Sytanx1.class);
                startActivity(cth1);
            }
        });
    }
    public void browser1(View view) {
        Intent bro1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.petanikode.com/android-activity/"));
        startActivity(bro1);
    }


}
