package com.example.kelly.welcome_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// 'best practice' is to use
// - density-independent pixels for the dimensions (dp or dpi) of GUI components
// - scale independent pixels for font sizes (sp)

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
