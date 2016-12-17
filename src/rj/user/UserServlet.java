package rj.user;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 隽 on 2016/12/17.
 */
public class UserServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        //byte[] buf = username.getBytes("ISO8859-1");
       // username = new String(buf,"UTF-8");
        System.out.println("username=" + username);
        String tip = "<font color='green'>可以注册</font>";
        if("杰克".equals(username)){
            tip = "<font color='red'>该用户已存在</font>";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.write(tip);
        pw.flush();
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        System.out.println(username);


        String tip = "/images/MsgSent.gif";


        if("杰克".equals(username)){
            tip = "/images/MsgError.gif";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.write(tip);
        pw.flush();
        pw.close();
    }
}
