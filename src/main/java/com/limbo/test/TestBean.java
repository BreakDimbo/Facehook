package com.limbo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Break.D on 7/22/16.
 */
public class TestBean {

    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
