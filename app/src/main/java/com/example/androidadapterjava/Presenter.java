package com.example.androidadapterjava;

import android.net.IpPrefix;

public class Presenter implements IPresenter.Listener {
    private IPresenter.View view;

    @Override
    public void startView(IPresenter.View view) { this.view = view; }

    @Override
    public void detachView() {
        if (view != null) view = null;
    }

    @Override
    public void init() {
        view.initAdapter(Mock.getInstance().getList());
    }

    @Override
    public void eventClick(Model model) {
        view.message(model);
    }
}
