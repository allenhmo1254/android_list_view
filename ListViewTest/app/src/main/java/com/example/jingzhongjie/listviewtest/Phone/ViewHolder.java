package com.example.jingzhongjie.listviewtest.Phone;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by jingzhongjie on 17/2/8.
 */

public class ViewHolder {

    @SuppressWarnings("unchecked")
    public static <T extends View> T get(@NonNull View convertView, @IdRes int id) {
        SparseArray<View> viewHolder = (SparseArray<View>) convertView.getTag();
        if (viewHolder == null) {
            viewHolder = new SparseArray<View>();
            convertView.setTag(viewHolder);
        }
        View childView = viewHolder.get(id);
        if (childView == null) {
            childView = convertView.findViewById(id);
            viewHolder.put(id, childView);
        }
        return (T) childView;
    }
}
