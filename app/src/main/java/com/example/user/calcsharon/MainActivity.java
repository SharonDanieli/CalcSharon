package com.example.user.calcsharon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    String st = et.getText().toString();
    public void savetonum1(int num1){
        String st = et.getText().toString();
        num1 = Integer.parseInt(st);
    }

    int num1=0;
    int operation=0;
    public void hibur(View view) {
        et.setText("");
        num1+=Integer.parseInt(st);
        operation=1;
    }

    public void hisur(View view) {
        et.setText("");
        num1-=Integer.parseInt(st);
        operation=2;
    }

    public void kefel(View view) {
        et.setText("");
        num1*=Integer.parseInt(st);
        operation=3;
    }

    public void hiluk(View view) {
        et.setText("");
        num1/=Integer.parseInt(st);
        operation=4;
    }


    public void shave(View view) {
        et.setText("");
        switch (operation) {
            case 1:
                et.setText(num1+Integer.parseInt(st));
                break;
            case 2:
                et.setText(num1-Integer.parseInt(st));
                break;
            case 3:
                et.setText(num1*Integer.parseInt(st));
                break;
            case 4:
                et.setText(num1/Integer.parseInt(st));
                break;
            default:
                Toast.makeText(this, "please click operation", Toast.LENGTH_SHORT).show();
        }
    }

    public void cleartext(View view) {
        et.setText("");
        num1=0;
    }

    public void gocredit(View view) {
        Intent t = new Intent(this, credits.class);
        startActivity(t);
    }
}