package com.example.eparpalac.mvpapp.model.api;

import com.example.eparpalac.mvpapp.model.movie.Movie;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/comedies.json")
    Call<Movie[]> getComedies();

    @GET("/horrors.json")
    Call<Movie[]> getHorrors();
}