package com.example.et.a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public void click1(View view)
    {
        Button b1=(Button)findViewById(R.id.b1);
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
        double r=Math.random();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Random rand=new Random();
        int r=rand.nextInt(20);
        String s=""+r;

        TextView t1=(TextView)findViewById(R.id.t1);
        t1.setText(s);
    }
}
