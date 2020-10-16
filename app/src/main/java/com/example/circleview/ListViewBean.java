package com.example.circleview;

public class ListViewBean {
    int image;
    String friend;
    public ListViewBean(){

    }
    public ListViewBean(int image, String friend){
        super();
        this.image = image;
        this.friend = friend;
    }
    public int getImage(){
        return image;
    }
    public String getFriend(){
        return friend;
    }
    public void setImage(int image){
        this.image = image;
    }
    public void setFriend(String friend){
        this.friend = friend;
    }
}
