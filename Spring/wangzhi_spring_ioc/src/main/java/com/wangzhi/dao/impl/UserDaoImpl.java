package com.wangzhi.dao.impl;

import com.wangzhi.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl对象创建......");
    }

    public void init(){
        System.out.println("初始化方法......");
    }

    public void destory(){
        System.out.println("销毁方法......");
    }

    public void save(){
        System.out.println("save running......");
    }
}
