package com.example.eparpalac.mvpapp.model;

import com.example.eparpalac.mvpapp.model.api.ApiClient;
import com.example.eparpalac.mvpapp.model.api.ApiInterface;
import com.example.eparpalac.mvpapp.model.callbacks.CallbackInterface;
import com.example.eparpalac.mvpapp.model.movie.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataApi {

    private ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

    public void getHorrorsList(CallbackInterface callback) {
        this.requestData(apiService.getComedies(), callback);
    }

    public void getComediesList(CallbackInterface callback) {
        this.requestData(apiService.getHorrors(), callback);
    }

    private void requestData(Call<Movie[]> call, final CallbackInterface callback) {
        call.enqueue(new Callback<Movie[]>() {
            @Override
            public void onResponse(Call<Movie[]> call, Response<Movie[]> response) {
                List<Movie> movies = new ArrayList<>();
                Collections.addAll(movies, response.body());
                callback.call(movies);
            }

            @Override
            public void onFailure(Call<Movie[]> call, Throwable t) {
            }
        });
    }

}
