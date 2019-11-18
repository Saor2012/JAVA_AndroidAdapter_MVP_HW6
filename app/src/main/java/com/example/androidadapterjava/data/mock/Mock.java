package com.example.androidadapterjava.data.mock;

import com.example.androidadapterjava.Model;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Single;

public class Mock implements IMock { //New Mock class with CRUD system, add read method for Adapters and Presenter work. Add here main Mock for this project

    private static Mock instance;
    private List<Model> list;
    protected long id;
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
        id = 0;
        list.add(new Model(id, "One", "Two"));
        /*list.add(new Model(++id,"One2", "Two2"));
        list.add(new Model(++id,"One3", "Two3"));
        list.add(new Model(++id,"One4", "Two4"));
        list.add(new Model(++id,"One5", "Two5"));
        list.add(new Model(++id,"One6", "Two6"));*/
    }
    public List<Model> getList() {
        return list;
    }

    public void addItem(int position) {
        list.add(position, new Model(++id,"One" + position, "Two" + position));
    }

    public void removeItem(int position) {
        list.remove(position);
    }

    public void removeAllItems() {
        /*for (List<Model> item: getList()) {
            item.remove()
        }*/
        list.clear();

    }

    @Override
    public Single<List<Model>> read() { //list.get(list.size()).getId())
        /*return Single.just(new Model(list.size() + 1, name, number))
                .flatMap(this::insert);*/
        return null;
                //Single.just(new Model(list.size() + 1, name, number))
                //.flatMap(
                        /*v -> {
                    if(list != null) {
                        int index = list.size() - 1;
                        long id = list.get(list.size() - 1).getId();
                        v.setId(id);
                        return Single.just(v);
                    } else {
                        list = new ArrayList<>();
                        v.setId(1);
                        list.add(new Model());
                        return Single.just(v);
                    }
                    //return Single.just(v); //Single.error();
                }*///this::generateId).flatMap(this::insert);
    }

    private Single<Model> generateId(Model model) {
        /*if(list != null) {
            int index = list.size() - 1;
            long id = list.get(list.size() - 1).getId();
            model.setId(id);
            //v.setId(id);
            return Single.just(v);
        } else {
            list = new ArrayList<>();
            model.setId(1);
            //v.setId(1);
            //list.add(new Model());
            return Single.just(v);
        }*/
        return null;
    }

    @Override
    public Single<Long> create(String name, String number) {
        return null;
    } //Створити елемент, +flatMap(): new Function<>(){} + insert -> (addItem())

    @Override
    public Single<Model> update(Model model) {
        return null;
    }

    @Override
    public Single<Long> delete(Model model) {
        return null;
    }
}
