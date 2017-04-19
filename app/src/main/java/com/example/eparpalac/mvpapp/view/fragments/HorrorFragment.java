package com.example.eparpalac.mvpapp.view.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.eparpalac.mvpapp.R;
import com.example.eparpalac.mvpapp.model.MovieAdapter;
import com.example.eparpalac.mvpapp.model.callbacks.CallbackInterface;
import com.example.eparpalac.mvpapp.model.movie.Movie;
import com.example.eparpalac.mvpapp.presenter.MoviePresenter;
import com.example.eparpalac.mvpapp.presenter.PresenterFactory;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class HorrorFragment extends Fragment implements CallbackInterface {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    MovieAdapter movieAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_horrors, container, false);
        ButterKnife.bind(this, view);


        MoviePresenter presenter = PresenterFactory.getPresenter(this);

        if (presenter == null) {
            Toast.makeText(getActivity(), "Presenter not found", Toast.LENGTH_SHORT).show();
            return view;
        }

        movieAdapter = new MovieAdapter();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);

        presenter.loadData(this);

        Toast.makeText(getActivity(), "Horror", Toast.LENGTH_SHORT).show();

        return view;
    }

    @Override
    public void call(List<Movie> movies) {
        movieAdapter.updateList(movies);
    }
}
