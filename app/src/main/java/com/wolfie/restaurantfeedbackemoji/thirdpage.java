package com.wolfie.restaurantfeedbackemoji;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class thirdpage extends AppCompatActivity {
    String val = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdpage);
        final  Bundle bundle = getIntent().getExtras();
        findViewById(R.id.f1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fourthpage.class);
                val="5";
                bundle.putString("Food",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.f2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fourthpage.class);
                val="4";
                bundle.putString("Food",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.f3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fourthpage.class);
                val="3";
                bundle.putString("Food",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.f4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fourthpage.class);
                val="2";
                bundle.putString("Food",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.f5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),fourthpage.class);
                val="1";
                bundle.putString("Food",val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
