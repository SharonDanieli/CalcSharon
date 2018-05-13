package com.example.user.calcsharon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Scanner in = new Scanner(System.in);

    EditText et;
    Button plus, minus, multi, divi, delete, equal, cre;
    Double num1;
    Double num2;
    Boolean num1exist;
    int operation;

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

        num1exist=false;
        operation=0;
    }


    public void savetonum() {
        Double num;
        String st = et.getText().toString();
        //check input- if wrong toast
        num = Double.parseDouble(st);
        num1exist=true;// set the flag to true for 1st operand return the double
    }


    public void hibur(View view) {
        if(num1exist) {
            String st = et.getText().toString();
            num2 = Double.parseDouble(st);//enter the number from et to num2
            num1+=num2;//calc operation between 1 & 2 and store result in num1
            et.setText(Double.toString(num1));//display num1
        } else {
            String st = et.getText().toString();
            num1 = Double.parseDouble(st);//enter the number from et to num1
            num1exist=true;
            operation=1;
        }
        // check if there is first num
/*        et.setText("");
        num1+=Integer.parseInt(st);
        operation=1;*/
    }



    public void shave(View view) {
        et.setText("");
        switch (operation) {
            case 1:
                et.setText((int) (num1+num2));
                break;
            case 2:
                et.setText((int) (num1- num2));
                break;
            case 3:
                et.setText((int) (num1*num2));
                break;
            case 4:
                et.setText((int) (num1/num2));
                break;
            default:
                Toast.makeText(this, "please click operation", Toast.LENGTH_SHORT).show();
        }
    }

    public void cleartext(View view) {
        et.setText("");
        num1=0.0;
    }

    public void gocredit(View view) {
        Intent t = new Intent(this, credits.class);
        startActivity(t);
    }
}