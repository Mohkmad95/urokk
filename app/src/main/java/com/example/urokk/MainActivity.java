package com.example.urokk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv_voity;
    private TextView welcome;
    private TextView makeVhod;
    private TextView register;
    private TextView forget;
    private TextView tv_orangnew;
    private EditText et_Email;
    private EditText et_password;
    private Button button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_Email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        tv_voity = findViewById(R.id.tv_vhod);
        welcome = findViewById(R.id.tv_welcome);
        makeVhod = findViewById(R.id.tv_makevhod);
        register = findViewById(R.id.tv_register);
        forget = findViewById(R.id.tv_forget);
        tv_orangnew = findViewById(R.id.tv_orangecolor);
        button = findViewById(R.id.button);


        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (et_password.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.black));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        et_Email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (et_Email.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.black));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_Email.getText().toString().equals("admin") && et_password.getText().toString().equals("admin")) {
                    et_Email.setVisibility(View.GONE);
                    et_password.setVisibility(View.GONE);
                    tv_voity.setVisibility(View.GONE);
                    makeVhod.setVisibility(View.GONE);
                    register.setVisibility(View.GONE);
                    forget.setVisibility(View.GONE);
                    tv_orangnew.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

