package com.example.eparpalac.mvpapp.model.callbacks;


import com.example.eparpalac.mvpapp.model.movie.Movie;

import java.util.List;

public interface CallbackInterface {
    void call(List<Movie> movies);
}
