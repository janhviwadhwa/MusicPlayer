package com.abc.musicplayer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button song1Button = findViewById(R.id.button_song1);
        Button song2Button = findViewById(R.id.button_song2);
        Button song3Button = findViewById(R.id.button_song3);

        song1Button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, song.class);
            startActivity(intent);
        });

        song2Button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, song2.class);
            startActivity(intent);
        });

        song3Button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, song3.class);
            startActivity(intent);
        });
    }
}
