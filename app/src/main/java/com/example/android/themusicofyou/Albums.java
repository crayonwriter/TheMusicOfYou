package com.example.android.themusicofyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //Make a GridView for the albums, don't forget to make number of columns in the XML
    }
}
