package com.example.MyHometown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FolkArt extends AppCompatActivity {

    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folk_art);
        button4 = findViewById(R.id.folkart_button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FolkArt.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}