package com.example.steamserverdemo;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.ArrayList;

public class TimeFieldObject implements Serializable{
    public TimeFieldObject(String name, ArrayList<GameObject> values) {
        this.name = name;
        this.values = values;
    }

    @Autowired
    private String name;
    @Autowired
    private ArrayList<GameObject> values;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<GameObject> getValues() {
        return values;
    }

    public void setValues(ArrayList<GameObject> values) {
        this.values = values;
    }

}
