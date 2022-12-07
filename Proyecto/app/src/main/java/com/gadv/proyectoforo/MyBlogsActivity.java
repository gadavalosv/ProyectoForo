package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MyBlogsActivity extends AppCompatActivity {
    int userType = 1;

    Intent intent;
    Button buttonNewBlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_blogs);

        buttonNewBlog = findViewById(R.id.crearForo);
        buttonNewBlog.setOnClickListener(view -> newBlog());
    }

    public boolean onCreateOptionsMenu(Menu menu){
        if(userType == 0) getMenuInflater().inflate(R.menu.navigation_menu, menu);
        else getMenuInflater().inflate(R.menu.navigation_menu_two, menu);

        return true;
    }

    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        int id = menuItem.getItemId();

        if (userType == 1) {
            if (id == R.id.navDenyAccess) {
                intent = new Intent(MyBlogsActivity.this, BanActivity.class);
                startActivity(intent);
            }
        }

        switch (id) {
            case R.id.navWelcomeActivity:
                intent = new Intent(MyBlogsActivity.this, WelcomeActivity.class);
                startActivity(intent);
                break;

            case R.id.navMyBlogs:
                Toast.makeText(getApplicationContext(), "Ya te encuentras en la pantalla de Mis blogs!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.navTakePicture:
                intent = new Intent(MyBlogsActivity.this, TakeCamera.class);
                startActivity(intent);
                break;

            case R.id.navLogout:
                intent = new Intent(MyBlogsActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(menuItem);
    }

    private void newBlog(){
        intent = new Intent(MyBlogsActivity.this, NewBlogActivity.class);
        startActivity(intent);
    }
}