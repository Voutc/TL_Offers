package com.example.voutsas.tl_offers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button btnLogin = (Button) findViewById(R.id.btnLogin);
        final TextView regLink = (TextView) findViewById(R.id.regLink);

        regLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regIntent = new Intent(LoginActivity.this,Register.class);
                LoginActivity.this.startActivity(regIntent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnIntent = new Intent(LoginActivity.this,MapsActivity.class);
                LoginActivity.this.startActivity(btnIntent);
            }
        });


    }
}
