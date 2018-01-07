package com.example.hanna.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView wordImage;
        wordImage = (ImageView) findViewById(R.id.button_word);
        wordImage.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ImageView backgroundView = (ImageView) findViewById(R.id.button_word);
                backgroundView.setImageResource(R.drawable.b);

            }
        });
    }

}
