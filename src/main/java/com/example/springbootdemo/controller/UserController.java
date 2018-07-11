package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.User4Properties;
import com.example.demo.service.IRegService;
import com.example.demo.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Controller
@EnableAutoConfiguration
public class UserController {
    @Value("${login.userName}")
    private String userName4Properties;
    @Autowired
    private Environment environment;
    @Autowired
    private IRegService regService;
    @RequestMapping("/")
    String home() {
        this.show();
        //return "loginAjax";
        return "login";
    }
    @RequestMapping("/departmentTest")
    String department() {
        return "departmentAjax";
    }

    @RequestMapping("/userLogin")
    public void toIndex(@RequestBody User user,HttpServletResponse response,Model model){
        System.out.println("in userLogin");
        System.out.println(user.toString());
    }
    @RequestMapping("/login")
    @ResponseBody
    public void login(HttpServletRequest request, HttpServletResponse response, Model model){
        String uId = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUserId(uId);
        user.setPwd(password);
        System.out.println(user.getUserId()+":"+user.getPwd());
        LogUtil.daoLog.info("daoLog info: "+user.getUserId()+":"+user.getPwd());
        LogUtil.daoLog.debug("daoLog debug: "+user.getUserId()+":"+user.getPwd());
        LogUtil.daoLog.error("daoLog error: "+user.getUserId()+":"+user.getPwd());
        LogUtil.daoLog.warn("daoLog warn: "+user.getUserId()+":"+user.getPwd());
        String pwd = creatMD5(user.getPwd());
        User getUser = regService.verifyUser(user.getUserId());
        if(getUser!=null){
            System.out.println("getUser from db "+getUser.toString());
            if(getUser.getPwd().equals(pwd)){
                try {
                    response.getWriter().print("0");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }else{
                try {
                    response.getWriter().print("1");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }
    private String creatMD5(String loginNum){
        // 生成一个MD5加密计算摘要
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(loginNum.getBytes());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return new BigInteger(1, md.digest()).toString(16);
    }

    public void show() {
        System.out.println("login.userName:" + this.userName4Properties);
        System.out.println("login.password:" + this.environment.getProperty("login.password"));

        //User4Properties user4Properties = new User4Properties();
        //user4Properties.show();
    }
}
