package com.example.eparpalac.mvpapp.model.comedy;

import com.example.eparpalac.mvpapp.model.Movie;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ComedyResponse {

    @SerializedName("comedies")
    @Expose
    private List<Comedy> comedies = null;

    public List<? extends Movie> getComedies() {
        return comedies;
    }

    public void setComedies(List<Comedy> comedies) {
        this.comedies = comedies;
    }
}
