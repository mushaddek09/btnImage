package com.example.btnimage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.btnimage.R;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Animation fadeInAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        fadeInAnimation = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
    }

    public void onRedButtonClick(View view) {
        imageView.setImageResource(R.drawable.cat1);
        imageView.startAnimation(fadeInAnimation);
    }

    public void onGreenButtonClick(View view) {
        imageView.setImageResource(R.drawable.cat2);
        imageView.startAnimation(fadeInAnimation);
    }

    public void onBlueButtonClick(View view) {
        imageView.setImageResource(R.drawable.cat3);
        imageView.startAnimation(fadeInAnimation);
    }
}
