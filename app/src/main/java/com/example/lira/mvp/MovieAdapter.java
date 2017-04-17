package com.example.lira.mvp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }

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
}
