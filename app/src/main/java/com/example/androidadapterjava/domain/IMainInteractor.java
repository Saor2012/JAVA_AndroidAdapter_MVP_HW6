package com.example.androidadapterjava.domain;

import com.example.androidadapterjava.Model;

import java.util.List;

import io.reactivex.Single;

public interface IMainInteractor { //interface
    Single<List<Model>> read();
    Single<Long> create(String name, String number);
    Single<Model> update(Model model);
    Single<Long> delete(Model model);
}
