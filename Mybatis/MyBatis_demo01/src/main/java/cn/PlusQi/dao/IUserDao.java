package cn.PlusQi.dao;

import cn.PlusQi.domain.User;

import java.util.List;

/*
* 用户的持久层接口
* */
public interface IUserDao {

    /*
    * 查询所有操作
    * */
    List<User> findAll();
}
