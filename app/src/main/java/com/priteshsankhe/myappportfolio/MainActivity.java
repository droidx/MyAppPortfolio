package com.priteshsankhe.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button spotifyStreamerAppButton;
    private Button scoresAppButton;
    private Button libraryAppButton;
    private Button buildItBiggerButton;
    private Button xyzReaderAppButton;
    private Button capstoneAppButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyStreamerAppButton = (Button) findViewById(R.id.button_spotify_streamer_app);
        scoresAppButton = (Button) findViewById(R.id.button_scores_app);
        libraryAppButton = (Button) findViewById(R.id.button_library_app);
        buildItBiggerButton = (Button) findViewById(R.id.button_build_it_bigger_app);
        xyzReaderAppButton = (Button) findViewById(R.id.button_xyz_reader_app);
        capstoneAppButton = (Button) findViewById(R.id.button_capstone_app);
    }

    public void openSpotifyStreamerApp(View view) {
        Toast.makeText(this, "This button will launch my spotify streaming app!", Toast.LENGTH_SHORT).show();
    }

    public void openScoresApp(View view) {
        Toast.makeText(this, "This button will launch my football scores app!", Toast.LENGTH_SHORT).show();
    }

    public void openLibraryApp(View view) {
        Toast.makeText(this, "This button will launch my library app!", Toast.LENGTH_SHORT).show();
    }

    public void openBuildItBiggerApp(View view) {
        Toast.makeText(this, "This button will launch my built it bigger app!", Toast.LENGTH_SHORT).show();
    }

    public void openXYZReaderApp(View view) {
        Toast.makeText(this, "This button will launch my xyz reader app!", Toast.LENGTH_SHORT).show();
    }

    public void openCapstoneApp(View view) {
        Toast.makeText(this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
    }

}
