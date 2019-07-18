package com.wolfie.restaurantfeedbackemoji;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class fourthpage extends AppCompatActivity {
String val="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthpage);
        final  Bundle bundle = getIntent().getExtras();

        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), fifthpage.class);
                val = "5";
                bundle.putString("Behaviour", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.b2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), fifthpage.class);
                val = "4";
                bundle.putString("Behaviour", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.b3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), fifthpage.class);
                val = "3";
                bundle.putString("Behaviour", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.b4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), fifthpage.class);
                val = "2";
                bundle.putString("Behaviour", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        findViewById(R.id.b5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), fifthpage.class);
                val = "1";
                bundle.putString("Behaviour", val);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
