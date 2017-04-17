
package com.example.lira.mvp.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HorrorResponse {

    @SerializedName("horrors")
    @Expose
    private List<Horror> horrors = null;

    public List<Horror> getHorrors() {
        return horrors;
    }

    public void setHorrors(List<Horror> horrors) {
        this.horrors = horrors;
    }

}
