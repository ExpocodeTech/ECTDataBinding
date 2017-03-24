package com.expocodetech.ectdatabinding.model;

/**
 * Created by expocodetech on 24/3/17.
 */

public class User {
    private String name;
    private String descrip;

    public User() {}

    public User(String name, String descrip) {
        this.name = name;
        this.descrip = descrip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
