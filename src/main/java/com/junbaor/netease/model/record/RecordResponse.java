package com.junbaor.netease.model.record;

import java.util.List;

public class RecordResponse {

    private List<Alldata> alldata;
    private List<Weekdata> weekdata;
    private int code;

    public void setAlldata(List<Alldata> alldata) {
        this.alldata = alldata;
    }

    public List<Alldata> getAlldata() {
        return alldata;
    }

    public void setWeekdata(List<Weekdata> weekdata) {
        this.weekdata = weekdata;
    }

    public List<Weekdata> getWeekdata() {
        return weekdata;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}