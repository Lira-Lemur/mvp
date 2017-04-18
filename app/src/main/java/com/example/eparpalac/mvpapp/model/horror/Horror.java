
package com.example.eparpalac.mvpapp.model.horror;

import com.example.eparpalac.mvpapp.model.Movie;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Horror implements Movie {

    @SerializedName("directed_by")
    @Expose
    private String directedBy;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("year")
    @Expose
    private Integer year;

    public String getDirectedBy() {
        return directedBy;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
