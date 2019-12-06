package com.binod.topic5_recyclerview;

public class Contacts {

    private String name;
    private String phoneNo;
    private int image;

    public Contacts(String name, String phoeNo, int image) {
        this.name = name;
        this.phoneNo = phoeNo;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoeNo() {
        return phoneNo;
    }

    public void setPhoeNo(String phoeNo) {
        this.phoneNo = phoeNo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
