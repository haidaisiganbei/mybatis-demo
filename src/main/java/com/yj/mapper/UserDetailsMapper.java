package com.yj.mapper;

import com.yj.entity.UserDetails;
import org.apache.ibatis.annotations.Param;

public interface UserDetailsMapper {
    UserDetails queryById(@Param("uid") Integer uid);
}
