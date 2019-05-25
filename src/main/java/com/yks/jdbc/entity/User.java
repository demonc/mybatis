package com.yks.jdbc.entity;

/**
 * 文件名：com.yks.jdbc.entity.User.java
 * 版权：Copyright by www.youkeshu.com
 * 描述：代码注释以及格式化示例
 * 创建人：root
 * 创建时间：2019-05-23 20:02
 * 修改理由：
 * 修改内容：
 */
public class User {
    private String user;
    private String plugin;
    private String authenticationString;
    private String password_expired;
    private String account_locaked;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public String getAuthenticationString() {
        return authenticationString;
    }

    public void setAuthenticationString(String authenticationString) {
        this.authenticationString = authenticationString;
    }

    public String getPassword_expired() {
        return password_expired;
    }

    public void setPassword_expired(String password_expired) {
        this.password_expired = password_expired;
    }

    public String getAccount_locaked() {
        return account_locaked;
    }

    public void setAccount_locaked(String account_locaked) {
        this.account_locaked = account_locaked;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", plugin='" + plugin + '\'' +
                ", authenticationString='" + authenticationString + '\'' +
                ", password_expired='" + password_expired + '\'' +
                ", account_locaked='" + account_locaked + '\'' +
                '}';
    }
}
