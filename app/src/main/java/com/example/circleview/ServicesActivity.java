package com.example.circleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class ServicesActivity extends AppCompatActivity {

    GridView gridHinhAnh;
    ArrayList<GridViewBean> arrayList;
    GridViewBaseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Anhxa();

        adapter = new GridViewBaseAdapter(this,R.layout.activity_picture,arrayList);
        gridHinhAnh.setAdapter(adapter);

        BottomNavigationView btnview;
        btnview = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        btnview.setSelectedItemId(R.id.service);

        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),ChatActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.service:
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
    private void Anhxa(){
        gridHinhAnh = (GridView)findViewById(R.id.gridviewServices);
        arrayList = new ArrayList<>();
        arrayList.add(new GridViewBean("Entertainment",R.drawable.android_1));
        arrayList.add(new GridViewBean("Game",R.drawable.android_2));
        arrayList.add(new GridViewBean("AI",R.drawable.android_9));
        arrayList.add(new GridViewBean("Robot",R.drawable.android_4));
        arrayList.add(new GridViewBean("Technology",R.drawable.android_5));
        arrayList.add(new GridViewBean("Enviroment",R.drawable.android_6));
    }

}
