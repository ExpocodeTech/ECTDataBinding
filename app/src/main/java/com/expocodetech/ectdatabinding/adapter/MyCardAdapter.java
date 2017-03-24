package com.expocodetech.ectdatabinding.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.expocodetech.ectdatabinding.databinding.CardItemBinding;
import com.expocodetech.ectdatabinding.model.Item;

import java.util.ArrayList;

/**
 * Created by expocodetech on 24/3/17.
 */

public class MyCardAdapter extends RecyclerView.Adapter<MyCardAdapter.CardViewHolder> {

    private ArrayList<Item> mDataset;

    public MyCardAdapter(ArrayList<Item> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public MyCardAdapter.CardViewHolder  onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        CardItemBinding itemBinding =
                CardItemBinding.inflate(layoutInflater, parent, false);
        return new CardViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(MyCardAdapter.CardViewHolder  holder, int position) {
        Item item = mDataset.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private final CardItemBinding binding;
        public CardViewHolder(CardItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(Item item) {
            binding.setItem(item);
            binding.executePendingBindings();
        }
    }
}
