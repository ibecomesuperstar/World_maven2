package com.service;

import com.entity.Person;
import com.entity.model.PageModel;
import com.mapper.PersonMapper;
import com.until.GetSqlSession;
import com.until.StringUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author Wangcaisi
 * @date 2021/3/14 13:42
 * @desc： 业务逻辑
 */

public class PersonService {

    /**
     * \
     * 用户登录
     * 1.参数的非空判断
     * 如果参数为空
     * 将状态码、提示信息、回显数据设置到消息模型对象中，返回消息模型对象
     * 2．调用dao层的查询方法，通过用户名查询用户对象
     * 3．判断用户对象是否为空
     * 如果为空，将状态码、提示信息、回显数据设置到消息模型对象中，返回消息模型对象
     * 4．判断数据库中查询到的用户密码与前台传递过来的密码作比较
     * 如果不相等，将状态码、提示信息、回显数据设置到消息模型对象中，返回消息模型对象
     * 5，登录成功，成功状态、提示信息、用户对象设置消息模型对象，并return
     *
     * @param login_user
     * @param login_password
     * @return
     */
    public PageModel personLogin(String login_user, String login_password) {
        PageModel pageModel=new PageModel();

        // 回显数据  多次调用 需要范围大一点
        Person p=new Person();
        p.setP_Name(login_user);
        p.setUser_Password(login_password);
        pageModel.setObject(p);


        //1.参数的非空判断
        if (StringUtil.isEmpty(login_user) || StringUtil.isEmpty(login_password)) {
            //将状态码、提示信息、回显数据设置到消息模型对象中，返回消息模型对象
            pageModel.setCode(0);
            pageModel.setMsg("用户名和密码不能为空");
/*

            // 回显数据  多次调用 需要范围大一点
            Person p=new Person();
            p.setName(login_user);
            p.setUser_Password(login_password);
            pageModel.setObject(p);
*/

            return pageModel;
        }
        // 2．调用dao层的查询方法，通过用户名查询用户对象

        SqlSession session=GetSqlSession.createSqlSession();
        PersonMapper personMapper=session.getMapper(PersonMapper.class);
        Person person=personMapper.selectPerseonByName(login_user);
        //3．判断用户对象是否为空
        if (person == null) {
            // 如果为空，将状态码、提示信息、回显数据设置到消息模型对象中，返回消息模型对象
            //将状态码、提示信息、回显数据设置到消息模型对象中，返回消息模型对象
            pageModel.setCode(0);
            pageModel.setMsg("用户不存在");

/*
            // 回显数据  多次调用 需要范围大一点
            Person p=new Person();
            p.setName(login_user);
            p.setUser_Password(login_password);
            pageModel.setObject(p);
*/


            return pageModel;
        }


        // 4．判断数据库中查询到的用户密码与前台传递过来的密码作比较
        if (!login_password.equals(person.getUser_Password())) {
            //     * 如果不相等，将状态码、提示信息、回显数据设置到消息模型对象中，返回消息模型对象
            pageModel.setCode(0);
            pageModel.setMsg("用户密码不正确");

        }
        //  5，登录成功，成功状态、提示信息、用户对象设置消息模型对象，并return
        pageModel.setObject(person);

        //输出信息
        System.out.println("package com.service 把用户信息放入 pageModel ：" + pageModel.getCode());
        System.out.println(" package com.service 把用户信息放入 pageModel ：" + pageModel.getMsg());
        System.out.println(" package com.service 把用户信息放入 pageModel ：" + pageModel.getObject());


        return pageModel;
    }

    //测试方法
    public static void main(String[] args) {

        //  System.out.println(createSqlSession());

        System.out.println("++++++++++++++++++++");
        System.out.println(GetSqlSession.createSqlSession());
        System.out.println("______________________");
    }

}