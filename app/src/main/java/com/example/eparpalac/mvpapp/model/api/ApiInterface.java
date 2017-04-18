package com.example.eparpalac.mvpapp.model.api;

import com.example.eparpalac.mvpapp.model.comedy.ComedyResponse;
import com.example.eparpalac.mvpapp.model.horror.HorrorResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/horrors.json")
    Call<HorrorResponse> getHorrors();

    @GET("/comedies.json")
    Call<ComedyResponse> getComedies();
}