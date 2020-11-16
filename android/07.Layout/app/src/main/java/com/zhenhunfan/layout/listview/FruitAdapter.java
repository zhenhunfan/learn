package com.zhenhunfan.layout.listview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhenhunfan.layout.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;
    private Context context;

    public FruitAdapter(Context context, int resourceId, List<Fruit> fruitList){
        super(context,resourceId,fruitList);
        this.resourceId = resourceId;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        //ImageView ivFruit = view.findViewById(R.id.fruit_image);
        TextView tvFruit = view.findViewById(R.id.fruit_name);
        //ivFruit.setImageResource(fruit.getImageId());
        tvFruit.setText(fruit.getName());
        Drawable  dra = context.getDrawable(fruit.getImageId()) ;
        dra.setBounds(0, 0, 50, 50);
        tvFruit.setCompoundDrawables(dra,null,null,null);
        return view;
    }
}
