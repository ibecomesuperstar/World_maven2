import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;


//import oracle.jdbc.internal.OracleTypes;





public class jdbc {

	public static void main(String[] args) throws Exception   {
		//1.加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//获取数据库连接对象

		String url="jdbc:oracle:thin:@192.168.90.215:1521:jydb";//jydb     192.168.90.215:1521/jydb
		String user="MCMS2_TEST";
		String password="MCMS2_TEST";
Connection con=DriverManager.getConnection(url, user, password);

//获得语句对象
String sql ="{call p_querysal_out(?,?)}";
CallableStatement call = con.prepareCall(sql);
con.prepareCall(sql);
DriverManager.getConnection(url,user,password);

//4.设置输入参数
call.setInt(1,7839);

//5.注册输出参数
//call.registerOutParameter(2,OracleTypes.DOUBLE);


//6.执行储存过程
call.execute();

//7.获取输出参数
double sal =call.getDouble(2);
System.out.println(sal);

//8.释放资源

call.close();
con.close();


	}


}
