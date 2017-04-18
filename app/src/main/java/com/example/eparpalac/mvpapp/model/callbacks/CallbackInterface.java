package com.example.eparpalac.mvpapp.model.callbacks;


import com.example.eparpalac.mvpapp.model.Movie;

import java.util.List;

public interface CallbackInterface {
    void call(List<? extends Movie> movies);
}
