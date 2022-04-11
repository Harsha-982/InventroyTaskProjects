package com.example.GroceryInventory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class reuse extends HttpServlet {
    public float service(HttpServletRequest request, HttpServletResponse response,String[] items) throws IOException, ServletException {


        PrintWriter aPW=response.getWriter();
        if(request.getSession().getAttribute("Username")==null){
            request.getRequestDispatcher("Login.jsp").forward(request,response);
        }
        float count = 0;
        aPW.println("<html><body>");
        if (items == null) {
            aPW.println("No items in basket yet");
        }
        else {
        aPW.println("<ul>");
        for (int i = 0; i < items.length; i++) {
        int positionOfPound = items[i].indexOf("$") + 1;
        String numberStr = items[i].substring(positionOfPound);

        float price = Float.parseFloat(numberStr);
        count = count + price;
        aPW.println("<li>" + items[i] + "<input type='checkbox' name='items' value='" + items[i] + "'" + " />");
        aPW.println();
        }
        Integer Size = items.length;
        aPW.println("<br><br>SubTotal(" + Size + "): $" + count);
        aPW.println("</UL>");
        }
        return count;
    }
}
