package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Mapper
public interface UserOracleDao {

    @Select("select * from users where userId = #{userId}")
    public abstract User findUserByUserid(@Param("userId") String userId);
}
