package com.until;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author Wangcaisi
 * @date 2021/3/13 17:44
 * @desc：获取数据库连接工具
 */


public class GetSqlSession {
    /**
     * 该方法类提供了一个SqlSession
     *
     * @author Administrator
     */
    public static SqlSession createSqlSession() {
        //1 获取总配置文件
        Reader reader=null;
        try {

            reader=Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {

            e.printStackTrace();
            System.out.println(e.toString());
        }

        //2 加载总配置文件 获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(reader);

        //3 打开SqlSession
        SqlSession session=ssf.openSession();
            return session;

    }

    // 输出了数据说明mybatis 跟 mysql环境是配 ok 的 环境是配ok的
    public static void main(String[] args) {




        System.out.println(GetSqlSession.createSqlSession());
    }
}
