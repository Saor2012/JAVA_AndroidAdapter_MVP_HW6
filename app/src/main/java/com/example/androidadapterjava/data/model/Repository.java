package com.example.androidadapterjava.data.model;

import com.example.androidadapterjava.Model;
import com.example.androidadapterjava.data.mock.IMock;

import java.util.List;

import io.reactivex.Single;

public class Repository implements IRepository { //Initual repository
    private static IRepository instance;
    private IMock iMock;

    private Repository(){
        //iMock = new Mock();
    }

    public static synchronized IRepository getInstance() {
        if(instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    @Override
    public Single<List<Model>> read() {
        return Repository.getInstance().read();
        /*return Repository.getInstance().read()
                .subscribeOn(Schedulers.io());*/
    }

    @Override
    public Single<Long> create(String name, String number) {
        return iMock.create(name, number);
    }

    @Override
    public Single<Model> update(Model contract) {
        return null;
    }

    @Override
    public Single<Long> delete(Model contract) {
        return null;
    }
}
