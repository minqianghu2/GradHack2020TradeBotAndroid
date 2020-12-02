package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        final ImageButton secloginButton = (ImageButton) findViewById(R.id.imageButtonSecSignIn);
        secloginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent goToLogInPageIntent = new Intent(SignInActivity.this, TradeUserHomeActivity.class);
                SignInActivity.this.startActivity(goToLogInPageIntent);
            }
        });
    }
}