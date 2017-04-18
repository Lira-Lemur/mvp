package com.example.eparpalac.mvpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.eparpalac.mvpapp.view.fragments.ComedyFragment;
import com.example.eparpalac.mvpapp.view.fragments.HorrorFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ScreenManager.getInstance().setContext(this);
    }

    @OnClick(R.id.btnComedies)
    public void onComediesClick(){
        ScreenManager.getInstance().replaceFragment(new ComedyFragment());
    }

    @OnClick(R.id.btnHorrors)
    public void onHorrorsClick(){
        ScreenManager.getInstance().replaceFragment(new HorrorFragment());
    }
}