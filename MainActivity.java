package com.example.a252;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView lbl, lblresult;
    Button btn;
    EditText edt_login, edt_password;
    final String log = "login";
    final String pas = "password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn = findViewById(R.id.btn);
        this.lbl = findViewById(R.id.lbl);
        this.lblresult = findViewById(R.id.lblresult);
        this.edt_login = findViewById(R.id.edt_login);
        this.edt_password= findViewById(R.id.edt_password);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1 = edt_login.getText().toString();
        String s2 = edt_password.getText().toString();
        if (s1.equals(log) && s2.equals(pas)){
            lblresult.setText("Верно");
        }
        else{
            lblresult.setText("Вы ошиблись в логине или пароле");
            edt_login.setText(null);
            edt_password.setText(null);
        }
    }
}