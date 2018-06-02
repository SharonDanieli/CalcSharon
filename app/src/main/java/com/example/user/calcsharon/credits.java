package com.example.user.calcsharon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class credits extends AppCompatActivity {

    TextView answer;
    Button returnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        answer = (TextView)findViewById(R.id.answer);
        returnn = (Button)findViewById(R.id.returnn);
        answer.setText("the last result is: " + getIntent().getExtras().getString("result"));
    }

    public void toReturn(View view){
        Intent t = new Intent(this, MainActivity.class);
        startActivity(t);
    }
}
