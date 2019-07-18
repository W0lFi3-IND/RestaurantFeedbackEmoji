package com.wolfie.restaurantfeedbackemoji;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
EditText ed;
Button btn;
    Bundle bundle =  new Bundle();
FirebaseDatabase mFirebaseDatabase;
DatabaseReference mDatabaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.tablename);
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tablename=ed.getText().toString();
                Intent i = new Intent(getApplicationContext(),secondpage.class);

               bundle.putString("tablename",tablename);
               i.putExtras(bundle);
               startActivity(i);


            }
        });

    }
}
