package com.example.androidadapterjava;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import androidx.annotation.NonNull;

import java.util.List;

public class AdapterExample extends RecyclerView.Adapter<ViewHolderExample> {
    private List<Model> list;
    private IPresenter.Listener presenter;

    public AdapterExample(List<Model> list, IPresenter.Listener presenter) {
        this.list = list;
        this.presenter = presenter;
    }

    @Override
    public ViewHolderExample onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderExample(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false), parent.getContext(), presenter);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderExample holder, int position) {
        holder.bind(list.get(position), position);
        //notifyDataSetChanged();
        //notifyItemChanged(position);
    }

    @Override
    public int getItemCount() { return list.size(); }
}
