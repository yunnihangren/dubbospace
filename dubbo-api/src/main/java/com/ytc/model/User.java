package com.ytc.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -6800089746458638379L;
    private Integer userid;

    private String username;

    private Integer usersex;

    private Double userprice;

    private String userdate;

    private Integer usertype;

    private String userimg;

    private String usershow;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public Double getUserprice() {
        return userprice;
    }

    public void setUserprice(Double userprice) {
        this.userprice = userprice;
    }

    public String getUserdate() {
        return userdate;
    }

    public void setUserdate(String userdate) {
        this.userdate = userdate;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }

    public String getUsershow() {
        return usershow;
    }

    public void setUsershow(String usershow) {
        this.usershow = usershow == null ? null : usershow.trim();
    }
}