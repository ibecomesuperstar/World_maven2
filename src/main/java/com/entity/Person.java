package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author： Wangcaisi Administrator
 * @date : 2021年2月18日 下午4:41:52
 * @Description：实体类：用户的基本数据 如：编号 姓名 密码 性别 电话 邮箱
 */
public class Person implements Serializable {
    private int p_Id;               //编号
    private String p_Name;          //姓名
    private String User_Password; //密码
    private String p_Sex;           //性别
    private String p_Phone;         //电话
    private String p_Email;         //邮箱
    private String p_Address;       //地址
    private String p_Attention;     //关注
    private int p_Fans;             //粉丝
    private String p_Friends;       //好友
    private int p_COUNT;            //数
    private int p_SUM;              //统计
    private int p_Level;            //水平值p_
    private Date p_Createdate;      //创建时间
    private Date p_Updatedate;      //更新时间
    private int p_Flag;             //有效
    private String p_Request;       //请求报文
    private String p_Respond;       //响应报文
    private String p_Msg;           //信息体
    private Date p_Age;           //年龄

    public int getP_Id() {
        return p_Id;
    }

    public void setP_Id(int p_Id) {
        this.p_Id = p_Id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String user_Password) {
        User_Password = user_Password;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getP_Phone() {
        return p_Phone;
    }

    public void setP_Phone(String p_Phone) {
        this.p_Phone = p_Phone;
    }

    public String getP_Email() {
        return p_Email;
    }

    public void setP_Email(String p_Email) {
        this.p_Email = p_Email;
    }

    public String getP_Address() {
        return p_Address;
    }

    public void setP_Address(String p_Address) {
        this.p_Address = p_Address;
    }

    public String getP_Attention() {
        return p_Attention;
    }

    public void setP_Attention(String p_Attention) {
        this.p_Attention = p_Attention;
    }

    public int getP_Fans() {
        return p_Fans;
    }

    public void setP_Fans(int p_Fans) {
        this.p_Fans = p_Fans;
    }

    public String getP_Friends() {
        return p_Friends;
    }

    public void setP_Friends(String p_Friends) {
        this.p_Friends = p_Friends;
    }

    public int getP_COUNT() {
        return p_COUNT;
    }

    public void setP_COUNT(int p_COUNT) {
        this.p_COUNT = p_COUNT;
    }

    public int getP_SUM() {
        return p_SUM;
    }

    public void setP_SUM(int p_SUM) {
        this.p_SUM = p_SUM;
    }

    public int getP_Level() {
        return p_Level;
    }

    public void setP_Level(int p_Level) {
        this.p_Level = p_Level;
    }

    public Date getP_Createdate() {
        return p_Createdate;
    }

    public void setP_Createdate(Date p_Createdate) {
        this.p_Createdate = p_Createdate;
    }

    public Date getP_Updatedate() {
        return p_Updatedate;
    }

    public void setP_Updatedate(Date p_Updatedate) {
        this.p_Updatedate = p_Updatedate;
    }

    public int getP_Flag() {
        return p_Flag;
    }

    public void setP_Flag(int p_Flag) {
        this.p_Flag = p_Flag;
    }

    public String getP_Request() {
        return p_Request;
    }

    public void setP_Request(String p_Request) {
        this.p_Request = p_Request;
    }

    public String getP_Respond() {
        return p_Respond;
    }

    public void setP_Respond(String p_Respond) {
        this.p_Respond = p_Respond;
    }

    public String getP_Msg() {
        return p_Msg;
    }

    public void setP_Msg(String p_Msg) {
        this.p_Msg = p_Msg;
    }

    public Date getP_Age() {
        return p_Age;
    }

    public void setP_Age(Date p_Age) {
        this.p_Age = p_Age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "p_Id=" + p_Id +
                ", p_Name='" + p_Name + '\'' +
                ", User_Password='" + User_Password + '\'' +
                ", p_Sex='" + p_Sex + '\'' +
                ", p_Phone='" + p_Phone + '\'' +
                ", p_Email='" + p_Email + '\'' +
                ", p_Address='" + p_Address + '\'' +
                ", p_Attention='" + p_Attention + '\'' +
                ", p_Fans=" + p_Fans +
                ", p_Friends='" + p_Friends + '\'' +
                ", p_COUNT=" + p_COUNT +
                ", p_SUM=" + p_SUM +
                ", p_Level=" + p_Level +
                ", p_Createdate=" + p_Createdate +
                ", p_Updatedate=" + p_Updatedate +
                ", p_Flag=" + p_Flag +
                ", p_Request='" + p_Request + '\'' +
                ", p_Respond='" + p_Respond + '\'' +
                ", p_Msg='" + p_Msg + '\'' +
                ", p_Age=" + p_Age +
                '}';
    }
}

