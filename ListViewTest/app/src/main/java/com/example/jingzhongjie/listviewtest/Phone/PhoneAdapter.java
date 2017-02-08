package com.example.jingzhongjie.listviewtest.Phone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jingzhongjie.listviewtest.R;

import java.util.List;

/**
 * Created by jingzhongjie on 17/2/6.
 */

public class PhoneAdapter extends BaseAdapter {

    private List<PhoneBean> phoneBeanList;
    private Context context;

    public PhoneAdapter(List<PhoneBean> list, Context context)
    {
        setPhoneBeanList(list);
        this.context = context;
    }

    public void setPhoneBeanList(List<PhoneBean> list)
    {
        this.phoneBeanList = list;
    }

    @Override
    public int getCount() {
        return phoneBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return phoneBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.phone_list_item, null);
        }

        ImageView imageView = ViewHolder.get(convertView, R.id.imageView);
        TextView phoneNameTV = ViewHolder.get(convertView, R.id.phoneName);
        TextView phoneNumberTV = ViewHolder.get(convertView, R.id.phoneNumber);

        PhoneBean bean = phoneBeanList.get(position);

        imageView.setImageResource(R.drawable.room_love);
        phoneNameTV.setText(bean.getPhoneName());
        phoneNumberTV.setText(bean.getPhoneNumber());

        return convertView;
    }
}
