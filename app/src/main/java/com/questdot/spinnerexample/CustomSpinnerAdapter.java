package com.questdot.spinnerexample;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomSpinnerAdapter extends BaseAdapter {
    Context context;
    int num[];
    String[] content;
    LayoutInflater inflter;

    public CustomSpinnerAdapter(Context applicationContext, int[] num, String[] content) {
        this.context = applicationContext;
        this.num = num;
        this.content = content;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return num.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_items, null);
        TextView number = (TextView) view.findViewById(R.id.tvNumber);
        TextView names = (TextView) view.findViewById(R.id.tvContent);
        number.setText(""+num[i]);
        names.setText(content[i]);
        return view;
    }


}
