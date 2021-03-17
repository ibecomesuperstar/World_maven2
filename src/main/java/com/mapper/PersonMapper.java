package com.mapper;

import com.entity.Person;

/**
 * @author Wangcaisi
 * @date 2021/3/13 15:18
 * @desc： 用户接口类 接口的名字跟映射文件 里的  namespace 一致
 */



public interface PersonMapper {

    public Person selectPerseonByName(String p_Name);
}
