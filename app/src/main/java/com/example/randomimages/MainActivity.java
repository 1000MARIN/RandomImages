package com.example.randomimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView box_be, box_bk;


    int[] images = new int[] {
            R.drawable.ic_baseline_add_24,
            R.drawable.ic_baseline_heart_24,
            R.drawable.ic_baseline_local_shipping_24,
            R.drawable.ic_baseline_pedal_bike_24,
            R.drawable.ic_baseline_star_24,
            R.drawable.ic_baseline_wb_cloudy_24
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rd = new Random();
        rd.setSeed(System.currentTimeMillis());

        Handler h1 = new Handler();
        Handler h2 = new Handler();
        Handler h3 = new Handler();
        Handler h4 = new Handler();
        Handler h5 = new Handler();
        Handler h6 = new Handler();
        Handler h7 = new Handler();
        Handler h8 = new Handler();
        Handler h9 = new Handler();
        Handler h10 = new Handler();

        box_bk = findViewById(R.id.box_bk);
        box_be = findViewById(R.id.box_be);

        h1.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.VISIBLE);
                ImageView mImageView = (ImageView)findViewById(R.id.box_bk);
                for (int i = 0; i < images.length; i++) {
                    int imageId = (int)(rd.nextInt(images.length));
                    mImageView.setImageResource(images[imageId]);
                }

            }
        }, 1000);

        h2.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.INVISIBLE);
                box_be.setVisibility(View.VISIBLE);
            }
        }, 2000);

        h3.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.VISIBLE);
                ImageView mImageView = (ImageView)findViewById(R.id.box_bk);
                int imageId = (int)(rd.nextInt(images.length));
                mImageView.setImageResource(images[imageId]);
            }
        }, 3000);

        h4.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.INVISIBLE);
                box_be.setVisibility(View.VISIBLE);
            }
        }, 4000);

        h5.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.VISIBLE);
                ImageView mImageView = (ImageView)findViewById(R.id.box_bk);
                int imageId = (int)(rd.nextInt(images.length));
                mImageView.setImageResource(images[imageId]);
            }
        }, 5000);

        h6.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.INVISIBLE);
                box_be.setVisibility(View.VISIBLE);
            }
        }, 6000);

        h7.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.VISIBLE);
                ImageView mImageView = (ImageView)findViewById(R.id.box_bk);
                int imageId = (int)(rd.nextInt(images.length));
                mImageView.setImageResource(images[imageId]);
            }
        }, 7000);

        h8.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.INVISIBLE);
                box_be.setVisibility(View.VISIBLE);
            }
        }, 8000);

        h9.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.VISIBLE);
                ImageView mImageView = (ImageView)findViewById(R.id.box_bk);
                int imageId = (int)(rd.nextInt(images.length));
                mImageView.setImageResource(images[imageId]);
            }
        }, 9000);

        h10.postDelayed(new Runnable() {
            @Override
            public void run() {
                box_bk.setVisibility(View.INVISIBLE);
                box_be.setVisibility(View.VISIBLE);
            }
        }, 10000);

    }
}



