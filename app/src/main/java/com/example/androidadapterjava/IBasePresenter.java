package com.example.androidadapterjava;

public interface IBasePresenter<V> {
    void startView(V view);

    void detachView();

}
