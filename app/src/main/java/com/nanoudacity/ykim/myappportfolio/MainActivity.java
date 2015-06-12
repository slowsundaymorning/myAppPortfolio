package com.nanoudacity.ykim.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildButtons();
    }

    private void buildButtons() {
        Button spotifyBtn = (Button) findViewById(R.id.spotify_launch_btn);
        spotifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getString(R.string.spotify_toast_txt));
            }
        });

        Button scoresBtn = (Button) findViewById(R.id.scores_launch_btn);
        scoresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getString(R.string.scores_toast_txt));
            }
        });

        Button LibraryBtn = (Button) findViewById(R.id.library_launch_btn);
        LibraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getString(R.string.library_toast_txt));
            }
        });

        Button buildItBiggerBtn = (Button) findViewById(R.id.build_it_bigger_launch_btn);
        buildItBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getString(R.string.build_it_bigger_toast_txt));
            }
        });

        Button baconReaderBtn = (Button) findViewById(R.id.bacon_reader_launch_btn);
        baconReaderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getString(R.string.bacon_reader_toast_txt));
            }
        });

        Button capstoneBtn = (Button) findViewById(R.id.capstone_launch_btn);
        capstoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getString(R.string.capstone_toast_txt));
            }
        });
    }

    private static Toast myToast;
    private void showToast(String textToShow) {
        if(myToast != null)
            myToast.cancel();
        CharSequence text = getString(R.string.common_toast_txt) +" "+ textToShow;
        myToast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        myToast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
