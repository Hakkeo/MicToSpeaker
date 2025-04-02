package com.example.mictospeaker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AudioHandler audioHandler;
    private Button startButton, stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons and audio handler
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);
        audioHandler = new AudioHandler();

        // Start recording and playing audio when Start button is clicked
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHandler.start();
            }
        });

        // Stop recording and playing audio when Stop button is clicked
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHandler.stop();
            }
        });
    }
}
