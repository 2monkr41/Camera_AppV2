package com.example.a2monkr41.android_camera;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Camera camera;
    FrameLayout frameLayout;
    CameraPreview cameraPreview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);

        camera = Camera.open();

        cameraPreview = new CameraPreview(this,camera);
        frameLayout.addView(cameraPreview);

    }
}
