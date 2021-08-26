package com.example.images_and_graphics_5_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView2);

        Resources res = this.getResources();
        Drawable myImage = ResourcesCompat.getDrawable(res, R.drawable.ic_launcher_background, null);

        imageView.setImageDrawable(myImage);
    }
}