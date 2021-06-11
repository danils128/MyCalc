package com.example.mycalc;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView entry_field;
    private TextView entry_field_2;
    private TextView operand_field;
    private TextView result_field;
    private boolean operationBul;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_plus;
    private Button button_minus;
    private Button button_division;
    private Button button_multyply;
    private Button button_point;
    private Button button_equally;
    private Button button_cancel;
    private Button button_backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entry_field = findViewById(R.id.textView_first_value);
        entry_field_2 = findViewById(R.id.textView_second_value);
        operand_field = findViewById(R.id.textView_sign);
        result_field = findViewById(R.id.textView_result);

        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_plus = findViewById(R.id.button_plus);
        button_equally = findViewById(R.id.button_equally);
        button_minus = findViewById(R.id.button_minus);
        button_multyply = findViewById(R.id.button_multyply);
        button_point = findViewById(R.id.button_point);
        button_division = findViewById(R.id.button_division);
        button_cancel = findViewById(R.id.button_cancel);
        button_backspace = findViewById(R.id.button_back);

        button_0.setOnClickListener(v -> {

            if (!operationBul) {
                if (entry_field.getText().toString().startsWith("0")){
                    if (entry_field.getText().toString().contains(".")){
                        setButtonToField(entry_field, button_0);
                    }
                } else setButtonToField(entry_field, button_0);

            } else {
                if (entry_field_2.getText().toString().startsWith("0")){
                    if (entry_field_2.getText().toString().contains(".")){
                        setButtonToField(entry_field_2, button_0);
                    }
                } else setButtonToField(entry_field_2, button_0);
            }
        });

        button_1.setOnClickListener(v -> {
            if (!operationBul) {
                setButtonToField(entry_field, button_1);
            } else setButtonToField(entry_field_2, button_1);
        });
        button_2.setOnClickListener(v -> {
            if (!operationBul) {
                setButtonToField(entry_field, button_2);
            } else setButtonToField(entry_field_2, button_2);
        });
        button_3.setOnClickListener(v -> {
            if (!operationBul) {
                setButtonToField(entry_field, button_3);
            } else setButtonToField(entry_field_2, button_3);
        });
        button_4.setOnClickListener(v -> {
            if (!operationBul) {
                setButtonToField(entry_field, button_4);
            } else setButtonToField(entry_field_2, button_4);
        });
        button_5.setOnClickListener(v -> {
            if (!operationBul) {
                setButtonToField(entry_field, button_5);
            } else setButtonToField(entry_field_2, button_5);
        });
        button_6.setOnClickListener(v -> {
            if (!operationBul) {
                setButtonToField(entry_field, button_6);
            } else setButtonToField(entry_field_2, button_6);
        });
        button_7.setOnClickListener(v -> {
            if (!operationBul) {
                setButtonToField(entry_field, button_7);
            } else setButtonToField(entry_field_2, button_7);
        });
        button_8.setOnClickListener(v -> {
            if (!operationBul) {
                setButtonToField(entry_field, button_8);
            } else setButtonToField(entry_field_2, button_8);
        });
        button_9.setOnClickListener(v -> {
            if (!operationBul) {
                setButtonToField(entry_field, button_9);
            } else setButtonToField(entry_field_2, button_9);
        });

        button_plus.setOnClickListener(v -> {
            setButtonToField(operand_field, button_plus);
            operationBul = true;
        });
        button_minus.setOnClickListener(v -> {
            setButtonToField(operand_field, button_minus);
            operationBul = true;
        });
        button_multyply.setOnClickListener(v -> {
            setButtonToField(operand_field, button_multyply);
            operationBul = true;
        });
        button_division.setOnClickListener(v -> {
            setButtonToField(operand_field, button_division);
            operationBul = true;
        });

        button_point.setOnClickListener(v -> {
            if (!operationBul) {
                if (entry_field.getText().toString().length() == 0) {
                    entry_field.setText("0");
                    setButtonToField(entry_field, button_point);
                } else if (!entry_field.getText().toString().contains(".")) {
                    setButtonToField(entry_field, button_point);
                }
            } else {
                if (entry_field_2.getText().toString().length() == 0) {
                    entry_field_2.setText("0");
                    setButtonToField(entry_field_2, button_point);
                } else if (!entry_field_2.getText().toString().contains(".")) {
                    setButtonToField(entry_field_2, button_point);
                }
            }
        });

        button_cancel.setOnClickListener(v -> {
            entry_field.setText("");
            entry_field_2.setText("");
            result_field.setText("");
            operand_field.setText("");
            operationBul = false;

        });

        button_backspace.setOnClickListener(v -> {
            if (!result_field.getText().toString().isEmpty()){
                result_field.setText("");
            } else {
                if (!operationBul) {
                if (!entry_field.getText().toString().isEmpty())

                    entry_field.setText(entry_field.getText().toString().substring(0, entry_field.getText().toString().length() - 1));
                } else {
                    if (entry_field_2.getText().toString().isEmpty()) {
                        operand_field.setText("");
                        operationBul = false;
                    } else
                        entry_field_2.setText(entry_field_2.getText().toString().substring(0, entry_field_2.getText().toString().length() - 1));
                }


        }});


        button_equally.setOnClickListener(v -> {
            float a = Float.parseFloat(entry_field.getText().toString());
            float b = Float.parseFloat(entry_field_2.getText().toString());
            float res = calc(a, b, operand_field.getText().toString());
            if (res % 1 != 0) {
                result_field.setText(String.valueOf(res));
            } else result_field.setText(String.valueOf((int) res));

        });


    }

    public static float calc(float a, float b, String sign) {
        float result = 0.0f;
        switch (sign) {
            case ("+"):
                result = a + b;
                break;
            case ("-"):
                result = a - b;
                break;
            case ("/"):
                if (b == 0) {
                    break;
                } else result = a / b;
                break;
            case ("*"):
                result = a * b;
                break;

        }
        return result;
    }


    public static void setButtonToField(TextView textView, Button button) {

        textView.setText(String.format(Locale.getDefault(), textView.getText().toString() + button.getText().toString()));

    }
}