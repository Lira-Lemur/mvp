package com.example.lira.mvp.view.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lira.mvp.R;
import com.example.lira.mvp.presenter.MoviePresenter;
import com.example.lira.mvp.presenter.PresenterFactory;

public class HorrorFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_horrors, container, false);
        MoviePresenter presenter = PresenterFactory.getPresenter(this);

        return view;
    }
}
