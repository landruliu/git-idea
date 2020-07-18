package com.dcits.test;

import com.dcits.dao.AccountDao;
import com.dcits.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description: mybatis框架的测试
 * @Author: liuyong
 **/
public class MybatisText {
    /**
     * 测试查询方法
     * @throws IOException
     */
    @Test
    public void text1() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        sqlSession.close();
        in.close();
    }

    /**
     * 测试新增方法
     * @throws IOException
     */
    @Test
    public void text2() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        Account account1 = new Account();
        account1.setName("qqq");
        account1.setMoney(5555.0);
        dao.saveAccount(account1);
        //增删改方法需要提交事务
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
