package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CamaraActivity extends AppCompatActivity {
    Button  buttonMenu2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara);

        buttonMenu2 = findViewById(R.id.buttonMenu2);
        buttonMenu2.setOnClickListener(view -> camara());
    }

    private void camara(){
        intent = new Intent(getApplicationContext(), TakeCamera.class);
        startActivity(intent);
    }

}