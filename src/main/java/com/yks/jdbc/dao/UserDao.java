package com.yks.jdbc.dao;

import com.yks.jdbc.entity.User;

import java.util.List;

/**
 * 文件名：UserDao.java
 * 版权：Copyright by www.youkeshu.com
 * 描述：代码注释以及格式化示例
 * 创建人：root
 * 创建时间：2019-05-23 21:09
 * 修改理由：
 * 修改内容：
 */
public interface UserDao {
    public User queryById(String id );
    public List<User> queryUserAll();
    public void insertUser(User user);

    /**
     * 更新用户信息
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * 根据id删除用户信息
     *
     * @param id
     */
    public void deleteUser(String id);
}
