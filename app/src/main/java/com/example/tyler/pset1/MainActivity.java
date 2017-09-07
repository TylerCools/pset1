package com.example.tyler.pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.view.View.onClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void addPart(View view) {
//        final CheckBox arms = (CheckBox) findViewById(R.id.Arms);
//        arms.setOnClickListener(new View.OnClickListener() {
//        final ImageView image = (ImageView)findViewById(R.id.ImageArms);
        boolean checked = ((CheckBox) view).isChecked();
        ImageView image;
        // Check which checkbox was clicked
        switch(view.getId()) {

            case R.id.Arms:
                image = (ImageView)findViewById(R.id.ImageArms);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;

            case R.id.Hat:
                image = (ImageView)findViewById(R.id.ImageHat);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;

            case R.id.Eyes:
                image = (ImageView)findViewById(R.id.ImageEyes);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;

            case R.id.Shoes:
                image = (ImageView)findViewById(R.id.ImageShoes);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;

            case R.id.Eyebrows:
                image = (ImageView)findViewById(R.id.ImageEyebrows);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;

            case R.id.Mustache:
                image = (ImageView)findViewById(R.id.ImageMustache);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;

            case R.id.Glasses:
                image = (ImageView)findViewById(R.id.ImageGlasses);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;

            case R.id.Mouth:
                image = (ImageView)findViewById(R.id.ImageMouth);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;

            case R.id.Ears:
                image = (ImageView)findViewById(R.id.ImageEars);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;

            case R.id.Nose:
                image = (ImageView)findViewById(R.id.ImageNose);
                if (checked)
                    image.setVisibility(View.VISIBLE);
                else
                    image.setVisibility(View.INVISIBLE);
                break;
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Make sure to call the super method so that the states of our views are saved
        super.onSaveInstanceState(outState);
        // Save our own state now
        ImageView ImageArms = (ImageView)findViewById(R.id.ImageArms);
        int armsVal = ImageArms.getVisibility();
        if(armsVal == View.VISIBLE) {
            outState.putInt("arms", 1);
        }

        ImageView ImageEyebrows = (ImageView)findViewById(R.id.ImageEyebrows);
        int eyebrowsVal = ImageEyebrows.getVisibility();
        if(eyebrowsVal == View.VISIBLE) {
            outState.putInt("eyebrows", 1);
        }

        ImageView ImageEars = (ImageView)findViewById(R.id.ImageEars);
        int earsVal = ImageEars.getVisibility();
        if(earsVal == View.VISIBLE) {
            outState.putInt("ears", 1);
        }

        ImageView ImageEyes = (ImageView)findViewById(R.id.ImageEyes);
        int eyesVal = ImageEyes.getVisibility();
        if(eyesVal == View.VISIBLE) {
            outState.putInt("eyes", 1);
        }

        ImageView ImageGlasses = (ImageView)findViewById(R.id.ImageGlasses);
        int glassesVal = ImageGlasses.getVisibility();
        if(glassesVal == View.VISIBLE) {
            outState.putInt("glasses", 1);
        }

        ImageView ImageHat = (ImageView)findViewById(R.id.ImageHat);
        int hatVal = ImageHat.getVisibility();
        if(hatVal == View.VISIBLE) {
            outState.putInt("hat", 1);
        }

        ImageView ImageMouth = (ImageView)findViewById(R.id.ImageMouth);
        int mouthVal = ImageArms.getVisibility();
        if(mouthVal == View.VISIBLE) {
            outState.putInt("mouth", 1);
        }

        ImageView ImageMustache = (ImageView)findViewById(R.id.ImageMustache);
        int mustacheVal = ImageMustache.getVisibility();
        if(mustacheVal == View.VISIBLE) {
            outState.putInt("mustache", 1);
        }

        ImageView ImageNose = (ImageView)findViewById(R.id.ImageNose);
        int noseVal = ImageNose.getVisibility();
        if(noseVal == View.VISIBLE) {
            outState.putInt("nose", 1);
        }

        ImageView ImageShoes = (ImageView)findViewById(R.id.ImageShoes);
        int shoesVal = ImageShoes.getVisibility();
        if(shoesVal == View.VISIBLE) {
            outState.putInt("shoes", 1);
        }
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        ImageView ImageArms = (ImageView)findViewById(R.id.ImageArms);
        int armsVal = ImageArms.getVisibility();
        if(savedInstanceState.getInt("arms") == 1) {
            ImageArms.setVisibility(View.VISIBLE);
        }

        ImageView ImageEyebrows = (ImageView)findViewById(R.id.ImageEyebrows);
        int eyebrowsVal = ImageEyebrows.getVisibility();
        if(savedInstanceState.getInt("eyebrows") == 1) {
            ImageEyebrows.setVisibility(View.VISIBLE);
        }

        ImageView ImageEars = (ImageView)findViewById(R.id.ImageEars);
        int earsVal = ImageEars.getVisibility();
        if(savedInstanceState.getInt("ears") == 1) {
            ImageEars.setVisibility(View.VISIBLE);
        }

        ImageView ImageEyes = (ImageView)findViewById(R.id.ImageEyes);
        int eyesVal = ImageEyes.getVisibility();
        if(savedInstanceState.getInt("eyes") == 1) {
            ImageEyes.setVisibility(View.VISIBLE);
        }

        ImageView ImageGlasses = (ImageView)findViewById(R.id.ImageGlasses);
        int glassesVal = ImageGlasses.getVisibility();
        if(savedInstanceState.getInt("glasses") == 1) {
            ImageGlasses.setVisibility(View.VISIBLE);
        }

        ImageView ImageHat = (ImageView)findViewById(R.id.ImageHat);
        int hatVal = ImageHat.getVisibility();
        if(savedInstanceState.getInt("hat") == 1) {
            ImageHat.setVisibility(View.VISIBLE);
        }

        ImageView ImageMouth = (ImageView)findViewById(R.id.ImageMouth);
        int mouthVal = ImageArms.getVisibility();
        if(savedInstanceState.getInt("mouth") == 1) {
            ImageMouth.setVisibility(View.VISIBLE);
        }

        ImageView ImageMustache = (ImageView)findViewById(R.id.ImageMustache);
        int mustacheVal = ImageMustache.getVisibility();
        if(savedInstanceState.getInt("mustache") == 1) {
            ImageMustache.setVisibility(View.VISIBLE);
        }

        ImageView ImageNose = (ImageView)findViewById(R.id.ImageNose);
        int noseVal = ImageNose.getVisibility();
        if(savedInstanceState.getInt("nose") == 1) {
            ImageNose.setVisibility(View.VISIBLE);
        }

        ImageView ImageShoes = (ImageView)findViewById(R.id.ImageShoes);
        int shoesVal = ImageShoes.getVisibility();
        if(savedInstanceState.getInt("shoes") == 1) {
            ImageShoes.setVisibility(View.VISIBLE);
        }
    }
}
