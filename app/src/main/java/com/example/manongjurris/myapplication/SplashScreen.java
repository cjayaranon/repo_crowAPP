package com.example.manongjurris.myapplication;

/**
 * Created by Manong Jurris on 11/20/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        final ImageView splashIcon = (ImageView) findViewById(R.id.imageView);

        final Animation fadeIn = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_in);
        fadeIn.setDuration(3000);

        final Animation fadeOut = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);
        fadeOut.setDuration(3000);

        splashIcon.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener(){
          @Override
          public void onAnimationStart(Animation animation){

          }

          @Override
          public void onAnimationEnd(Animation animation){
              splashIcon.startAnimation(fadeOut);

              Intent i = new Intent(getBaseContext(), SplashScreen2.class);
              startActivity(i);
              finish();
          }

          @Override
          public void onAnimationRepeat(Animation animation){


          }
      });

    }
}