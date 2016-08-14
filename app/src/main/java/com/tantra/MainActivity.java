package com.tantra;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private static final String URL_GITHUB_IO = "http://nhaarman.github.io/ListViewAnimations?ref=app";



    @SuppressLint("InlinedApi")
    @Override
    protected void onCreate(final Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void history(final View view) {
        Intent intent = new Intent(MainActivity.this, One.class);
        startActivity(intent);
    }

    public void wisdom(final View view) {
        Intent intent = new Intent(MainActivity.this, Two.class);
        startActivity(intent);
    }

    public void onAppearanceClicked(final View view) {
        Intent intent = new Intent(MainActivity.this, Three.class);
        startActivity(intent);
    }

    public void onItemManipulationClicked(final View view) {
        Intent intent = new Intent(MainActivity.this, Four.class);
        startActivity(intent);
    }

    public void onSLHClicked(final View view) {
        Intent intent = new Intent(MainActivity.this, Five.class);
        startActivity(intent);
    }

}