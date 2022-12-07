package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.gadv.proyectoforo.classes.Respuesta;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class BlogActivity extends AppCompatActivity {
    int userType = 1;

    private RecyclerView rvRespuestas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        rvRespuestas = findViewById(R.id.rvRespuestas);

        rvRespuestas.setLayoutManager(new LinearLayoutManager(this));

        volleyGet();
    }

    private void volleyGet() {
        String url=getString(R.string.ip)+"preguntas.php?idPregunta=1";
        List<Respuesta> jsonRespuestas = new ArrayList<>();

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    for(int i = 0; i < response.length(); i++){
                            JSONObject jsonObject = response.getJSONObject(i);
                            //JSONArray jsonArray = jsonObject.
                    }
                }
            }
        })
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
                intent = new Intent(BlogActivity.this, BanActivity.class);
                startActivity(intent);
            }
        }

        switch (id) {
            case R.id.navWelcomeActivity:
                intent = new Intent(BlogActivity.this, WelcomeActivity.class);
                startActivity(intent);
                break;

            case R.id.navMyBlogs:
                intent = new Intent(BlogActivity.this, MyBlogsActivity.class);
                startActivity(intent);
                break;

            case R.id.navLogout:
                intent = new Intent(BlogActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}