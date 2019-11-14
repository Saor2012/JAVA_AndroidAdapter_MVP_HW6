package com.example.androidadapterjava;

import java.util.List;

public interface IPresenter {
    interface View {
        void initAdapter(List<Model> list);
        void message(Model model);
    }
    interface Listener extends IBasePresenter<View> {
        void init();
        void eventClick(Model model);
    }
}
