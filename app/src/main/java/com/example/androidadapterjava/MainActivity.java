package com.example.androidadapterjava;

//import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.androidadapterjava.databinding.ActivityMainBinding;

import java.util.List;

import timber.log.Timber;

public class MainActivity extends BaseActivity<ActivityMainBinding> implements IPresenter.View {
    private IPresenter.Listener presenter;
    private RecyclerView RV;
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/

    @Override
    protected int getLayoutRes() { return R.layout.activity_main; }
    //protected void initView() { getBinding().setEvent(presenter); }

    @Override
    protected void onStartView() {
        presenter.startView(this);
        presenter.init();
    }

    @Override
    protected void onDestroyView() { presenter.detachView();}

    @Override
    protected IBasePresenter getPresenter() {
        return presenter;
    }

    @Override
    protected void initView() {
        presenter = new Presenter();
        getBinding().setEvent(presenter);
    }

    @Override
    public void initAdapter(List<Model> list) {
        RV = (RecyclerView)findViewById(R.id.rvList);
        LinearLayoutManager LM = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        AdapterExample AE = new AdapterExample(list, presenter);
        RV.setLayoutManager(LM);
        RV.setAdapter(AE);

        //getBinding().rvList
        //RV.

        //getBinding().rvList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //getBinding().rvList.setAdapter(new AdapterExample(list, presenter));
    }

    @Override
    public void message(Model model) {
        toast(model.getfName().concat(" ").concat(model.getlName()));
        Timber.e(model.getfName().concat(" ").concat(model.getlName()));
    }
}
