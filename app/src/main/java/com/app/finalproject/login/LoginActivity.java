package com.app.finalproject.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.app.finalproject.MainActivity;
import com.app.finalproject.R;
import com.app.finalproject.registration.RegistrationActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    TextView textRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.button_sign_up);
        textRegister = findViewById(R.id.text_goto_sign_up);

        btnLogin.setOnClickListener(this);
        textRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_sign_up:
                openMainActivity();
                break;
            case R.id.text_goto_sign_up:
                openRegisterActivity();
                break;
            default:
                break;
        }
    }

    private void openRegisterActivity() {
        finish();
    }

    private void openMainActivity() {
        setResult(3);
        finish();
    }
}
