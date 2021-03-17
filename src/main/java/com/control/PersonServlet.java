package com.control;

import com.entity.model.PageModel;
import com.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Wangcaisi
 * @date 2021/3/14 13:45
 * @desc：
 */


@WebServlet("/login")  //form 的是login 所以你这里需要时login
public class PersonServlet extends HttpServlet {       //extends HttpServlet 实现Servlet 规范

    //实例化PersonService 对象      control 调用 service

    private PersonService personService=new PersonService();

    //ctrl + o  打开重写方法

    /**
     * 用户登录：
     * 1接收客户端请求 接收参数 姓名 密码
     * 2 调用service 层方法，返回消息对象模型
     * 3 判断消息模型状态码
     * 如果状态码失败
     * 将消息模型对象设置到request 作用域，请求转发到login。jsp
     * 如果状态码成功
     * 将消息模型设置到session 作用域 ，重定向跳转到index。jsp
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //1接收客户端请求 接收参数 姓名 密码
        String login_user=request.getParameter("login_user");
        String login_password=request.getParameter("login_password");
          //2 调用service 层方法，返回消息对象模型

        PageModel pageModel=personService.personLogin(login_user, login_password);


        //     * 3 判断消息模型状态码
        if (pageModel.getCode() == 1) {
            //成功
            //     * 将消息模型对象设置到request 作用域，请求转发到login.html

            request.getSession().setAttribute("pageModel",pageModel.getObject());  //她的 是user
            //重定向
            response.sendRedirect("index_2.html");


        } else {
            //失败
              //* 如果状态码失败
            //     * 将消息模型对象设置到request 作用域，请求转发到login.html
            request.setAttribute("pageModel",pageModel);
            System.out.println( pageModel.getObject());
            request.getRequestDispatcher("login.html").forward(request,response);

        }
        //super.service(req, resp);
    }

}