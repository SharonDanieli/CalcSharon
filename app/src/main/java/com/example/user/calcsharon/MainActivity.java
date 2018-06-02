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
    Double num1 = 0.0;
    Double num2 = 0.0;
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

        num1exist = false;
        operation = 0;
    }


    public void savetonum() {
        Double num;
        String st = et.getText().toString();
        //check input- if wrong toast
        num = Double.parseDouble(st);
        num1exist = true;// set the flag to true for 1st operand return the double
    }


    public void hibur(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && (!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-.")))) {
            if (num1exist) {
                String st = et.getText().toString();
                num2 = Double.parseDouble(st);//enter the number from et to num2
                et.setText("");
                num1 += num2;//calc operation between 1 & 2 and store result in num1
                et.setHint("" + num1);//display num1
            } else {
                String st = et.getText().toString();
                et.setText("");
                num1 = Double.parseDouble(st);//enter the number from et to num1
                num1exist = true;
            }
        } else {
            Toast.makeText(this, "input is unvailable", Toast.LENGTH_SHORT).show();
        }
        operation = 1;
    }

    public void hisur(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && (!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-.")))) {
            if (num1exist) {
                String st = et.getText().toString();
                num2 = Double.parseDouble(st);//enter the number from et to num2
                et.setText("");
                num1 -= num2;//calc operation between 1 & 2 and store result in num1
                et.setHint("" + num1);//display num1
            } else {
                String st = et.getText().toString();
                et.setText("");
                num1 = Double.parseDouble(st);//enter the number from et to num1
                num1exist = true;
            }
        } else {
            Toast.makeText(this, "input is unvailable", Toast.LENGTH_SHORT).show();
        }
        operation = 2;
    }

    public void kefel(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && (!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-.")))) {
            if (num1exist) {
                String st = et.getText().toString();
                num2 = Double.parseDouble(st);//enter the number from et to num2
                et.setText("");
                num1 += num2;//calc operation between 1 & 2 and store result in num1
                et.setHint("" + num1);//display num1
            } else {
                String st = et.getText().toString();
                et.setText("");
                num1 = Double.parseDouble(st);//enter the number from et to num1
                num1exist = true;
            }
        } else {
            Toast.makeText(this, "input is unvailable", Toast.LENGTH_SHORT).show();
        }
        operation = 1;
    }

    public void hiluk(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && (!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-.")))) {
            if (num1exist) {
                String st = et.getText().toString();
                num2 = Double.parseDouble(st);//enter the number from et to num2
                et.setText("");
                num1 += num2;//calc operation between 1 & 2 and store result in num1
                et.setHint("" + num1);//display num1
            } else {
                String st = et.getText().toString();
                et.setText("");
                num1 = Double.parseDouble(st);//enter the number from et to num1
                num1exist = true;
            }
        } else {
            Toast.makeText(this, "input is unvailable", Toast.LENGTH_SHORT).show();
        }
        operation = 1;
    }
    // check if there is first num
/*
        num1+=Integer.parseInt(st);
        operation=1;*/


    public void shave(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && (!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-.")))) {
            double res = 0;
            switch (operation) {
                case 1:
                    String st1 = et.getText().toString();
                    num2 = Double.parseDouble(st1);
                    res = num1 + num2;
                    break;
                case 2:
                    st1 = et.getText().toString();
                    num2 = Double.parseDouble(st1);
                    res = num1 - num2;
                    break;
                case 3:
                    st1 = et.getText().toString();
                    num2 = Double.parseDouble(st1);
                    res = num1 * num2;
                    break;
                case 4:
                    st1 = et.getText().toString();
                    num2 = Double.parseDouble(st1);
                    if (num2 == 0)
                        Toast.makeText(this, "math ERROR", Toast.LENGTH_SHORT).show();
                    res = num1 / num2;
                    break;
                default:
                    Toast.makeText(this, "please click operation", Toast.LENGTH_SHORT).show();
                    et.setText("" + res);
            }
        }
    }

    public void cleartext(View view) {
        et.setText("");
        num1=0.0; num2=0.0; operation=0;
    }

    public void goCredit(View view) {
        Intent t = new Intent(this, credits.class);
        String str = Double.toString(num1);
        t.putExtra("result", str);
        startActivity(t);
    }
}





