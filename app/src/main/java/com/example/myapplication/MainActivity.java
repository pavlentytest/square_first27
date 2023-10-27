package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editA;
    private EditText editB;
    private EditText editC;
    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editA = findViewById(R.id.editTextA);
        editB = findViewById(R.id.editTextB);
        editC = findViewById(R.id.editTextC);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.result);
    }

    public void doSolve(View v) {
        String str_a = editA.getText().toString(); // "4"
        String str_b = editB.getText().toString(); // "5"
        String str_c = editC.getText().toString(); // "6"
        int a = Integer.parseInt(str_a); // 4
        int b = Integer.parseInt(str_b); // 5
        int c = Integer.parseInt(str_c); // 6
       // double y = Double.parseDouble("4.5");
        int d = b*b - 4*a*c;
        if(d == 0) {
            double x = -b/(2*a);
            tv.setText("x="+x);
        } else if (d > 0) {
            double x1 = -b+Math.sqrt(d)/(2*a);
            double x2 = -b-Math.sqrt(d)/(2*a);
            tv.setText("x1="+x1+",x2="+x2);
        } else {
            tv.setText("Нет решений в действ. числах");
        }


    }
}