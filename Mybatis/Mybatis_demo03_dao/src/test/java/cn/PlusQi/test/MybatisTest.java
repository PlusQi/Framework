package cn.PlusQi.test;


import cn.PlusQi.dao.IUserDao;
import cn.PlusQi.dao.impl.UserDaoImpl;
import cn.PlusQi.domain.User;
import jdk.nashorn.internal.ir.CallNode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
* 入门测试案例*/
public class MybatisTest {
    public static void main(String[] args) throws Exception {
        //1.读取配置文件
        InputStream in = Resources.class.getResourceAsStream("/SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        IUserDao userDao = new UserDaoImpl(factory);
        //4.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //5.释放资源
        in.close();
    }

}
