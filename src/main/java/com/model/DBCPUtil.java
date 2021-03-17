/**
 @Description：
 */
package com.model;



import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
/**
 *       @author： Wangcaisi Administrator
 *        @date : 2021年2月19日 上午11:34:57
 *  @Description：

 */


public class DBCPUtil
{//创建配置对象
    private static Properties ps= new Properties();
    //创建数据源对象
    private static DataSource data = null;
    //创建连接对象
    private static Connection con = null;
    //加载文件配置信息
    static {
        //查找到dbcp.properties文件
        try {
            FileInputStream file = new FileInputStream(DBCPUtil.class.getResource("/").getPath()+ "dbcp.properties");
            //加载配置文件内容
            ps.load(file);
            //获取数据源对象
            //data =BasicDataSourceFactory.createDataSource(ps);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("文件未找到！！！！");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("读取内容错误，请检查！！！");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("未知异常，请检查！！！！");
        }

    }
    public static Connection openConnection() {
        //获取连接对象
        try {
            con = data.getConnection();
            System.out.println("DBCP连接成功！！！");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("获取连接失败");
        }
        return con;
    }
    //释放连接对象
    public static void closeConnection() {
        if(con!=null) {
            try {
                con.close();
                System.out.println("DBCP连接释放成功！！！");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    //测试方法
    public static void main(String[] args) {
        openConnection();
    }

}
