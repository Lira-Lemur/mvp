package com.example.lira.mvp.model;

import java.util.List;

import io.realm.Realm;

public class DataRepository {

    private Realm realm = Realm.getDefaultInstance();

    public void saveInDatabase(List<Horror> list) {
        realm.beginTransaction();
//        for (Object Horror: list) {
//            HorrorResponse horror= realm.createObject(HorrorResponse.class);
//            horror.setHorrors(horrorLisr);
//        }
        realm.commitTransaction();
        realm.close();
    }

}
