package com.example.MyHometown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Folkways extends AppCompatActivity {

    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folkways);
        button5 = findViewById(R.id.folkways_button);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Folkways.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}