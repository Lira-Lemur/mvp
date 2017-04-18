package com.example.eparpalac.mvpapp.view.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.eparpalac.mvpapp.R;
import com.example.eparpalac.mvpapp.presenter.MoviePresenter;
import com.example.eparpalac.mvpapp.presenter.PresenterFactory;


public class ComedyFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_comedies, container, false);
        MoviePresenter presenter = PresenterFactory.getPresenter(this);


        Toast.makeText(getActivity(), "Comedy", Toast.LENGTH_SHORT).show();

        return view;
    }

}


