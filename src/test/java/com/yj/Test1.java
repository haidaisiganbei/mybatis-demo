package com.yj;

import com.yj.entity.User;
import com.yj.entity.UserBlog;
import com.yj.entity.UserWithDetails;
import com.yj.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Test1 {


    @Test
    public void m1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserWithDetails userWithDetails = mapper.getUserById(4);
        System.out.println(userWithDetails);
        sqlSession.close();

    }

    @Test
    public void m2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserWithDetails userWithDetails = mapper.getUserById(4);
        System.out.println(userWithDetails);
        sqlSession.close();

    }

    @Test
    public void m3(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserBlog userBlog = mapper.queryByIdWithBlog(4);
        System.out.println(userBlog.getBlogs());
        sqlSession.close();

    }
}
