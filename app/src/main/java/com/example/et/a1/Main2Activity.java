package com.example.et.a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    public void click2(View view)
    {
        Button b1=(Button)findViewById(R.id.b1);
        startActivity(new Intent(Main2Activity.this,MainActivity.class));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       Random rand=new Random();
        int r=rand.nextInt(20);
        String s=""+r;
        TextView t2= (TextView)findViewById(R.id.t2);
        t2.setText(s);
    }
}
