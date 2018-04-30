package com.example.user.calcsharon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button plus;
    Button minus;
    Button multi;
    Button divi;
    Button delete;
    Button equal;
    Button cre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multi = (Button) findViewById(R.id.multi);
        divi = (Button) findViewById(R.id.divi);
        delete = (Button) findViewById(R.id.delete);
        equal = (Button) findViewById(R.id.equal);
        cre = (Button) findViewById(R.id.cre);
    }

    int ope=0;
    public static void hibur (int num1, int num2){

    }
    public static void hisur (int num1, int num2){

    }
    public static void kefel (int num1, int num2){

    }
    public static void hiluk (int num1, int num2){

    }


    public static void arithmetic(int num1, int num2){
        switch (int ope){
            case 1: 
        }
    }
}

