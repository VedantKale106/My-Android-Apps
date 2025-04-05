package com.example.merabox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String []  names;
    int []  rate;
    int [] images ;

    LayoutInflater inflater;
    public CustomBaseAdapter(Context ctx , String[] names , int [] images ){
        this.context = ctx ;
        this.names = names ;
        this.images = images;
        inflater = LayoutInflater.from(ctx);

    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list,null);
        TextView textView1 = (TextView) convertView.findViewById(R.id.profileName);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.profilePic);
        textView1.setText(names[position]);
        imageView.setImageResource(images[position]);
        return convertView;
    }
}
