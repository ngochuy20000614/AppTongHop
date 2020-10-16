package com.example.circleview;

public class ListViewBeanProfile {
    int image;
    String friend;
    public ListViewBeanProfile(){

    }
    public ListViewBeanProfile(int image, String friend){
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
