package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button ten;
    private Button zero;
    private Button mult;
    private Button add;
    private Button sub;
    private Button divide;
    private Button equals;
    private Button clear;
    private TextView Result;
    private TextView info;
    private final char addition ='+';
    private final char subtraction ='-';
    private final char multiply ='*';
    private final char division ='/';
    private final char equ ='0';
    private Double val1=Double.NaN;
    private Double val2;
    private char Action;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    info.setText(info.getText().toString() + "1");
                }
            });
                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        info.setText(info.getText().toString() + "2");
                    }
                });
                    three.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            info.setText(info.getText().toString() + "3");
                        }
                    });
                        four.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                info.setText(info.getText().toString() + "4");
                            }
                        });
five.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    info.setText(info.getText().toString() + "5");
                                }
                            });
                                six.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        info.setText(info.getText().toString() + "6");
                                    }
                            });
                                    seven.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            info.setText(info.getText().toString() + "7");
                                        }
                                    });
                                        eight.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                info.setText(info.getText().toString() + "8");
                                            }
                                        });
                                            nine.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    info.setText(info.getText().toString() + "9");
                                                }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action = addition;
                Result.setText(String.valueOf(val1) + "+");
                info.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               compute();
                Action = subtraction;
                Result.setText(String.valueOf(val1) + "-");
                info.setText(null);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               compute();
                Action = multiply;
                Result.setText(String.valueOf(val1) + "*");
                info.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            compute();
                Action = division;
                Result.setText(String.valueOf(val1) + "/");
                info.setText(null);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action = equ;
                Result.setText(Result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                //5+4=9
                info.setText(null);
            }
        });
clear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(info.getText().length()>0){
            CharSequence name=info.getText().toString();
            info.setText(name.subSequence(0,name.length()-1));
        }
        else {
            val1 = Double.NaN;
            val2 = Double.NaN;
            info.setText(null);
            Result.setText(null);
        }
    }
});
    }
    private void setupUIViews() {
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        zero = (Button) findViewById(R.id.btn15);
        add = (Button) findViewById(R.id.btn10);
        sub = (Button) findViewById(R.id.btn11);
        mult = (Button) findViewById(R.id.btn13);
        divide = (Button) findViewById(R.id.btn12);
        equals = (Button) findViewById(R.id.btn14);
        Result = (TextView)findViewById(R.id.txt1);
        info= (TextView)findViewById(R.id.txt2);
        clear= (Button) findViewById(R.id.btn16);
    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(info.getText().toString());
            switch (Action){
                case addition:
                    val1=val1+val2;
                    break;
                        case subtraction:
                            val1=val1-val2;
                            break;
                                case multiply:
                                    val1=val1*val2;
                                    break;
                                        case division:
                                            val1=val1/val2;
                                            break;
                                                case equ:
                                                    break;
            }

        }
        else{
            val1=Double.parseDouble(info.getText().toString());
        }
    }
}
