package com.example.cscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    TextView textView;
    Button button00, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttondot, buttonC, buttonperc, buttonback, buttondiv, buttonmul, buttonsub, buttonadd,buttoneq;
    String val="";

    ArrayList <Integer> a = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        button00 = (Button) findViewById(R.id.button00);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        buttondot = (Button) findViewById(R.id.buttondot);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonperc = (Button) findViewById(R.id.buttonperc);
        buttonback = (Button) findViewById(R.id.buttonback);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttoneq = (Button) findViewById(R.id.buttoneq);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "1";
                    textView.setText(textView.getText() + "1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "2";
                    textView.setText(textView.getText() + "2");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "3";
                    textView.setText(textView.getText() + "3");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "4";
                    textView.setText(textView.getText() + "4");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "5";
                    textView.setText(textView.getText() + "5");
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "6";
                    textView.setText(textView.getText() + "6");
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "7";
                    textView.setText(textView.getText() + "7");
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "8";
                    textView.setText(textView.getText() + "8");
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "9";
                    textView.setText(textView.getText() + "9");
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    val += "0";
                    textView.setText(textView.getText() + "0");
                }
            }
        });

        button00.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<9)
                {
                    val += "00";
                    textView.setText(textView.getText() + "00");
                }
            }
        });

        buttonback.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                    if (val.length() > 1)
                        val = val.substring(0, (val.length() - 1));
                    else
                        val = "";
                    textView.setText("");
                    textView.setText(textView.getText() + val);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                val="";
                textView.setText("");
                a.clear();
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if (val.length() < 9) {
                    String st = "";
                    char ch;
                    int flag = 1, c = 0;
                    if (!textView.getText().toString().isEmpty()) {
                        for (int i = val.length() - 1; i >= 0; i--) {
                            ch = val.charAt(i);
                            if (ch == '+' || ch == '−' || ch == '×' || ch == '÷' || ch == '%' || ch == '.') {
                                c = 1;
                                st = val.substring(i, val.length());
                                break;
                            }
                        }
                        for (int i = 0; i < st.length(); i++) {
                            if (st.charAt(i) == '.')
                                flag = 0;
                        }
                        if (c == 1 && (st.equals("+") || st.equals("−") || st.equals("×") || st.equals("÷") || st.equals("%")))
                            flag = 0;

                        if (val.charAt(val.length() - 1) == '.')
                            flag = 0;

                        if (flag == 1) {
                            val += ".";
                            textView.setText(textView.getText() + ".");
                        }
                    } else {
                        val += "0.";
                        textView.setText(textView.getText() + val);
                    }
                }
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    if (!textView.getText().toString().isEmpty()) {
                        String s = textView.getText().toString();
                        char ch = s.charAt(s.length() - 1);
                        if (ch != '+' && ch != '−' && ch != '×' && ch != '÷' && ch != '.' && ch != '%') {
                            a.add((s.length() - 1));
                            val += "+";
                            textView.setText(textView.getText() + "+");
                        }
                    }
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    if (!textView.getText().toString().isEmpty()) {
                        String s = textView.getText().toString();
                        char ch = s.charAt(s.length() - 1);
                        if (ch != '+' && ch != '−' && ch != '×' && ch != '÷' && ch != '.' && ch != '%') {
                            a.add((s.length() - 1));
                            val += "−";
                            textView.setText(textView.getText() + "−");
                        }
                    }
                }
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    if (!textView.getText().toString().isEmpty()) {
                        String s = textView.getText().toString();
                        char ch = s.charAt(s.length() - 1);
                        if (ch != '+' && ch != '−' && ch != '×' && ch != '÷' && ch != '.' && ch != '%') {
                            a.add((s.length() - 1));
                            val += "×";
                            textView.setText(textView.getText() + "×");
                        }
                    }
                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    if (!textView.getText().toString().isEmpty()) {
                        String s = textView.getText().toString();
                        char ch = s.charAt(s.length() - 1);
                        if (ch != '+' && ch != '−' && ch != '×' && ch != '÷' && ch != '.' && ch != '%') {
                            a.add((s.length() - 1));
                            val += "÷";
                            textView.setText(textView.getText() + "÷");
                        }
                    }
                }
            }
        });


        buttonperc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                if(val.length()<10)
                {
                    if (!textView.getText().toString().isEmpty()) {
                        String s = textView.getText().toString();
                        char ch = s.charAt(s.length() - 1);
                        if (ch != '+' && ch != '−' && ch != '×' && ch != '÷' && ch != '.' && ch != '%') {
                            a.add((s.length() - 1));
                            val += "%";
                            textView.setText(textView.getText() + "%");
                        }
                    }
                }
            }
        });

        buttoneq.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = val;
                    char ch = s.charAt(s.length() - 1);
                    if (ch == '+' || ch == '-' || ch == '%' || ch == '*' || ch == '/' || ch=='.')
                    {
                        Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        a.add((s.length()-1));
                        s+= "=";
                        double res=Double.parseDouble(s.substring(0, (int) (a.get(0)+1)));

                        for(int i=0;i<a.size()-1;i++)
                        {
                            double answ = Double.parseDouble(s.substring((int)(a.get(i)+2),(int)(a.get(i+1)+1)));
                            if(s.charAt((int) (a.get(i)+1))=='+')
                            {
                                res+=answ;
                            }
                            else if(s.charAt((int) (a.get(i)+1))=='−')
                            {
                                res-=answ;
                            }
                            else if(s.charAt((int) (a.get(i)+1))=='÷')
                            {
                                res/=answ;
                            }
                            else if(s.charAt((int) (a.get(i)+1))=='×')
                            {
                                res*=answ;
                            }
                            else if(s.charAt((int) (a.get(i)+1))=='%')
                            {
                                res=(res)*(answ)/100;
                            }
                        }

                        String answer = String.valueOf(res);
                        a.clear();

                        if(res%1==0)
                        {
                            answer=answer.substring(0,answer.indexOf('.'));
                        }

                        textView.setText(answer);
                        val=answer;
                    }
                }
            }
        });
    }
}