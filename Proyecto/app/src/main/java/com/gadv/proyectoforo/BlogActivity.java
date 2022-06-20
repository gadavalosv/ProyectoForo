package com.gadv.proyectoforo;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;

import com.gadv.proyectoforo.classes.Respuesta;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Objects;

public class BlogActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;
    int userType = 0;
    private RecyclerView recyclerView;
    ArrayList<Respuesta> listaRespuestas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        recyclerView = findViewById(R.id.rvRespuestas);
        listaRespuestas = new ArrayList<>();
        int idForo = getIntent().getIntExtra("idForo", 0);
        
        RespuestaAdapter respuestaAdapter = new RespuestaAdapter(listaRespuestas);
        recyclerView.setAdapter(respuestaAdapter);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        drawerLayout = findViewById(R.id.drawer_layout);

        drawerToggle = setupDrawerToggle();
        drawerToggle.setDrawerIndicatorEnabled(true);
        drawerToggle.syncState();

        drawerLayout.addDrawerListener(drawerToggle);

        navigationView = findViewById(R.id.nvView);
        selectNavigationView(userType);
        setupDrawerContent(navigationView);
    }

    private void selectNavigationView(int uT){
        navigationView.getMenu().clear();

        if(uT == 0) navigationView.inflateMenu(R.menu.navigation_menu);
        else navigationView.inflateMenu(R.menu.navigation_menu_two);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open,  R.string.drawer_close);
    }

    private void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(
                menuItem -> {
                    selectDrawerItem(menuItem);
                    return true;
                });
    }

    @SuppressLint("NonConstantResourceId")
    public void selectDrawerItem(MenuItem menuItem) {
        Intent intent;

        switch(menuItem.getItemId()) {
            case R.id.navMyBlogs: //As test
                intent = new Intent(BlogActivity.this, MainActivity.class); //Here goes myBlogsActivity
                startActivity(intent);
                break;

            case R.id.navSearchBlogs:
                /*
                intent = new Intent(MainActivity.this, WelcomeMain.class); //Here goes searchBlogsActivity
                startActivity(intent);
                */
                break;

            case R.id.navDenyAccess:
                /*
                intent = new Intent(MainActivity.this, WelcomeMain.class); //Here goes denyAccessActivity
                startActivity(intent);
                */
                break;

            case R.id.navLogout:
                /*
                intent = new Intent(MainActivity.this, WelcomeMain.class); //Here goes logoutActivity
                startActivity(intent);
                */
                break;
        }

        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        drawerLayout.closeDrawers();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }
}