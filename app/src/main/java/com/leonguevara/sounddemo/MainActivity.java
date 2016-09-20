package com.leonguevara.sounddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mpChipmunks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mplayer = MediaPlayer.create(this, R.raw.kidlaugh);

        mpChipmunks = MediaPlayer.create(this, R.raw.chipmunks);

        mplayer.start();
    }

    public void playAudio(View view) {
        mpChipmunks.start();
    }

    public void pauseAudio(View view) {
        mpChipmunks.pause();
    }
}
