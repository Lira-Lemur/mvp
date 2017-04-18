package com.example.eparpalac.mvpapp.model;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eparpalac.mvpapp.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<? extends Movie> movieList;

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.movieTitle)
        TextView movieTitle;
        @BindView(R.id.movieDirector)
        TextView movieDirector;
        @BindView(R.id.movieYear)
        TextView tempDay;

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

        holder.movieTitle.setText(movie.getYear());
        holder.movieDirector.setText(movie.getYear());
        holder.tempDay.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public void reset(List<? extends Movie> movies) {

    }

}
