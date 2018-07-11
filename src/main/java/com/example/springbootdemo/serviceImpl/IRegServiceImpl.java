package com.example.demo.serviceImpl;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserOracleDao;
import com.example.demo.model.User;
import com.example.demo.service.IRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IRegServiceImpl implements IRegService {

    /*@Autowired
    private UserDao userMapper;*/
    @Autowired
    private UserOracleDao userOracleDao;

    @Override
    public User verifyUser(String uerId) {

        User user;
        try {
                System.out.println("IRegServiceImpl  uerId="+uerId);
                user = userOracleDao.findUserByUserid(uerId);
                //user = userMapper.findUserByUserid(uerId);
        }catch (Exception e){
            return null;
        }
        return user;
    }


}
