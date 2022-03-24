package com.src.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import com.src.coloredtoast.ColoredToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColoredToast coloredToast= new ColoredToast(MainActivity.this);

        findViewById(R.id.button).setOnClickListener(v->
                coloredToast.success("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
        findViewById(R.id.button2).setOnClickListener(v->
                coloredToast.fail("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
        findViewById(R.id.button3).setOnClickListener(v->
                coloredToast.warning("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
        findViewById(R.id.button4).setOnClickListener(v->
                coloredToast.info("Welcome to Colored Toast", Toast.LENGTH_SHORT).show());
        findViewById(R.id.button5).setOnClickListener(v->
                coloredToast.customs("Welcome to Colored Toast", Toast.LENGTH_SHORT,
                R.color.white, //Must be from Resource - Ignore 0
                android.R.drawable.editbox_dropdown_dark_frame,//Must be from Resource - Ignore 0
                Color.argb(205, 182, 104, 0),//Must be argb - Ignore 0
                android.R.drawable.btn_star_big_on,//Must be from Resource - Ignore 0
                        Gravity.BOTTOM // Ignore 0
                ).show());
    }
}