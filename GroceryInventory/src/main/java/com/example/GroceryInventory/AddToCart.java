package com.example.GroceryInventory;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;


@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

        PrintWriter pw = response.getWriter();
        request.getRequestDispatcher("Include.jsp").include(request,response);

        HttpSession session=request.getSession();
        if(session.getAttribute("Username")==null){
            request.getRequestDispatcher("Login.jsp").forward(request,response);
        }
        pw.println( "<html><head><title>Shopping Basket" + "</title></head><body>" );

        pw.println( "<form action='Cart' METHOD=GET>" );

        pw.println( "Add to Basket:<BR><BR>" );

        pw.println( "<input TYPE='checkbox' name='items' VALUE='Mango  $10.0'>Mango  $10<BR>" );

        pw.println( "<input TYPE='checkbox' name='items' VALUE='Apple  $30.0'>Apples  $30<BR>" );

        pw.println( "<input TYPE='checkbox' name='items' VALUE='Orange $6.0'>Orange  $6<BR>" );

        pw.println( "<input TYPE='checkbox' name='items' VALUE='Banana  $3.0'>Banana  $3<BR>" );

        String items[] = request.getParameterValues( "items" );

        if ( items != null ) {

            for ( int i=0; i < items.length; i++ ) {

                pw.println( "<input type='hidden' name='items' value='" + items[i] + "'>" );

            }
        }

        pw.println( "<br><input type=submit value='View Cart'>" );
    }
}
