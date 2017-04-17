
package com.example.lira.mvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


class Comedy extends RealmObject {

    @SerializedName("directed_by")
    @Expose
    private String directedBy;

    @PrimaryKey
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
