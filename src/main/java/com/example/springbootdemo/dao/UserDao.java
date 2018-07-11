package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface UserDao {
    /*@Select("select * from users where userId = #{userId}")
    public abstract User findUserByUserid(@Param("userId") String userId);

    @Insert("insert into users (userId,pwd) values (#{userId},#{pwd})")
    public abstract boolean insertUsers(@Param("userId") String userId, @Param("pwd") String pwd);*/
}
