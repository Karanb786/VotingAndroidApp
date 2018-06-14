package com.kaksha.textviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int narendravote=0;
    int rahulvote =0;
     Button narendrabtn;
     Button rahulbtn;
     TextView textView;
     TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.narendra_tv);
        textView1 = findViewById(R.id.rahul_tv);
        narendrabtn = findViewById(R.id.narendra_bt);
        rahulbtn = findViewById(R.id.rahul_bt);

    }
        public void narendra(View view){
        String narendraVote =textView.getText().toString().trim();
        int count = Integer.parseInt(narendraVote);
        count++;
        textView.setText(String.valueOf(count));

        }
        public void rahulbaba(View view){
            String rahulVote =textView1.getText().toString().trim();
            int count = Integer.parseInt(rahulVote);
            count++;
            textView1.setText(String.valueOf(count));

        }



}
