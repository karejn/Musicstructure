package com.example.ekzhu.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the playing category
        Button playing = (Button) findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the songs category
        Button allsongs = (Button) findViewById(R.id.allsongs);

        // Set a click listener on that View
        allsongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the artist category
        Button artist = (Button) findViewById(R.id.artist);

        // Set a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the album category
        Button album = (Button) findViewById(R.id.album);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(phrasesIntent);
            }
        });

        // Find the View that shows the playlist category
        Button playlist = (Button) findViewById(R.id.playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }
}
