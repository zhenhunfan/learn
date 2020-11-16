package com.zhenhunfan.layout.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhenhunfan.layout.R;

import java.util.List;

public class FoodAdapter extends BaseAdapter {

    private Context context;
    private int resourceId;
    private List<FoodInfo> data;

    public FoodAdapter(Context context, int resourceId, List<FoodInfo> data) {
        this.context = context;
        this.resourceId = resourceId;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FoodInfo foodInfo = (FoodInfo) getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(context).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.ivFood = view.findViewById(R.id.iv_food_image);
            viewHolder.tvTitle = view.findViewById(R.id.tv_food_name);
            viewHolder.tvContent = view.findViewById(R.id.tv_food_content);
            view.setTag(viewHolder);
        }
        else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.ivFood.setImageResource(foodInfo.getIcon());
        viewHolder.tvTitle.setText(foodInfo.getTitle());
        viewHolder.tvContent.setText(foodInfo.getContent());
        return view;
    }

    class ViewHolder{
        ImageView ivFood;
        TextView tvTitle;
        TextView tvContent;
    }
}
