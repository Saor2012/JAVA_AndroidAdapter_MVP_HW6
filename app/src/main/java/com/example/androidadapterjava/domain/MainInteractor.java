package com.example.androidadapterjava.domain;

import com.example.androidadapterjava.Model;
import com.example.androidadapterjava.data.model.Repository;
import com.example.androidadapterjava.domain.base.BaseInteractor;

import java.util.List;

import io.reactivex.Single;

public class MainInteractor extends BaseInteractor implements IMainInteractor { //Conecting to repository

    @Override
    public Single<List<Model>> read() {
        return null;
    }

    @Override
    public Single<Long> create(String name, String number) {
        return Repository.getInstance().create(name, number).compose(applySingleSchedulers()); //Linked, джерело даних
    }

    @Override
    public Single<Model> update(Model model) {
        return null;
    }

    @Override
    public Single<Long> delete(Model model) {
        return null;
    }

}
