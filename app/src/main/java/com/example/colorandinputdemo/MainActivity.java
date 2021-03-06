package com.example.colorandinputdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Grab the text from the EditText and put it in the output
     * @param view
     */
    public void submit(View view) {
        EditText input = findViewById(R.id.input);
        String inputText = input.getText().toString();

        TextView display = findViewById(R.id.output);
        display.setText(inputText);

        int red = (int) (256 * Math.random());
        int green= (int) (256 * Math.random());
        int blue = (int) (256 * Math.random());
        display.setBackgroundColor(Color.rgb(red, green, blue));
    }
}
