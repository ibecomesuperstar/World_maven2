/**
 *
 */
package com.entity;

/**
 * @author:Wangcsi Wangcs
 * @date : 2021-2-19 23:00:21
 * @Description:文章部分，定义为一张表
 */
public class Blog {
	private int f_id;             //外键  用于关联
	private int id;               //编号
	private String head;          //姓名
	private String text;           //文章主题
	private String label;          //标签  多个字段数据匹配前段 0 1 2 3 4 5 6 7
	private String author;         // 作者

	private String phone;          //电话
	private String email;          //邮箱
	private String createDate;       //创建时间
	private String picture;        //图片
	private String video;          //视频       可能为空 但也要toSting
	private String link;           //链接
	private String updateDate;       //跟新时间
	private int flag;              //有效否

}
