package com.example.GroceryInventory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
@WebServlet("/Remove")
public class Remove extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter pw=response.getWriter();
        HttpSession session=request.getSession();
        if(session.getAttribute("Username")==null) {
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
        pw.println("<html><head><title>Remove</title></head><body>");
        String items[] =request.getParameterValues("items");
        ArrayList<String> newItems1=new ArrayList<String>();
        for(int i=0;i< items.length;i++){
            newItems1.add(items[i]);
        }
        String newItems[]=request.getParameterValues("newitems");
        pw.println("<form action='Cart'>");
        if(newItems!=null) {
            for (int i = 0; i < newItems.length; i++) {
                if (newItems1.contains(newItems[i])) {
                    pw.println(newItems[i]);
                    pw.println("<br><br>");
                    newItems1.remove(newItems[i]);
                }
            }

            for (int i = 0; i < newItems1.size(); i++) {
                pw.println("<input type=hidden name=items value='" + newItems1.get(i) + "'>");
            }
        }
        pw.println("<br><br>");
        pw.println("<input type=submit value='Remove Items From Cart'></form>");
        pw.println("</body></html>");
    }
}
