package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AppStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_start);

        final ImageButton loginButton = (ImageButton) findViewById(R.id.imageButtonFirSignIn);
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent goToSignInPageIntent = new Intent(AppStart.this, SignInActivity.class);
                AppStart.this.startActivity(goToSignInPageIntent);
            }
        });


    }

}