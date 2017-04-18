package com.example.eparpalac.mvpapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

class ScreenManager {

    private static ScreenManager instance;

    private Activity context;

    private ScreenManager () {}

    public static ScreenManager getInstance() {
        if (instance == null) {
            instance = new ScreenManager ();
        }
        return instance;
    }

    public void setContext(Context context) {
        this.context = (Activity) context;
    }

    public void replaceFragment(Fragment fragment){
        context.getFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commit();
    }
}
