package com.example.abvm537.mywhatsapp;

import java.util.TreeMap;

/**
 * Created by ABVM537 on 7/1/2016.
 */
public class status {
    public String getSelectStatus() {
        return selectStatus;
    }

    public void setSelectStatus(String selectStatus) {
        this.selectStatus = selectStatus;
    }

    private String selectStatus;

    public status(String selectStatus){
        this.selectStatus = selectStatus;
    }

}
