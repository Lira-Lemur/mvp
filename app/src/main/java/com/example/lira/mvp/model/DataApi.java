package com.example.lira.mvp.model;

import com.example.lira.mvp.model.api.ApiClient;
import com.example.lira.mvp.model.api.ApiInterface;

import java.io.IOException;

public class DataApi {

    private ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

    public HorrorResponse getHorrorsList() throws IOException {
        return apiService.getHorrors().execute().body();
    }

    public ComedyResponse getComediesList() throws IOException {
        return apiService.getComedies().execute().body();
    }

}
