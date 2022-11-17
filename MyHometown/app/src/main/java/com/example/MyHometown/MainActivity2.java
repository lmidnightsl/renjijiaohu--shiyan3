package com.example.MyHometown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button MainButtonBack,MainButtonFront;
    private Button button1,button2,button3,button4,button5,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MainButtonBack = findViewById(R.id.buttonback);//后退
        MainButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        MainButtonFront = findViewById(R.id.buttonfront);//下一步
        MainButtonFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        button1 = findViewById(R.id.dialect);//方言
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,Dialect.class);
                startActivity(intent);
            }
        });
        button2 = findViewById(R.id.folkart);//曲艺
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,FolkArt.class);
                startActivity(intent);
            }
        });
        button3 = findViewById(R.id.folkways);//民俗
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,Folkways.class);
                startActivity(intent);
            }
        });
        button4 = findViewById(R.id.craft);//工艺
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,Craft.class);
                startActivity(intent);
            }
        });
        button5 = findViewById(R.id.architecture);//建筑
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,Architecutre.class);
                startActivity(intent);
            }
        });
        button6 = findViewById(R.id.food);//食物
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,Food.class);
                startActivity(intent);
            }
        });
    }


}