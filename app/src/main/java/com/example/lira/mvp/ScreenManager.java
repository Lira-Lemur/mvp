package com.example.lira.mvp;

public class ScreenManager {

    private static ScreenManager instance;

    private ScreenManager () {}

    public static ScreenManager getInstance() {
        if (instance == null) {
            instance = new ScreenManager ();
        }
        return instance;
    }
}
