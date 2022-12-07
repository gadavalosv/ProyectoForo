package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {
    int userType = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
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
                intent = new Intent(WelcomeActivity.this, BanActivity.class);
                startActivity(intent);
            }
        }

        switch (id) {
            case R.id.navWelcomeActivity:
                Toast.makeText(getApplicationContext(), "Ya te encuentras en la pantalla de Bienvenida!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.navMyBlogs:
                intent = new Intent(WelcomeActivity.this, MyBlogsActivity.class);
                startActivity(intent);
                break;

            case R.id.navLogout:
                intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}