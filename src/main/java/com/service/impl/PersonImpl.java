package com.service.impl;

import com.dao.PersonDao;
import com.entity.Person;
import com.model.C3P0Util;

import java.sql.SQLException;
import java.util.List;

/**
 * @author： Wangcaisi Administrator
 * @date : 2021年2月19日 下午3:41:59
 * @Description： 业务逻辑实现
 */
public class PersonImpl {
    public static List<Person> selectAllPersonimpl() {
        List<Person> persons = null;
        PersonDao dao = new PersonDao();
        try {
            persons = dao.selectAllPerson();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            C3P0Util.closeConnection();
        }
        System.out.println("  PersonImpl 输出：  " + persons);
        return persons;
    }

    public static void main(String[] args) {
        //List<Person> p = null;

        List<Person>  p= null;
/*
list集合有三种遍历方式:
List<Product> list = new ArayList<Product>();
            for(int i=0 ; i< list.size();i++){

               System.out.println(list.get(i).getId()+":"+list.get(i).getName());

            }
       2、方法二 ：迭代器
            //创建迭代器对象
            Iterator<Product> it = list.iterator();
            while(it.hasNext()){
                 Product nextPro = it.next();
                System.out.println(nextPro.getId()+" : "+nextPro.getName());
            }
        3、方法三：for...each
            for(Product pro:list){
                  System.out.println(pro.getId()+":"+pro.getName());
            }
*/
       p = selectAllPersonimpl();
       for (int i=0 ; i< p.size();i++){
           System.out.println("遍历  selectAllPersonimpl   "+"第"+i+"条"+"   " +p.get(i).getP_Name());
           System.out.println("遍历  selectAllPersonimpl   "+"第"+i+"条"+"   " +p.get(i).getUser_Password());
           System.out.println("遍历  selectAllPersonimpl   "+"第"+i+"条"+"   " +p.get(i).getP_Createdate());
           System.out.println("遍历  selectAllPersonimpl   "+"第"+i+"条"+"   " +p.get(i).getP_Age());
           System.out.println("遍历  selectAllPersonimpl   "+"第"+i+"条"+"   " +p.get(i).getUser_Password());
           System.out.println("遍历  selectAllPersonimpl   "+"第"+i+"条"+"   " +p.get(i).getP_COUNT());
           System.out.println("遍历  selectAllPersonimpl   "+"第"+i+"条"+"   " +p.get(i).getP_Phone());
           System.out.println("遍历  selectAllPersonimpl   "+"第"+i+"条"+"   " +p.get(i).getP_Updatedate());

       }


    }
}
