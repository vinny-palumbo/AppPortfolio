package com.vinnypalumbo.vinnysappportfolio;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(Color.BLUE);
        setSupportActionBar(toolbar);

    }

    public void popularMoviesClicked(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Popular Movies app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void scoresAppClicked(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Football Scores app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void libraryAppClicked(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Library app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void buildItBiggerClicked(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build It Bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void xYZReaderClicked(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch XYZ Reader app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void capstoneAppClicked(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }
}
