package com.example.Inventory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Fruits")
public class Fruits extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw=response.getWriter();
        String fruitname=request.getParameter("fruits");
        Integer quantity = Integer.valueOf(request.getParameter("quantity"));
        Integer cost=0;
        if(fruitname.equals("mango")){
            cost=10*quantity;
        }
        if(fruitname.equals("bannana")){
            cost=3*quantity;
        }
        if(fruitname.equals("apple")){
            cost=20*quantity;
        }
        if(fruitname.equals("berries")){
            cost=3*quantity;
        }
        if(fruitname.equals("oranges")){
            cost=5*quantity;
        }


        pw.println("<html><body style=\"color: red\">");
        pw.println("Each "+ fruitname+" costs "+cost+" rupees");
        pw.println("</body></html>");
        HttpSession session=request.getSession();
        session.setAttribute("quantity",quantity);
        session.setAttribute("fruitname",fruitname);
    }
}
