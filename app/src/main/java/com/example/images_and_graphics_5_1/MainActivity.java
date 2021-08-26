package com.example.images_and_graphics_5_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = this.getResources();
        TransitionDrawable transition =
                (TransitionDrawable) ResourcesCompat.getDrawable(res, R.drawable.expand_collapse, null);

        ImageView image = (ImageView) findViewById(R.id.imageView2);
        image.setImageDrawable(transition);

// Description of the initial state that the drawable represents.
        image.setContentDescription(getResources().getString(R.string.my_image_desc));

// Then you can call the TransitionDrawable object's methods.
        transition.startTransition(1000);

// After the transition is complete, change the image's content description
// to reflect the new state.
    }
}