package com.yks.jdbc.daoimpl;

import com.yks.jdbc.dao.UserDao;
import com.yks.jdbc.entity.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 文件名：UserDaoImpl.java
 * 版权：Copyright by www.youkeshu.com
 * 描述：代码注释以及格式化示例
 * 创建人：root
 * 创建时间：2019-05-23 21:18
 * 修改理由：
 * 修改内容：
 */
public class UserDaoImpl implements UserDao {

    public SqlSession sqlSession;

    public UserDaoImpl(SqlSession sqlSession){
        this.sqlSession=sqlSession;
    }

    public User queryById(String id) {
        return sqlSession.selectOne("UserDaoMapper.queryUserById",id);
    }


    public List<User> queryUserAll() {
        return sqlSession.selectList("UserDaoMapper.queryUserAll");
    }

    public void insertUser(User user) {
        this.sqlSession.insert("UserDaoMapper.insertUser",user);
    }

    public void updateUser(User user) {
        this.sqlSession.update("UserDaoMapper.updateUser",user);
    }

    public void deleteUser(String id) {
        this.sqlSession.delete("UserDaoMapper.deleteUser",id);
    }
}
