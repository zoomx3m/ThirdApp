package com.example.asus.thirdapp_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Asus on 22.02.2016.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Ads of the screen elements

    EditText etNum1;
    EditText etNum2;
    Button button_1;
    Button button_2;
    TextView textView4;
    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);

        //find the screen elements

        etNum1 = (EditText) findViewById(R.id.Edit);
        etNum2 = (EditText) findViewById(R.id.Edit2);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        textView4 = (TextView) findViewById(R.id.textView4);

        //prescribe the handler

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        // Read EditText and fill the variable number

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        // Define which button is pressed and operations

        switch (v.getId()) {
            case R.id.button_1:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.button_2:
                oper = "-";
                result = num1 - num2;
                break;
        }

        textView4.setText(String.valueOf(result));

    }
}
