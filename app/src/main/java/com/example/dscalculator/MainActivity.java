package com.example.dscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input, signBox;
    String sign, value1, value2, specialFunction;
    Double num1, num2, result;
    boolean hasDot, isSpecialFunctionOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signBox = (TextView) findViewById(R.id.sign);
        hasDot = false;
        isSpecialFunctionOn = false;


    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        input.setText(input.getText() + "0");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        input.setText(input.getText() + "1");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        input.setText(input.getText() + "2");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        input.setText(input.getText() + "3");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        input.setText(input.getText() + "4");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        input.setText(input.getText() + "5");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        input.setText(input.getText() + "6");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        input.setText(input.getText() + "7");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        input.setText(input.getText() + "8");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        input.setText(input.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_dot(View view) {
        if(!hasDot){
            if(input.getText().equals("")){

                input.setText("0.");
            }else{
                input.setText(input.getText() + ".");

            }hasDot = true;
        }
    }

    public void btnClick_add (View view){
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("+");
        hasDot = false;
    }
    public void btnClick_subtract (View view){
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("-");
        hasDot = false;

    }
    public void btnClick_multiply (View view){
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("X");
        hasDot = false;

    }
    public void btnClick_divide (View view){
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("÷");
        hasDot = false;

    }
    public void btnClick_maxNodesBT(View view) {
        specialFunction = "power";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Max nodes in BT");
        hasDot = false;


    }
    public void btnClick_minNodesBT(View view) {
        specialFunction = "minNodes";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Min nodes in BT");
        hasDot = false;
    }

        @SuppressLint("SetTextI18n")
    public void btnClick_equal(View view) {
        if( (specialFunction == null && sign == null)||input.getText().equals("")){
            signBox.setText("Error!");
        }else if(specialFunction != null) {
            switch (specialFunction){
                default:
                    break;

                    case "power":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText( Math.pow(2,num1+1)-1 + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;

                    case "minNodes":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    result = num1 +1;
                    specialFunction = null;
                    sign = null;
                    signBox.setText(null);
                    break;


            }
        }
        else if (sign != null){
            value2 = input.getText().toString();
            num1 = Double.parseDouble(value1);
            num2 = Double.parseDouble(value2);
            input.setText(null);

            switch (sign){
                default:
                    break;




                case "+":
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;



                    case "-":
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;

                    case "*":
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;

                    case "/":
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;

            }
        }

        else input.setText("Error!");
    }


    public void btnClick_delete(View view) {
        if(input.getText().equals("")){
            input.setText(null);
        }else{
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len-1) == '.'){
                hasDot = false;
                input.setText(input.getText().subSequence(0,input.getText().length() - 1));

            }
            else {
                input.setText(input.getText().subSequence(0,input.getText().length() - 1));
            }
        }
    }

    public void btnClick_clear(View view) {
        input.setText(null);
        signBox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;

    }


}