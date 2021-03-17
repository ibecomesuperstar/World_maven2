/**
 *
 */
package com.entity;

/**
 * @author:Wangcsi Wangcs
 * @date : 2021-2-19 23:01:12
 * @Description:记录个性签名
 */
public class Record {
	private int f_id;             //外键
	private int id;               //编号
	private String name;          //姓名
	private String password;      //密码
	private String sex;           //性别
	private String phone;         //电话
	private String email;         //邮箱
	private  String createDate;      //创建时间
	private String updateDate;      //更新时间
	private int flag;             //有效
	private String request;       //请求报文
	private String respond;       //响应报文

}
