package com.entity.model;

/**
 * @author Wangcaisi
 * @date 2021/3/14 13:35
 * @desc： 消息模型对象 用来做数据响应
 * 状态码 1： 成功  0： 失败
 * 提示信息 字符串
 * 回显 数据 object
 */


public class PageModel {
    /**
     *  private int code=1;  //状态码  之前这个1 没有默认设置 ，后面都是0 没有设置成1 的情况 所以会失败
     */
    private int code=1;  //状态码
    private String msg="成功"; //提示信息
    private Object object; // 回显对象 基本数据类型 字符串类型 list map

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code=code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg=msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object=object;
    }
}