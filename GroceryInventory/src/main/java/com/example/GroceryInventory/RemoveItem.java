package com.example.GroceryInventory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/RemoveItem")
public class RemoveItem extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw=response.getWriter();
        HttpSession session=request.getSession();
        if(session.getAttribute("Username")==null){
            request.getRequestDispatcher("Login.jsp").forward(request,response);
        }
        pw.println( "<html><head><title>Shopping Basket" + "</title></head><body>" );
        pw.println("Select items to remove");
        String items[] =request.getParameterValues("items");

        if(items!=null){
            pw.println("<form action='Remove'>");
            pw.println("<ul>");
            for(int i=0;i<items.length;i++){
                pw.println("<li>"+items[i]+ "<input type='checkbox' name='newitems' value='" + items[i] + "'" + " />");
                pw.println("<input type=hidden name='items' value='"+items[i]+"'"+"/>");
            }
        }
        pw.println("</ul>");
        pw.println("<input type=submit value='Continue'");
        pw.println("</body></html>");

    }
}
