package com.example.lira.mvp.model.api;

import com.example.lira.mvp.model.ComedyResponse;
import com.example.lira.mvp.model.HorrorResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/horrors.json")
    Call<HorrorResponse> getHorrors();

    @GET("/comedies.json")
    Call<ComedyResponse> getComedies();
}