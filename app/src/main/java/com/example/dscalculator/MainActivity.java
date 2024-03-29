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
        if (!hasDot) {
            if (input.getText().equals("")) {

                input.setText("0.");

            } else {
                input.setText(input.getText() + ".");

            }
            hasDot = true;
        }
    }

    public void btnClick_add(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("+");
        hasDot = false;
    }

    public void btnClick_subtract(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("-");
        hasDot = false;
    }

    public void btnClick_multiply(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("X");
        hasDot = false;
    }

    public void btnClick_divide(View view) {
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
        signBox.setText("Enter value of h");
        hasDot = false;
    }

    public void btnClick_minNodesBT(View view) {
        specialFunction = "minNodesBt";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of h");
        hasDot = false;
    }

    public void btnClick_leafNodesBT(View view) {
        specialFunction = "leafNodesBt";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of n");
        hasDot = false;
    }

    public void btnClick_maxHeightBT(View view) {
        specialFunction = "maxHeightBt";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of n");
        hasDot = false;
    }

    public void btnClick_minHeightBT(View view) {
        specialFunction = "minHeightBt";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of n");
        hasDot = false;
    }

    public void btnClick_nodesInPBT(View view) {
        specialFunction = "power";
//        same as max nodes in Binary Tree
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of h");
        hasDot = false;
    }

    public void btnClick_nodesDepthPBT(View view) {
        specialFunction = "nodesDepthPBT";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of d");
        hasDot = false;
    }

    public void btnClick_leafNodesPBT(View view) {
        specialFunction = "nodesDepthPBT";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of h");
        hasDot = false;
    }

    public void btnClick_internalNodesPBT(View view) {
        specialFunction = "internalNodesPBT";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of h");
        hasDot = false;
    }

    public void btnClick_maxNodesFBT(View view) {
        specialFunction = "power";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of h");
        hasDot = false;
    }

    public void btnClick_minNodesFBT(View view) {
        specialFunction = "minNodesFBT";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of h");
        hasDot = false;
    }

    public void btnClick_maxHeightFBT(View view) {
        specialFunction = "maxHeightFBT";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of n");
        hasDot = false;
    }

    public void btnClick_minHeightFBT(View view) {
        specialFunction = "minHeightBT";
        value1 = input.getText().toString();
        input.setText(null);
        signBox.setText("Enter value of n");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_equal(View view) {
        if ((specialFunction == null && sign == null) || input.getText().equals("")) {
            signBox.setText("Error!");
        } else if (specialFunction != null) {
            switch (specialFunction) {
                default:
                    break;
//Binary Tree
                case "power":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.pow(2, num1 + 1) - 1 + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;

                case "minNodesBt":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.pow(Double.parseDouble(value1), 1) + 1 + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;

                case "leafNodesBt":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText((Math.floor(Double.parseDouble(value1)) + 1) / 2 + "");
//                    floor value because leaf nodes have a value in integer
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;

                case "maxHeightBt":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.pow(num1, 1) - 1 + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;

                case "minHeightBt":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText((Math.log(num1 + 1) / Math.log(2)) - 1 + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
//        Perfect Binary Tree
//                nodes in PBT case is equal to the power case so...

                case "nodesDepthPBT":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.pow(2, num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;

                case "internalNodesPBT":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.pow(2, num1) - 1 + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;

                case "minNodesFBT":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.pow(2, num1) + 1 + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;

                case "maxHeightFBT":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText((Math.floor(Double.parseDouble(value1)) - 1) / 2 + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;

            }
        } else if (sign != null) {
            value2 = input.getText().toString();
            num1 = Double.parseDouble(value1);
            num2 = Double.parseDouble(value2);
            input.setText(null);

            switch (sign) {
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
        } else input.setText("Error!");
    }

    public void btnClick_delete(View view) {
        if (input.getText().equals("")) {
            input.setText(null);

        } else {

            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasDot = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));

            } else {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
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