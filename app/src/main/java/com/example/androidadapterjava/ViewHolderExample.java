package com.example.androidadapterjava;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.databinding.DataBindingUtil;
//import androidx.databinding.ViewDataBinding;

import com.example.androidadapterjava.databinding.ActivityMainBinding;
import com.example.androidadapterjava.databinding.RvItemBinding;

public class ViewHolderExample extends RecyclerView.ViewHolder {
    private IPresenter.Listener presenter;
    private RvItemBinding binding; //ItemBinding
    private ActivityMainBinding mainBinding;
    private Context context;


    public ViewHolderExample(@NonNull View itemView, Context context, IPresenter.Listener presenter) {
        super(itemView);
        this.presenter = presenter;
        this.context = context;
        binding = DataBindingUtil.bind(itemView); //binding = DataBindingUnit.bind(itemView);
        if (binding != null && presenter != null)
            binding.setEvent(presenter);
    }

    public void bind(Model model, int position) {
        if (model != null) {
            binding.rvLName.setText(model.getlName());
            binding.rvFName.setText(model.getfName());
            binding.cList.setOnClickListener(v -> {
                presenter.eventClick(model);
            });
        }
    }
    public void addItem(int position) {
        /*if ((mainBinding.addField.getText().toString()) != "")
            mainBinding.addItemBtn.setOnClickListener(v -> {
                presenter.eventAddItem(Integer.valueOf(mainBinding.addField.getText().toString()));
            });*/
    }

    public void removeItem(int position) {
        /*if ((mainBinding.removeField.getText().toString()) != "")
            mainBinding.removeItemBtn.setOnClickListener(v -> {
                presenter.eventRemoveItem(Integer.valueOf(mainBinding.removeField.getText().toString()));
            });*/
    }

}
