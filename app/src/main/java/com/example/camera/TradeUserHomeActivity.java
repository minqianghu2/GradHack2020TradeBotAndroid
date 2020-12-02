package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TradeUserHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trade_user_home);

        final Button goToHomeBtn = (Button) findViewById(R.id.button);
        goToHomeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent goToHome = new Intent(TradeUserHomeActivity.this, AppStart.class);
                TradeUserHomeActivity.this.startActivity(goToHome);
            }
        });
    }
}