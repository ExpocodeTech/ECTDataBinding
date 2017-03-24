package com.expocodetech.ectdatabinding.model;

/**
 * Created by expocodetech on 24/3/17.
 */

public class Item {
    private String text;

    public Item() {}
    public Item(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
