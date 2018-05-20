package com.example.android.themusicofyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view to connect OnClickListener to the album view
        TextView albumView = findViewById(R.id.albums);

        //Create album intent
        final Intent albumsIntent = new Intent(MainActivity.this, Albums.class);

        //Attach OnClickListener to the view
        albumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(albumsIntent);
            }

        });

    }

}

