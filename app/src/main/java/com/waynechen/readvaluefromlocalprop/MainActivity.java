package com.waynechen.readvaluefromlocalprop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "WayneC_RVFLP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "BuildConfig.APIKEY_STAGING: " + BuildConfig.APIKEY_STAGING);
        Log.i(TAG, "BuildConfig.TEST_INT: " + BuildConfig.TEST_INT);
        Log.i(TAG, "R.string.developer_key: " + getResources().getString(R.string.developer_key));
    }
}
