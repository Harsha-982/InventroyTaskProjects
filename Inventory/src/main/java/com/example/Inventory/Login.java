package com.example.Inventory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")
public class Login extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw=response.getWriter();
        String name= request.getParameter("name");
        String psw=request.getParameter("password");
        if(name.equals("h") && psw.equals("t")){
            HttpSession session1=request.getSession();
            session1.setAttribute("name",name);
            response.sendRedirect("list.jsp");
        }
        else{
            pw.println("sorry username or password is invalid");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}
