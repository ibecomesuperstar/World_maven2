package com.dao;


import com.entity.Person;

import java.util.List;

/**
 * @author： Wangcaisi Administrator
 *  @date : 2021年2月18日 下午4:41:52
 *  @Description： 对用户的       增            删         改            查          接口

 */
public interface IPersonDao {
	Person selectPerson(int id);            //查某用户
	List<Person> showPerson();              //查询显示所有用户
	int addPerson(Person person);           //增加用户
	int deletePerson(int id);               // 删除用户
	int updatePerson(int id);               // 更新用户

	List<Person> showPerson_byname(String name);         //通过姓名查询
	List<Person> showPerson_byid(int id);                //通过编号查询
	List<Person> showPerson_byidandname(String name, int id);           //通过        编号查询      姓名查询


}
