package com.example.myprobeta1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView tales,jixsaw,soundb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tales = (ImageView) findViewById(R.id.tales);
        tales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TaleActivity.class);
                startActivity(intent);
            }
        });

        jixsaw = (ImageView) findViewById(R.id.jixsaw);
        jixsaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JixsawActivity.class);
                startActivity(intent);
            }
        });

        soundb = (ImageView) findViewById(R.id.soundb);
        soundb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SoundbActivity.class);
                startActivity(intent);
            }
        });


    }
}
