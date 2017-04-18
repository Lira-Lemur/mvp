package com.example.eparpalac.mvpapp.presenter;

import com.example.eparpalac.mvpapp.model.DataApi;
import com.example.eparpalac.mvpapp.model.Movie;
import com.example.eparpalac.mvpapp.model.callbacks.CallbackInterface;
import com.example.eparpalac.mvpapp.model.callbacks.PresenterCallback;
import com.example.eparpalac.mvpapp.model.horror.HorrorResponse;
import com.example.eparpalac.mvpapp.model.MovieAdapter;

import java.io.IOException;
import java.util.List;

class HorrorPresenter implements MoviePresenter {

    private DataApi dataApi = new DataApi();

    @Override
    public void loadData(CallbackInterface fragmentCallback) throws IOException {
        PresenterCallback callback = new PresenterCallback(fragmentCallback);
        dataApi.getHorrorsList(callback);
//        List<? extends Movie> movies = response.getHorrors();
//        new MovieAdapter(movies);
    }
}
