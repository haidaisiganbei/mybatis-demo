package com.yj.entity;

public class UserWithDetails extends User {

    private UserDetails userDetails;

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @Override
    public String toString() {
        return
                "User{" +
                        "id=" + getId() +
                        ", phone='" + getPhone() + '\'' +
                        ", password='" + getPassword() + '\'' +
                        ", createDate=" + getCreateDate() +
                        ", status=" + getStatus() +
                        '}'+"UserWithDetails{" +
                "userDetails=" + userDetails +
                '}';
    }
}
