package com.example.eparpalac.mvpapp.model.horror;

import com.example.eparpalac.mvpapp.model.Movie;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HorrorResponse {

    @SerializedName("horrors")
    @Expose
    private List<Horror> horrors = null;

    public List<? extends Movie> getHorrors() {
        return horrors;
    }

    public void setHorrors(List<Horror> horrors) {
        this.horrors = horrors;
    }

}
