package com.wolfie.restaurantfeedbackemoji;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class fifthpage extends AppCompatActivity {
String val="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthpage);
        final  Bundle bundle = getIntent().getExtras();
        findViewById(R.id.r1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), sixthpage.class);
                val = "5";
                bundle.putString("Recommend", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.r2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), sixthpage.class);
                val = "4";
                bundle.putString("Recommend", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.r3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), sixthpage.class);
                val = "3";
                bundle.putString("Recommend", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.r4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), sixthpage.class);
                val = "2";
                bundle.putString("Recommend", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.r5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), sixthpage.class);
                val = "1";
                bundle.putString("Recommend", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
