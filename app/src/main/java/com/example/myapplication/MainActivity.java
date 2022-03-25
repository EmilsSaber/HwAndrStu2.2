package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText gmail;
    private EditText passvord;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.editTextTextEmailAddress);
        TextView textView1 = findViewById(R.id.editTextTextPassword);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView4 = findViewById(R.id.textView4);
        TextView vhod = findViewById(R.id.vhod);
        Button btn = findViewById(R.id.btn);
        LinearLayout l1 = findViewById(R.id.linearLayout);
        LinearLayout l2 = findViewById(R.id.linearLayout3);

        gmail = findViewById(R.id.editTextTextEmailAddress);
        passvord = findViewById(R.id.editTextTextPassword);
        button = findViewById(R.id.btn);

        passvord.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


            @Override
            public void afterTextChanged(Editable editable) {
                if (passvord.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.dark2));

                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));

                }

            }
        });

        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


            @Override
            public void afterTextChanged(Editable editable) {
                if (gmail.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.dark2));

                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));

                }


            }


        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = textView.getText().toString();
                String parol = textView1.getText().toString();
                String admin = "admin";
                if (mail.equals(admin) && parol.equals(admin)) {
                    textView.animate().alpha(0);
                    textView1.animate().alpha(0);
                    textView2.animate().alpha(0);
                    textView4.animate().alpha(0);
                    vhod.animate().alpha(0);
                    btn.animate().alpha(0);
                    l2.animate().alpha(0);
                    l1.animate().alpha(0);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегестрировались", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Вы обосрались", Toast.LENGTH_SHORT).show();
            }
        });


    }
}