package com.example.Inventory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Shampoos")
public class Shampoos extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw=response.getWriter();
        String shampooname=request.getParameter("shampoo");
        Integer quantity1 = Integer.valueOf(request.getParameter("quantity"));
        Integer cost=0;
        if(shampooname.equals("Dove")){
            cost=140*(quantity1)/250;
        }
        if(shampooname.equals("Meera")){
            cost=120*(quantity1)/250;
        }
        if(shampooname.equals("Nyle")){
            cost=110*(quantity1)/250;
        }
        if(shampooname.equals("Karthika")){
            cost=100*(quantity1)/250;
        }
        pw.println("<html><body style=\"color: red\">");
        pw.println("Each "+ shampooname+" costs "+cost+" rupees");
        pw.println("</body></html>");
        
    }
}
