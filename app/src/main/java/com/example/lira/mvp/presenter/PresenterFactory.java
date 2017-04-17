package com.example.lira.mvp.presenter;

import com.example.lira.mvp.view.fragments.ComedyFragment;
import com.example.lira.mvp.view.fragments.HorrorFragment;

public class PresenterFactory {

    public static MoviePresenter getPresenter(Object object) {
        if (object instanceof HorrorFragment)
            return new HorrorPresenter();
        else if (object instanceof ComedyFragment)
            return new ComedyPresenter();

        return null;
    }
}
