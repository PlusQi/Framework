package cn.PlusQi.mybatis.sqlsession;

import cn.PlusQi.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import cn.PlusQi.mybatis.utils.XMLConfigBuilder;
import cn.PlusQi.mybatis.cfg.Configuration;

import java.io.InputStream;

/*
 *  用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return  new DefaultSqlSessionFactory(cfg);
    }
}
