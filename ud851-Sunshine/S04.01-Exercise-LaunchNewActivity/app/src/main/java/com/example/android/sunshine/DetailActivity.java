package com.example.android.sunshine;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mshai4 on 4/5/18.
 */

public class DetailActivity extends AppCompatActivity {
    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
