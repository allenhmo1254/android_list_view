package com.example.jingzhongjie.listviewtest.Phone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.jingzhongjie.listviewtest.R;

public class PhoneNumberListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private PhoneAdapter phoneAdapter;
    private int count = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number_list);

        PhoneNumberManager.getNumber(this, count);
        listView = (ListView) findViewById(R.id.phone_number_list);
        phoneAdapter = new PhoneAdapter(PhoneNumberManager.phoneBeanList, this);
        listView.setAdapter(phoneAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        count += 5;
        PhoneNumberManager.getNumber(this, count);
        //设置适配器的数据
        phoneAdapter.setPhoneBeanList(PhoneNumberManager.phoneBeanList);
        //调用适配器的系统方法，刷新ListView
        phoneAdapter.notifyDataSetChanged();
    }
}
