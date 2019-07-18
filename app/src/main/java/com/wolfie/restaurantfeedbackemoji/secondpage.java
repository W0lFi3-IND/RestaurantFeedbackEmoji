package com.wolfie.restaurantfeedbackemoji;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class secondpage extends AppCompatActivity {
    String val = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Bundle bundle = getIntent().getExtras();
        setContentView(R.layout.activity_secondpage);
        ImageButton btn1 = findViewById(R.id.h1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),thirdpage.class);
                val="5";
                bundle.putString("Hospitality",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        findViewById(R.id.h2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),thirdpage.class);
                val="4";
                bundle.putString("Hospitality",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.h3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),thirdpage.class);
                val="3";
                bundle.putString("Hospitality",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.h4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),thirdpage.class);
                val="2";
                bundle.putString("Hospitality",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.h5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),thirdpage.class);
                val="1";
                bundle.putString("Hospitality",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
