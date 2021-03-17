package com.servlet;


import com.entity.Note;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * author： wangcaisi
 * date： 2021/3/9 15:26
 * desc：
 */
/*@RequestMapping(value = "load.do")*/
public class LoadNoteServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        List<Note> list = new ArrayList<Note>();
        Note note = new Note();
        note.setId("01");
        note.setName("java变量");
        Note note1 = new Note();
        note1.setId("02");
        note1.setName("ajax应用");
        list.add(note);
        //将note对象集合转成json数组（静态方法）


       // JSONArray json = JSONArray.fromObject(list);



        out.println(list);
       // String json_str = json.toString();
        //out.print(json_str);
        out.flush();
        out.close();

    }

}