package com.example.user.calcsharon;

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

    public void main(String[]args){
        savetonum1(num1);//הזנת מס' ראשון ושמירתו בnum1
        //לחיצה על פעולה
        savetonum2(num2);//הזנת מס' שני ושמירתו בnum2

    }

    int num1=0, num2=0;
    public void savetonum1(int num1){
        String st = et.getText().toString();
        num1 = Integer.parseInt(st);
    }

    public void savetonum2(int num2){
        String st = et.getText().toString();
        num2 = Integer.parseInt(st);
    }

    int operation=0;
    public void hibur(View view) {
        et.setText("");
        operation=1;
    }

    public void hisur(View view) {
        et.setText("");
        operation=2;
    }

    public void kefel(View view) {
        et.setText("");
        operation=3;
    }

    public void hiluk(View view) {
        et.setText("");
        operation=4;
    }

    public void shave(View view) {
        et.setText("");
        switch (operation) {
            case 1:
                num1+=num2;
                et.setText(num1+num2);
                break;
            case 2:
                num1-=num2;
                et.setText(num1-num2);
                break;
            case 3:
                num1*=num2;
                et.setText(num1*num2);
                break;
            case 4:
                num1/=num2;
                et.setText(num1/num2);
                break;
            default:
                Toast.makeText(this, "please click operation", Toast.LENGTH_SHORT).show();
        }
    }
}