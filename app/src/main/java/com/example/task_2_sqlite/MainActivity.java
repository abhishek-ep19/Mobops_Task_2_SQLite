package com.example.task_2_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button but1;

    public void ini1(){
        but1= (Button)findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent toy = new Intent(MainActivity.this,Activity2.class);
                startActivity(toy);

            }
        });
    }

    public Button but2;

    public void ini2(){
        but2= (Button)findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent toy2 = new Intent(MainActivity.this,Activity3.class);
                startActivity(toy2);

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ini1();
        ini2();

    }
}