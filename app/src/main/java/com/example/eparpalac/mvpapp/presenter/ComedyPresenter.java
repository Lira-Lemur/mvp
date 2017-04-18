package com.example.eparpalac.mvpapp.presenter;

import com.example.eparpalac.mvpapp.model.DataApi;
import com.example.eparpalac.mvpapp.model.Movie;
import com.example.eparpalac.mvpapp.model.MovieAdapter;
import com.example.eparpalac.mvpapp.model.comedy.ComedyResponse;

import java.io.IOException;
import java.util.List;

class ComedyPresenter implements MoviePresenter {

    private DataApi dataApi = new DataApi();

    @Override
    public void loadData() throws IOException {
        ComedyResponse response = dataApi.getComediesList();
        List<? extends Movie> movies = response.getComedies();
        new MovieAdapter(movies);
    }
}
