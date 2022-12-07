package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BanActivity extends AppCompatActivity {
    int userType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.navigation_menu_two, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        int id = menuItem.getItemId();

        switch (id) {
            case R.id.navWelcomeActivity:
                intent = new Intent(BanActivity.this, WelcomeActivity.class);
                startActivity(intent);
                break;

            case R.id.navMyBlogs:
                intent = new Intent(BanActivity.this, MyBlogsActivity.class);
                startActivity(intent);
                break;

            case R.id.navDenyAccess:
                Toast.makeText(getApplicationContext(), "Ya te encuentras en la pantalla de Restringir acceso!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.navTakePicture:
                intent = new Intent(BanActivity.this, TakeCamera.class);
                startActivity(intent);
                break;

            case R.id.navLogout:
                intent = new Intent(BanActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}