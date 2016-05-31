package com.itshiteshverma.timechooser;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    Animation animAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim);  //initilizing the animation


    }

    public void onButtonClicked(View v){
        v.startAnimation(animAlpha);
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(),"TimePicker");
    }

    public void onButtonClicked2(View v){
        v.startAnimation(animAlpha);
        DialogFragment newFragment = new TimePickerFragment2();
        newFragment.show(getFragmentManager(),"TimePicker");
    }
}