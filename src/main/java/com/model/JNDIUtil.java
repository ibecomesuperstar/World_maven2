/**
 @Description：
 */
package com.model;

/**
 *       @author： Wangcaisi Administrator
 *        @date : 2021年2月19日 上午11:33:17
 *  @Description：

 */


import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;




public class JNDIUtil {
	//创建数据源对象
	private static ComboPooledDataSource data = null;
	private static Connection con = null;
	//加载配置内容
	static{
		//自动查找到项目的配置文件
		data = new ComboPooledDataSource();
	}
	//获取连接对象
	public static Connection openConnection(){
		//获取连接对象
		try {
			con = data.getConnection();
			System.out.println("C3P0连接池中获取连接成功！！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取连接失败");
		}
		return con;
	}
	//释放连接
	public static void closeConnection(){
		if(con!=null){
			try {
				con.close();
				System.out.println("将连接释放会C3P0连接池");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
