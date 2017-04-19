package com.example.eparpalac.mvpapp.model.callbacks;

import com.example.eparpalac.mvpapp.model.movie.Movie;

import java.util.List;

public class PresenterCallback implements CallbackInterface {

    private CallbackInterface fragmentCallback;

    public PresenterCallback(CallbackInterface fragmentCallback) {

        this.fragmentCallback = fragmentCallback;
    }

    @Override
    public void call(List<Movie> movies) {
        fragmentCallback.call(movies);
    }
}
