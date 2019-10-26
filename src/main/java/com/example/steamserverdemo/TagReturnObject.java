package com.example.steamserverdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by thpffcj on 2019/10/25.
 */
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class TagReturnObject implements Serializable {

    @Autowired
    private ArrayList<TagObject> tagObjects;

    public TagReturnObject(ArrayList<TagObject> tagObjects) {
        this.tagObjects = tagObjects;
    }

    public ArrayList<TagObject> getTagObjects() {
        return tagObjects;
    }

    public void setTagObjects(ArrayList<TagObject> tagObjects) {
        this.tagObjects = tagObjects;
    }
}
