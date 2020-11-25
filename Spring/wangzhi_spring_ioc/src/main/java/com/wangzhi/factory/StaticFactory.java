package com.wangzhi.factory;

import com.wangzhi.dao.UserDao;
import com.wangzhi.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
