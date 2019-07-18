package com.wolfie.restaurantfeedbackemoji;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sixthpage extends AppCompatActivity {
    DatabaseReference mDatabaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthpage);

       final Bundle bundle = getIntent().getExtras();
     final String tablename = bundle.getString("tablename");
        final String Hospitality = bundle.getString("Hospitality");
        final String FoodQuality = bundle.getString("Food");
        final String Behaviour = bundle.getString("Behaviour");
        final String Recommend = bundle.getString("Recommend");

        findViewById(R.id.Submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed1=findViewById(R.id.name);
                EditText ed2=findViewById(R.id.phoneNo);
                EditText ed3=findViewById(R.id.editText3);
                final String name1=ed1.getText().toString();
                final String phone1=ed2.getText().toString();
                final String email1=ed3.getText().toString();
            mDatabaseReference=FirebaseDatabase.getInstance().getReference().child("Table");
                 mDatabaseReference.child(tablename).child(phone1).child("Name:").setValue(name1);
                mDatabaseReference.child(tablename).child(phone1).child("Email:").setValue(email1);
                mDatabaseReference.child(tablename).child(phone1).child("Hospitality:").setValue(Hospitality);
                mDatabaseReference.child(tablename).child(phone1).child("Food Quality:").setValue(FoodQuality);
                mDatabaseReference.child(tablename).child(phone1).child("Behaviour:").setValue(Behaviour);
                mDatabaseReference.child(tablename).child(phone1).child("Recommend:").setValue(Recommend);


            }
        });
    }
}
