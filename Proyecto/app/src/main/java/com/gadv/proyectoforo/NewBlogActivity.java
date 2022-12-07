package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class NewBlogActivity extends AppCompatActivity {
    int userType = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_blog);
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
                intent = new Intent(NewBlogActivity.this, BanActivity.class);
                startActivity(intent);
            }
        }

        switch (id) {
            case R.id.navWelcomeActivity:
                intent = new Intent(NewBlogActivity.this, WelcomeActivity.class);
                startActivity(intent);
                break;

            case R.id.navMyBlogs:
                intent = new Intent(NewBlogActivity.this, MyBlogsActivity.class);
                startActivity(intent);
                break;

            case R.id.navTakePicture:
                intent = new Intent(NewBlogActivity.this, TakeCamera.class);
                startActivity(intent);
                break;

            case R.id.navLogout:
                intent = new Intent(NewBlogActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}