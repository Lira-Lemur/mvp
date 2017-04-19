package com.example.eparpalac.mvpapp.presenter;

import com.example.eparpalac.mvpapp.model.DataApi;
import com.example.eparpalac.mvpapp.model.callbacks.CallbackInterface;
import com.example.eparpalac.mvpapp.model.callbacks.PresenterCallback;

class ComedyPresenter implements MoviePresenter {

    private DataApi dataApi = new DataApi();

    @Override
    public void loadData(CallbackInterface fragmentCallback) {
        System.out.println("Comedy presenter load data");
        PresenterCallback callback = new PresenterCallback(fragmentCallback);
        dataApi.getComediesList(callback);
    }
}
