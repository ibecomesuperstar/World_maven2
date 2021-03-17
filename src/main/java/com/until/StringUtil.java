package com.until;

/**
 * @author  Wangcaisi
 * @date  2021/3/14 14:33
 * @desc： 字符串工具类
 */

public class StringUtil {
    /**
     * 判断字符串是否为空
     *  如果为空返回true ；
     *  如果不为空 返回 false
     *
     * @param str
     * @return
     */
    public  static  boolean isEmpty(String str){
 if (str==null|| "".equals(str.trim())){
     return true;
 }
 else
     return false;

    }


}