import com.mysql.jdbc.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * 文件名：JDBCTest.java
 * 版权：Copyright by www.youkeshu.com
 * 描述：代码注释以及格式化示例
 * 创建人：root
 * 创建时间：2019-05-23 14:35
 * 修改理由：
 * 修改内容：
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet =null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/demo";
            String userName = "root";
            String passWord = "root";
            String sql = "select 1 as AA from dual";

            //获取Connection
            connection=DriverManager.getConnection(url,userName,passWord);

            //对SQL 进行预编译
            preparedStatement =connection.prepareStatement(sql);
            //执行SQL
            preparedStatement.execute(sql);
            resultSet=preparedStatement.getResultSet();





            while(resultSet.next()){
                System.out.println(resultSet.getString("AA"));
           }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(resultSet!=null){
                resultSet.close();
            }

            if (connection !=null) {
                connection.close();
            }
        }


    }
}
