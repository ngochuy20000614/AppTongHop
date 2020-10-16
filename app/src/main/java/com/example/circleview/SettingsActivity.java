package com.example.circleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {

    Button btlogout;
    ImageView imgBackChat;
    TextView tvamnhac;
    ListView lview;
    ListViewBaseAdapterProfile adapter, adapter_private;
    ArrayList<ListViewBeanProfile> arr_bean;
    ArrayList<ListViewBeanProfile> arr_bean_private;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        lview = (ListView)findViewById(R.id.list_profile);

        arr_bean = new ArrayList<ListViewBeanProfile>();

        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_school, "University Technology And Education in Da Nang"));
        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_simple, "Simple"));
        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_idea,"Make a game with unity3D"));
        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_mail, "ngochuy20000614@gmail.com"));
        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_country, "Viet Nam"));
        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_private, "Policy"));
        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_ring, "Report and sound"));
        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_danhba, "Phonebook"));
        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_cloud, "Cloutd"));
        arr_bean.add(new ListViewBeanProfile(R.drawable.ic_baseline_lock_24, "Cloutd"));
        adapter = new ListViewBaseAdapterProfile(arr_bean,this);
        lview.setAdapter(adapter);

        imgBackChat = (ImageView)findViewById(R.id.backchat);
        imgBackChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });
        btlogout = (Button)findViewById(R.id.logout);
        btlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView btnview;
        btnview = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        btnview.setSelectedItemId(R.id.canhan);
        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.service:
                        startActivity(new Intent(getApplicationContext(),ServicesActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),ChatActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.canhan:
                        return true;
                }
                return false;
            }
        });
    }
}