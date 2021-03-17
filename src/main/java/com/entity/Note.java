package com.entity;

import java.io.Serializable;

/**
 * author： wangcaisi
 * date： 2021/3/9 15:25
 * desc：
 */
public class Note implements Serializable {
    private String id;
    private String name;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
