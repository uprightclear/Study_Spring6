package com.atguigu.dao.impl;

import com.atguigu.anno.Bean;
import com.atguigu.dao.UserDao;

@Bean
public class UserDaoImpl  implements UserDao {
    @Override
    public void add() {
        System.out.println("dao.......");
    }
}
