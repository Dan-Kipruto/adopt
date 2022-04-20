package com.example.adopt.Model;

public class Minor {
    private int image;
    private String offer;

    public Minor(int image , String offer){
        this.image = image;
        this.offer = offer;
    }

    public int getImage() {
        return image;
    }

    public String getOffer() {
        return offer;
    }
}
