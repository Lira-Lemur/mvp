package com.example.eparpalac.mvpapp.model;

import com.example.eparpalac.mvpapp.model.api.ApiClient;
import com.example.eparpalac.mvpapp.model.api.ApiInterface;
import com.example.eparpalac.mvpapp.model.callbacks.CallbackInterface;
import com.example.eparpalac.mvpapp.model.comedy.ComedyResponse;
import com.example.eparpalac.mvpapp.model.horror.HorrorResponse;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataApi {

    private ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

    public void getHorrorsList(final CallbackInterface callback) {
        apiService.getHorrors().enqueue(new Callback<HorrorResponse>() {
            @Override
            public void onResponse(Call<HorrorResponse> call, Response<HorrorResponse> response) {
                callback.call(response.body().getHorrors());
            }

            @Override
            public void onFailure(Call<HorrorResponse> call, Throwable t) {

            }
        });
    }

    public ComedyResponse getComediesList() throws IOException {
        return apiService.getComedies().execute().body();
    }

}
