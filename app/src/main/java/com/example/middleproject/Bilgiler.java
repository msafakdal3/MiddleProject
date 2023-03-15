package com.example.middleproject;

import java.io.Serializable;

public class Bilgiler implements Serializable {

    int image;
    String name;

    public Bilgiler(int image, String name) {
        this.image = image;
        this.name = name;
    }
}