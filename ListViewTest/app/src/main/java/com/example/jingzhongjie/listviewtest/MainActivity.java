package com.example.jingzhongjie.listviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jingzhongjie.listviewtest.Phone.PhoneNumberListActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    /*
    定义数组来表示listView要显示，也是我们学习哪些常用的控件
    */
    private static final String[] commonFunList = new String[]{
            "ListView控件演示",
            "ProgressBar控件演示",
            "GridView控件演示",
            "ScrollView控件演示",
            "DatePicker控件演示",
    };

    //ListView对象
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取ListView对象
        listView = (ListView)findViewById(R.id.view_list_main);
        //设置适配器
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                commonFunList));
        //设置点击的事件监听
        listView.setOnItemClickListener(this);
    }

    /*
    监听ListView的点击事件回调
    */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        setTitle("您点击了第"+position+"个项目");

        Intent i = null;

        switch (position)
        {
            case 0:
                i = new Intent(MainActivity.this, PhoneNumberListActivity.class);
                break;
            default:
                break;
        }

        if (i != null)
        {
            startActivity(i);
        }
    }
}
