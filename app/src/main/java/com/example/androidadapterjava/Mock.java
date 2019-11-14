package com.example.androidadapterjava;

import android.graphics.ColorSpace;

import java.util.ArrayList;
import java.util.List;

public class Mock {
    private static Mock instance;
    private List<Model> list;
    private Mock() {
        list = new ArrayList<>();
        init();
    }

    public static synchronized Mock getInstance() {
        if (instance == null) {
            instance = new Mock();
        }
        return instance;

    }
    private void init() {
        list.add(new Model("One", "Two"));
        list.add(new Model("One2", "Two2"));
        list.add(new Model("One3", "Two3"));
        list.add(new Model("One4", "Two4"));
        list.add(new Model("One5", "Two5"));
        list.add(new Model("One6", "Two6"));
    }
    public List<Model> getList() {
        return list;
    }


}
