package com.wuyiwen;

public class UserServiceImpl implements UserService {
    //持久层的dao属性
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    //实现接口的方法
    @Override
    public void deleteById(Integer id) {

        System.out.println("删除的方法执行");
    }

}

