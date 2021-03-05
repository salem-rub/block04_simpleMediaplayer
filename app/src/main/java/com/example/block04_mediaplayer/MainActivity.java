package com.example.block04_mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySong = MediaPlayer.create(this, R.raw.mysong);
        Switch repeat = (Switch) findViewById(R.id.switch1);

        repeat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mySong.setLooping(isChecked);
            }
        });
    }

    public void play (View view) {
        mySong.start();
    }

    public void pause (View view) {
        if (mySong.isPlaying()) {
            mySong.pause();
        }
    }
}
