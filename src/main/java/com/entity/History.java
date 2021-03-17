/**
 *
 */
package com.entity;

/**
 * @author:Wangcsi Wangcs
 * @date : 2021-2-19 23:02:47
 * @Description:历史聊天记录
 */
public class History {
	private int f_id;             //外键
	private int id;               //编号
	private String name;          //  昵称
	private String target_name;   //目的 昵称  设置为一个可修改备注吧
	private int target_id;        //目的 编号
	private int message;          //交互信息
	private String createDate;      //创建时间
	private String updateDate;      //更新时间
	private int flag;             //有效 设置一个撤回
	private String request;       //请求报文
	private String respond;       //响应报文

}
