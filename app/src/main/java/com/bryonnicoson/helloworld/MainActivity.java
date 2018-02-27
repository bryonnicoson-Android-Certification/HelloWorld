package com.bryonnicoson.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.IOError;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Log.d(LOG_TAG, "Hello, World!");
        } catch (IOError e) {
            Log.wtf(LOG_TAG, "WTF!? This should never happen.", e.getCause());
        }
    }
}
