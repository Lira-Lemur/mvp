package com.example.eparpalac.mvpapp.presenter;

import com.example.eparpalac.mvpapp.view.fragments.ComedyFragment;
import com.example.eparpalac.mvpapp.view.fragments.HorrorFragment;

public class PresenterFactory {

    public static MoviePresenter getPresenter(Object object) {
        if (object instanceof HorrorFragment)
            return new HorrorPresenter();
        else if (object instanceof ComedyFragment)
            return new ComedyPresenter();

        return null;
    }
}
