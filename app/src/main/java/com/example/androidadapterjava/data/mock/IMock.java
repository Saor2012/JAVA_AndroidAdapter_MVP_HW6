package com.example.androidadapterjava.data.mock;

import com.example.androidadapterjava.Model;

import java.util.List;

import io.reactivex.Single;

public interface IMock {
    Single<List<Model>> read();
    Single<Long> create(String name, String number);
    Single<Model> update(Model contract);
    Single<Long> delete(Model contract);
}
