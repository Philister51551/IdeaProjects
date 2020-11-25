package com.wangzhi.factory;

import com.wangzhi.dao.UserDao;
import com.wangzhi.dao.impl.UserDaoImpl;

public class DynamicFactory {

        public UserDao getUserDao() {
            return new UserDaoImpl();
        }
}
