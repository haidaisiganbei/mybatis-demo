package com.yj.mapper;


import com.yj.entity.User;
import com.yj.entity.UserBlog;
import com.yj.entity.UserWithDetails;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    UserWithDetails getUserById(@Param("id") Integer id);
//    UserWithDetails getUserWithDetailsByUserId(@Param("id") Integer id);

    UserBlog queryByIdWithBlog(@Param("id") Integer id);
}
