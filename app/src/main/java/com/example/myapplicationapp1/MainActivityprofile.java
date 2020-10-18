package com.example.myapplicationapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityprofile extends AppCompatActivity {
    Button btlogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        anhxa();
        btlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityprofile.this, MainActivitydangnhap.class);
                startActivity(intent);
            }
        });
    }

    private void anhxa() {
        btlogout=(Button)findViewById(R.id.buttonlogout);
    }
}