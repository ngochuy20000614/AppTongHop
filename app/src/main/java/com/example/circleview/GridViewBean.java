package com.example.circleview;

import android.widget.GridView;

import java.util.GregorianCalendar;

public class GridViewBean {
    private  int hinhanh;
    private String ten;

    public GridViewBean(String ten, int hinhanh){
        this.hinhanh = hinhanh;
        this.ten = ten;
    }
    public int getHinhanh(){
        return hinhanh;
    }
    public String getTen(){
        return ten;
    }
    public void setHinhanh(int hinhanh){
        this.hinhanh = hinhanh;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
}
