package com.example.GroceryInventory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/Cart")

public class Cart extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter aPW=response.getWriter();
        if(request.getSession().getAttribute("Username")==null){
            request.getRequestDispatcher("Login.jsp").forward(request,response);
        }
        aPW.println("<html><head>" + "</head><body>");
        String items[] = request.getParameterValues("items");
        aPW.println("Basket's contents:<BR><BR>");
            reuse re = new reuse();
            float count = re.service(request, response, items);


            aPW.println("<form action='AddToCart' >");
            if (items != null) {
                for (int i = 0; i < items.length; i++) {
                    aPW.println("<input type=hidden name='items' value='" + items[i] + "'>");
                }
            }
            aPW.println("<br><input type=submit value='Add more items'>");
            aPW.println("</form></body></html>");

             aPW.println("<form action='RemoveItem'>");
            if (items != null) {
                for (int i = 0; i < items.length; i++) {
                    aPW.println("<input type=hidden name='items' value='" + items[i] + "'>");
                }
            }
            aPW.println("<br><input type='submit' value='Remove Items'>");
            aPW.println("</form></body></html>");

            aPW.println("<form action='AddDetails.jsp'>");
            for (int i = 0; i < items.length; i++) {
                aPW.println("<input type=hidden name='items' value='" + items[i] + "'>");

            }
            aPW.println("<br><input type='submit' value='Proceed to Buy'>");
            aPW.println("</form>");
    }
}
