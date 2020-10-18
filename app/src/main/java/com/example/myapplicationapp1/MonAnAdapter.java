package com.example.myapplicationapp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonAnAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<MonAn> arrayMonAn;
    public MonAnAdapter(Context context, int layout, List<MonAn> monAnList){
        myContext=context;
        myLayout=layout;
        arrayMonAn=monAnList;
    }

    @Override
    public int getCount() {
        return arrayMonAn.size();
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
        LayoutInflater inflater= (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(myLayout,null);
        TextView txtTen= (TextView) convertView.findViewById(R.id.textviewTen);
        txtTen.setText(arrayMonAn.get(position).Ten);
        TextView txtGia=(TextView) convertView.findViewById(R.id.textviewGia);
        txtGia.setText(arrayMonAn.get(position).Gia +"");
        ImageView imghinh=(ImageView) convertView.findViewById(R.id.imageviewHinh);
        imghinh.setImageResource(arrayMonAn.get(position).Hinh);
        return convertView;
    }
}
