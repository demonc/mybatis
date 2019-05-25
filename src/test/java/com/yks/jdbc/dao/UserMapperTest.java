package com.yks.jdbc.dao;

import com.yks.jdbc.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 版权：Copyright by www.youkeshu.com
 * 描述：
 * 创建人：root
 * 创建时间：2019-05-24 8:49
 * 修改理由：
 * 修改内容：
 */
public class UserMapperTest {
    private UserMapper userMapper;

    public SqlSession sqlSession;
    @Before
    public void setUp() throws Exception {
        String reource = "mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(reource);
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession =sqlSessionFactory.openSession();
        //this.userDao= new UserDaoImpl(sqlSession);
        this.userMapper=sqlSession.getMapper(UserMapper.class);




    }

    @Test
    @Ignore
    public void queryById() throws Exception {
    }

    @Test
    public void queryAll() throws Exception {
        List<User> userList=this.userMapper.queryAll();
        for(int i=0;i<userList.size();i++){
            System.out.println(userList.get(i).toString());
        }
    }

    @Test
    @Ignore
    public void insertUser() throws Exception {
    }

    @Test
    @Ignore
    public void updateUser() throws Exception {
    }

    @Test
    @Ignore
    public void deleteUser() throws Exception {
    }

}