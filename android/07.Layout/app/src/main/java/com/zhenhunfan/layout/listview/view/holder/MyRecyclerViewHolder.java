package com.zhenhunfan.layout.listview.view.holder;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhenhunfan.layout.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {

    private ImageView fruitImage;
    private TextView  fruitName;

    public MyRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        fruitImage = itemView.findViewById(R.id.recycler_view_item_image);
        fruitName = itemView.findViewById(R.id.recycler_view_item_text);
    }

    public ImageView getFruitImage() {
        return fruitImage;
    }


    public TextView getFruitName() {
        return fruitName;
    }

}
