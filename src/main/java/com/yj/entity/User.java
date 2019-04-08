package com.yj.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * u_idint(11) NOT NULL
 * phonevarchar(11) NULL
 * passwordvarchar(255) NULL
 * create_datedatetime NULL
 * statusint(11) NULL
 */
public class User implements Serializable {
  private Integer id;
  private String phone;
  private String password;
  private Date createDate;
  private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", status=" + status +
                '}';
    }
}
