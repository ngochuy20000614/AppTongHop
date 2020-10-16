package com.example.circleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    ListView lview;
    ImageView imgsetting;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        lview = (ListView)findViewById(R.id.listfriends);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.friend_1, "An Nguyễn"));
        arr_bean.add(new ListViewBean(R.drawable.friend_2, "Thành Đạt"));
        arr_bean.add(new ListViewBean(R.drawable.friend_3,"Quốc Đạt"));
        arr_bean.add(new ListViewBean(R.drawable.friend_4, "Đạt Phan"));
        arr_bean.add(new ListViewBean(R.drawable.friend_5, "Đăng Minh Hiếu"));
        arr_bean.add(new ListViewBean(R.drawable.friend_6, "Thành Võ Phan"));
        arr_bean.add(new ListViewBean(R.drawable.friend_8, "Nguyễn Duy Thịnh"));
        arr_bean.add(new ListViewBean(R.drawable.friend_9, "Huỳnh Phước Trường"));
        arr_bean.add(new ListViewBean(R.drawable.ic_user, "Lê Bá Thông"));
        arr_bean.add(new ListViewBean(R.drawable.ic_language, "Trần Xuân Cát"));
        adapter = new ListViewBaseAdapter(arr_bean,this);
        lview.setAdapter(adapter);

        imgsetting = (ImageView)findViewById(R.id.setting);
        imgsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this,SettingsActivity.class);
                startActivity(intent);
            }
        });
        BottomNavigationView btnview;
        btnview = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        btnview.setSelectedItemId(R.id.home);

        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.service:
                        startActivity(new Intent(getApplicationContext(),ServicesActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.canhan:
                        startActivity(new Intent(getApplicationContext(),SettingsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}