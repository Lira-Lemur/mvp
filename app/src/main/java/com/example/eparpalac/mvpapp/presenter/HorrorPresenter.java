package com.example.eparpalac.mvpapp.presenter;

import com.example.eparpalac.mvpapp.model.DataApi;
import com.example.eparpalac.mvpapp.model.callbacks.CallbackInterface;
import com.example.eparpalac.mvpapp.model.callbacks.PresenterCallback;


class HorrorPresenter implements MoviePresenter {

    private DataApi dataApi = new DataApi();

    @Override
    public void loadData(CallbackInterface fragmentCallback) {
        PresenterCallback callback = new PresenterCallback(fragmentCallback);
        dataApi.getHorrorsList(callback);
    }
}
