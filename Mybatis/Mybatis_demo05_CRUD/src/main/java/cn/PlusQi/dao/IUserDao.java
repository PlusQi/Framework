package cn.PlusQi.dao;

import cn.PlusQi.domain.User;

import java.util.List;

public interface IUserDao {
    /*
    * 查询所有用户
    * */
    List<User> findAll();
}
