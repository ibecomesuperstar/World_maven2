import com.entity.Person;
import com.mapper.PersonMapper;
import com.until.GetSqlSession;
import org.apache.ibatis.session.SqlSession;


/**
 * @author  Wangcaisi
 * @date  2021/3/13 18:41
 * @desc：  SqlSession 测试类
 */
 
 
 
    public class PersonMapper_test { //

    public static void main(String[] args) {
        //获取 SqlSession 对象  又返回到原点 去 把那个 异常捕获了 是太容易catch 的方式 ，那为什么是那个方式呢
        SqlSession session=GetSqlSession.createSqlSession();
        //得到对应的mapp
        PersonMapper personMapper=session.getMapper(PersonMapper.class);

        System.out.println(""+PersonMapper.class);
        System.out.println(""+session.getMapper(PersonMapper.class));
        System.out.println(""+personMapper);


        //调用方法返回用户对象
        //只得到了密码
        Person person =personMapper.selectPerseonByName("李四");
   /*     缝缝补补有没有错了，就把pom.mxl下面这块删掉，因为与数据库版本不匹配*/
        /*
        *        <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.11</version>
        </dependency>
        *
        * */
        //建立的数据要与表的一致 查出来的数据是错的  p_Name='李四', User_Password='test'
        System.out.println(""+person);
    }

}