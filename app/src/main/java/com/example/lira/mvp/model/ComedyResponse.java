package com.example.lira.mvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ComedyResponse {

    @SerializedName("comedies")
    @Expose
    private List<Comedy> comedies = null;

    public List<Comedy> getComedies() {
        return comedies;
    }

    public void setComedies(List<Comedy> comedies) {
        this.comedies = comedies;
    }
}
