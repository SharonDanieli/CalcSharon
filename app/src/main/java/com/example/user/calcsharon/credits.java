package com.example.user.calcsharon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class credits extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        tv = (TextView)findViewById(R.id.tv);
        tv.setText("credits \n"+"made by sharon danieli");
    }
}
