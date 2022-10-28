package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter {
    private final int resourceld;
    public FruitAdapter(Context context, int textViewResourceld, List<Fruit>objects){
        super(context,textViewResourceld,objects);
        resourceld = textViewResourceld;
    }
    
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        
        Fruit fruit=(Fruit) getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceld,null);
        ImageView fruitImage= (ImageView) view.findViewById(R.id.self_img);
        TextView ftuitName=(TextView)view.findViewById(R.id.self_txt);
        fruitImage.setImageResource(fruit.getImageId());
        ftuitName.setText(fruit.getName());
        return view;
    }
}
