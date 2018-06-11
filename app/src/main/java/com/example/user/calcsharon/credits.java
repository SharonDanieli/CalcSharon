package com.example.user.calcsharon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class credits extends AppCompatActivity {

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        answer = (TextView)findViewById(R.id.answer);
        answer.setText("The last result is: " + getIntent().getExtras().getString("res"));
    }

    public void onActivityResult(int requestCode, int resultCode, Intent dataBack){
        if(dataBack!=null){
            String strReturn = dataBack.getStringExtra("resultt");
        }
    }

    public void toReturn(View view){
        Intent back = new Intent(this, MainActivity.class);
        back.putExtra("resultt", back.getStringExtra("string"));
        setResult(RESULT_OK, back);
        finish();
    }
}
