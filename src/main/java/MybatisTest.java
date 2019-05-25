import com.yks.jdbc.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 文件名：MybatisTest.java
 * 版权：Copyright by www.youkeshu.com
 * 描述：代码注释以及格式化示例
 * 创建人：root
 * 创建时间：2019-05-23 20:12
 * 修改理由：
 * 修改内容：
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sqlSessionFactory.openSession();
        List<User> user = sqlSession.selectList("queryUser");
        for (int i=0;i<user.size();i++) {
            System.out.println(user.get(i).toString());
        }

    }

}
