package com.junbaor.netease.model.record;

public class Al {

    private int id;
    private String name;
    private String picurl;
    private String picStr;
    private long pic;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicStr(String picStr) {
        this.picStr = picStr;
    }

    public String getPicStr() {
        return picStr;
    }

    public void setPic(long pic) {
        this.pic = pic;
    }

    public long getPic() {
        return pic;
    }

}