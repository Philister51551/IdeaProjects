package com.wangzhi.demo;

import com.wangzhi.service.UserService;
import com.wangzhi.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserController {

    public static void main(String[] args) {
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app=new FileSystemXmlApplicationContext("D:\\IdeaProjects\\Spring\\wangzhi_spring_ioc\\src\\main\\resources\\applicationContext.xml");
        //UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);
        //容器中存在某一类型的对象有多个的话，用上面注释掉的id的方式，若没有多个则用第二种因为第二种不需要强制类型转换
        userService.save();

    }
}
