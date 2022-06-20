package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class newBlog extends AppCompatActivity {
    TextView titulo;
    TextView contenido;
    Button   btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_blog);
        titulo=(TextView) findViewById(R.id.tituloNewBlog);
        contenido=(TextView) findViewById(R.id.contenidoNewBlog);

        btn1=findViewById(R.id.subirBlog);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                insertar();


            }
        });

    }
    private void insertar(){
        String sTitulo=titulo.getText().toString().trim();
        String sContenido=titulo.getText().toString().trim();

        ProgressDialog progressDialog =new ProgressDialog(this);


        StringRequest request = new StringRequest(Request.Method.POST, "https://gadvnautica.000webhostapp.com/pregunta.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                if (response.equalsIgnoreCase("Datos insertados")) {
                    Toast.makeText(newBlog.this, "datos ingresados", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();


                } else {
                    Toast.makeText(newBlog.this, "coneccion fallida", Toast.LENGTH_SHORT).show();
                }

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(newBlog.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();

            }
        }){
            protected Map<String,String> getParams() throws AuthFailureError{

                Map<String, String>params=new HashMap<String, String>();
                params.put("titulo",sTitulo);
                params.put("pregunta",sContenido);
                return super.getParams();

            }


        };

        RequestQueue requestQueue = Volley.newRequestQueue(newBlog.this);
        requestQueue.add(request);

    }

}

