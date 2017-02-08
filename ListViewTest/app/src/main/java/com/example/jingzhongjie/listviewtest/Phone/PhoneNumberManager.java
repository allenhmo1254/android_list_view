package com.example.jingzhongjie.listviewtest.Phone;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingzhongjie on 17/2/6.
 */

public class PhoneNumberManager {

    public static List<PhoneBean> phoneBeanList = new ArrayList<PhoneBean>();

    public static void getNumber(Context context, int count)
    {
//        Cursor cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
//        String phoneNumber;
//        String phoneName;
//        while (cursor.moveToNext())
//        {
//            phoneNumber = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));//获取手机号码
//            phoneName = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));//获取号码名称
//            PhoneBean phoneBean = new PhoneBean(phoneNumber, phoneName);
//            phoneBeanList.add(phoneBean);
//        }

        phoneBeanList.clear();
        for (int i = 0; i < count; i ++)
        {
            PhoneBean phoneBean = new PhoneBean("13811475704", "景中杰");
            phoneBeanList.add(phoneBean);
        }
    }

}
