/**
 * @author  Wangcaisi
 * @date  2021/3/14 11:31
 * @desc：
 */



import java.sql.*;

/**
 * @auther SyntacticSugar
 * @data 2018/9/7 0007下午 9:32
 * <p>
 * 3、JDBC编程步骤
 * 步骤一 装载驱动 DriverManager.registerDriver(new Driver());//建议使用反射注册驱动
 * 步骤二 建立连接 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day04", "root", "abc");
 * 步骤三 操作数据SQL 对于结果集处理
 * Statement statement = conn.createStatement();
 * ResultSet rs = statement.executeQuery(sql);
 * while (rs.next()) {
 * System.out.println(rs.getString("username"));
 * System.out.println(rs.getString("email"));
 * }
 * <p>
 * 步骤四 释放资源
 * rs.close();
 * statement.close();
 * conn.close();
 */
public class mybtis {
    public static void main(String[] args) {
        //注册 连接 执行 关闭
        try {
//            DriverManager.registerDriver(new Driver());
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/World?serverTimezone" +
                            "=UTC&characterEncoding=utf-8&useSSL=false", "root", "root");
            Statement statement = connection.createStatement();
            String sql="select  * from person ";
            ResultSet set = statement.executeQuery(sql);//执行

            while (set.next()){
                System.out.println(set.getString("p_id") + set.getString("p_name"));
            }
            //关闭资源
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
