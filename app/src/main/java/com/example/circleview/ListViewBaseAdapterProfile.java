package com.example.circleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public  class ListViewBaseAdapterProfile extends BaseAdapter {
    public ArrayList<ListViewBeanProfile> arraylistListener;
    private List<ListViewBeanProfile> mListenerList;
    Context mContext;

    public ListViewBaseAdapterProfile(List<ListViewBeanProfile> mListenerList, Context context){
        mContext = context;
        this.mListenerList = mListenerList;
        this.arraylistListener = new ArrayList<ListViewBeanProfile>();
        this.arraylistListener.addAll(mListenerList);
    }
    public class  ViewHolder{
        ImageView mItemPic;
        TextView mLangName;
    }
    @Override
    public int getCount(){
        return mListenerList.size();
    }
    @Override
    public Object getItem(int position){
        return mListenerList.size();
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.list_myprofile, null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.hinhanh);
            holder.mLangName=(TextView)view.findViewById(R.id.tieude);


            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        try {
            int image = mListenerList.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(mListenerList.get(position).getFriend());
        }catch (Exception ex){
        }
        return view;
    }
}
