/**
 * @Description：
 */
package com.dao;

import com.model.C3P0Util;
import com.entity.Person;
import com.model.DBCPUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author： Wangcaisi Administrator
 * @date : 2021-3-4 15:40:07
 * @Description：
 */
public class PersonDao {

/*
查询一个用户 hibernate 方法
 */
    public static Person selectPerspon(int id) {
        Person p = null;//要做返回。
        Connection con = null;//定义在这更好关闭
        PreparedStatement ptmt = null;
        ResultSet rs = null;


        try {
            con = DBCPUtil.openConnection();

            //   String sql = "" + " select * from Person " + " where id=? ";
            String sql = "" + " select * from person " + " where id=? ";

            ptmt = con.prepareStatement(sql);

            ptmt.setInt(1, id);

            rs = ptmt.executeQuery();

            while (rs.next()) {
                /*
                * private int Id;               //编号 0
	private String Name;          //姓名0
	private String Password;      //密码0
	private String Sex;           //性别0
	private String Phone;         //电话0
	private String Email;         //邮箱0
	private String Adress;        //地址0
	private Date CreateDate;      //创建时间
	private Date UpdateDate;      //更新时间
	private int Flag;             //有效
	private String Request;       //请求报文
	private String Respond;       //响应报文*/
                p = new Person();

                p.setP_Id(rs.getInt("p_id"));
                p.setP_Name(rs.getString("p_name"));
                p.setUser_Password(rs.getString("user_password"));
                p.setP_Sex(rs.getString("p_sex"));
                p.setP_Phone(rs.getString("p_phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (ptmt != null) {
                    ptmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return p;
    }


    /*

    查询所有用户 hibernate 方法
     */



    //数据库添加  person  已成功，但需要 值为 ？ 的情况
    public static void  insertInfo() throws Exception{
        //打开连接
        //Connection con = openConnection(); //一般方法
        Connection con = DBCPUtil.openConnection(); //DBCP方法  解决建立数据库连接耗费资源和时间很多的问题，提高性能。
        //编写数据库语句
        String sql="insert into person(id,user_password)  values('3','123456')";
        //编译数据库语句
        Statement st =  con.createStatement();
        //执行语句添加
      st.executeUpdate(sql);

        con.close();
    }

    //数据库查询所有
    public static  List<Person>  selectAllPerson() throws SQLException {
//创建集合对象
        List<Person> persons = new ArrayList<Person>();
        //获取数据库的连接
        Connection con = C3P0Util.openConnection();
        //编写数据库语句
        String sql = "select * from person";
        //获取编译对象Statement
        Statement st = con.createStatement();
        //执行sql语句
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Person ps = new Person();
            ps.setP_Id(rs.getInt("p_id"));
            ps.setP_Name(rs.getString("p_name"));
            ps.setUser_Password(rs.getString("user_password"));
            ps.setP_Sex(rs.getString("p_sex"));
            ps.setP_Phone(rs.getString("p_phone"));
            ps.setP_Email(rs.getString("p_email"));
            ps.setP_Address(rs.getString("p_address"));
            ps.setP_Createdate(rs.getDate("p_createDate"));
            ps.setP_Updatedate(rs.getDate("p_updateDate"));
            ps.setP_Flag(rs.getInt("p_flag"));
            ps.setP_Request(rs.getString("p_request"));
            ps.setP_Respond(rs.getString("p_respond"));
            persons.add(ps);

        }
        System.out.println("PersonDao 输出 ： "+persons);

        return persons;


    }



    public static void main(String[] args) throws Exception {

      //  insertInfo();
        selectAllPerson();

    }
}
