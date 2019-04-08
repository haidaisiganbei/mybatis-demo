package com.yj.entity;

import java.io.Serializable;

public class UserDetails implements Serializable {

    /**
     * idint(11) NOT NULL
     * u_idint(11) NULL
     * addressvarchar(500) NULL
     * cidvarchar(18) NULL
     */
    private Integer id;
    private User user;
    private String address;
    private String cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", cid='" + cid + '\'' +
                '}';
    }
}
