package com.example.eparpalac.mvpapp.model;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eparpalac.mvpapp.R;
import com.example.eparpalac.mvpapp.model.movie.Movie;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<Movie> movieList;

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.movieTitle)
        TextView movieTitle;
        @BindView(R.id.movieDirector)
        TextView movieDirector;
        @BindView(R.id.movieYear)
        TextView movieYear;

        ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }

    public MovieAdapter() {
        this.movieList = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Movie movie = movieList.get(position);

        Log.w("ITEM", movie.getName());

        holder.movieTitle.setText(movie.getName());
        holder.movieDirector.setText(movie.getDirectedBy());
        holder.movieYear.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public void updateList(List<Movie> movies) {
        this.movieList = movies;
        notifyDataSetChanged();
    }

}
