package com.example.khokan.videodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView myVideoView= (VideoView) findViewById(R.id.myVideo);
        myVideoView.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.natuaral);
        MediaController mediaController =new MediaController(this);
        mediaController.setAnchorView(mediaController);
        myVideoView.setMediaController(mediaController);
        myVideoView.start();
    }
}
