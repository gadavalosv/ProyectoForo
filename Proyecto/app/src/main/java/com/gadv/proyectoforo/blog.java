package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
    }
    public void escuchar(View view){
        Intent intent = new Intent(blog.this,multimedia.class);
        startActivity(intent);

    }

}