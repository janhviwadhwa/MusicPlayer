package com.abc.musicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class song2 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private static final String TAG = "Song2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song2);

        Button playButton = findViewById(R.id.playButton);
        Button pauseButton = findViewById(R.id.pauseButton);

        try {
            mediaPlayer = MediaPlayer.create(this, R.raw.idkhowsong);
            if (mediaPlayer == null) {
                Log.e(TAG, "MediaPlayer initialization failed.");
            }
        } catch (Exception e) {
            Log.e(TAG, "Error initializing MediaPlayer: " + e.getMessage());
        }

        playButton.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                mediaPlayer.start();
            } else {
                Log.e(TAG, "MediaPlayer is not initialized.");
            }
        });

        pauseButton.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            } else {
                Log.e(TAG, "MediaPlayer is not initialized.");
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
