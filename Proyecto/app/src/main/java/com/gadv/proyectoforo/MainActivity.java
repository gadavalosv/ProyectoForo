package com.gadv.proyectoforo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private final static String CHANNEL_ID = "NOTIFICACION";
    private final static int NOTIFICACION_ID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(),CHANNEL_ID);
        builder.setSmallIcon(R.drawable.ic_baseline_border_color_24);
        builder.setContentTitle("Hello dad");
        builder.setContentText("Bienvenido a la mejor app para el ceti");
        builder.setColor(Color.BLUE);
        builder.setDefaults(Notification.DEFAULT_SOUND);
    }
}