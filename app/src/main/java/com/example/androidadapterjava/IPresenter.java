package com.example.androidadapterjava;

import java.util.List;

public interface IPresenter {
    interface View {
        void initAdapter(List<Model> list);
        void message(Model model);
        int addItem();
        int removeItem();
    }
    interface Listener extends IBasePresenter<View> {
        void init();
        void eventClick(Model model);
        void eventAddItem();
        void eventRemoveItem();
    }
}
