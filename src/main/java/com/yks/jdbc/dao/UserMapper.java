package com.yks.jdbc.dao;

import com.yks.jdbc.entity.User;
import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized;

import java.util.List;

/**
 * 文件名：UserMapper.java
 * 版权：Copyright by www.youkeshu.com
 * 描述：代码注释以及格式化示例
 * 创建人：root
 * 创建时间：2019-05-24 8:45
 * 修改理由：
 * 修改内容：
 */
public interface UserMapper {
    public User queryById(@Param("userName")String id );
    public List<User> queryAll();
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
