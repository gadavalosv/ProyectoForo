package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.gadv.proyectoforo.classes.Baneados;
import com.gadv.proyectoforo.classes.Respuesta;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class BanActivity extends AppCompatActivity {
    int userType = 1;

    private RecyclerView rvBaneados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban);
        rvBaneados = findViewById(R.id.rvBaneados);

        rvBaneados.setLayoutManager(new LinearLayoutManager(this));

        volleyGet();
    }

    private void volleyGet() {
        String url=getString(R.string.ip)+"ban.php?consulta=baneo";
        List<Baneados> jsonBaneados = new ArrayList<>();

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject jsonObject = response.optJSONObject(i);
                        String correo = jsonObject.getString("correo");
                        String fechaInicio = jsonObject.getString("fecha_inicio");
                        String fechaFin = jsonObject.getString("fecha_fin");

                        jsonBaneados.add(new Baneados(correo, fechaInicio, fechaFin));
                        rvBaneados.setAdapter(new BaneadosAdapter(jsonBaneados, BanActivity.this));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
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

            case R.id.navLogout:
                intent = new Intent(BanActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}