package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

    }

    private void insertar(){
        String sTitulo=titulo.getText().toString().trim();
        String sContenido=titulo.getText().toString().trim();
        
    }

}