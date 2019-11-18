package com.example.androidadapterjava;

import android.net.IpPrefix;

import com.example.androidadapterjava.data.mock.Mock;
import com.example.androidadapterjava.domain.IMainInteractor;

import timber.log.Timber;

public class Presenter implements IPresenter.Listener {
    private IPresenter.View view;
    //private IMainInteractor interactor; //Link to repository

    @Override
    public void startView(IPresenter.View view) { this.view = view; }

    @Override
    public void detachView() {
        if (view != null) view = null;
    }

    @Override
    public void init() {
        view.initAdapter(Mock.getInstance().getList());
        /*interactor = new MainInteractor();
        interactor.read()
                .subscribe(new DisposableCompletableObserver<List<Model>>() {
                    @Override
                    public void onSuccess(List<Model> model) {
                        view.initAdapter(model);
                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Timber.e(e.getMessage());
                        view.message(e.getMessage());
                    }
                });*/
        //view.initStringXMLValues();
    }

    @Override
    public void eventClick(Model model) {
        view.message(model);
    }

    @Override
    public void eventAddItem() {
        int position = view.addItem();
        if (position != -1)
            Mock.getInstance().addItem(position);
        else {
            Timber.e("Errro value at addItem field.");
        }

    }

    @Override
    public void eventRemoveItem() {
        int position = view.removeItem();
        if (position != -1)
            Mock.getInstance().removeItem(position);
        else {
            Timber.e("Errro value at removeItem field.");
        }
    }

    public int getListSize() {
        return (Mock.getInstance().getList().size());
    }
}
