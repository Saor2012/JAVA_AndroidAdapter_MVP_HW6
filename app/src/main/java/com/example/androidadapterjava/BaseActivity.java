package com.example.androidadapterjava;
import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import java.util.Objects;

public abstract class BaseActivity<Binding extends ViewDataBinding> extends AppCompatActivity {
    private Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, getLayoutRes());
        initView();
    }
    /*@Override
    public void onBackPressed() {
        super.onBackPressed();
        FragmentManager manager = this.getSupportFragmentManager();
        if (manager.getBackStackEntryCount() == 0) {
            super.finish();
        }
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        onStartView();
    }

    @LayoutRes
    protected abstract int getLayoutRes();

    protected Binding getBinding(){
        return binding;
    }

    protected abstract void initView();


    @Override
    public void onDestroy() {
        if (getPresenter() != null) {
            onDestroyView();
            getPresenter().detachView();
        }
        super.onDestroy();
    }

    protected abstract void onStartView();

    protected abstract void onDestroyView();

    protected abstract IBasePresenter getPresenter();

    /*protected void hideKeyboard() {
        InputMethodManager imm =
                (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
        Objects.requireNonNull(imm).hideSoftInputFromWindow(this.getWindow().getDecorView().getWindowToken(), 0);

    }

    protected void showKeyboard() {
        InputMethodManager imm = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
        Objects.requireNonNull(imm).showSoftInput(this.getWindow().getDecorView(), InputMethodManager.SHOW_IMPLICIT);
    }*/

    protected void toast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

}
