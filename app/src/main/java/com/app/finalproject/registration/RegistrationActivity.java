package com.app.finalproject.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.app.finalproject.MainActivity;
import com.app.finalproject.R;
import com.app.finalproject.login.LoginActivity;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRegistration;
    TextView textSignIn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btnRegistration = findViewById(R.id.button_verify_account);
        textSignIn = findViewById(R.id.text_link_sign_in);
        btnRegistration.setOnClickListener(this);
        textSignIn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_verify_account:
                openMainActivity();
                break;
            case R.id.text_link_sign_in:
                openLoginActivity();
                break;
            default:
                break;
        }
    }

    private void openMainActivity() {
        Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void openLoginActivity() {
        Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
        startActivityForResult(intent, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 && resultCode == 3) {
            Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
