<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="include.html"%>
<br><hr>
<%
    if(session.getAttribute("name")==null){
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }
%>

<%
        PrintWriter pw = response.getWriter();
        String fruitname = session.getAttribute("fruitname").toString();
        Integer quantity = (Integer) session.getAttribute("quantity");
        Integer instock = 60;
        Integer outofstock = 0;

%>
<html>
<head>
    <title>Inventory</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Product Name</th>
            <th>Total stock</th>
            <th>Available</th>
            <th>Requirement</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>1</th>
            <th>Apples</th>
            <th>60</th>
            <th>
                <%
                    if(fruitname.equals("apple") && quantity<60){
                        instock=instock-quantity;
                    }
                    else if( fruitname.equals("apple") && quantity>60){
                        pw.println(fruitname+" exceeded the quantity ");
                        outofstock=quantity-instock;
                        instock=0;
                    }
                    else{
                        instock=60;
                        outofstock=0;
                    }
                %>
                <%=instock%>
            </th>
            <th><%=outofstock%></th>
        </tr><tr>
            <th>2</th>
            <th>Oranges</th>
            <th>60</th>
            <th>
                <%
                    if(fruitname.equals("oranges") && quantity<60){
                        instock=60-quantity;
                    }
                    else if( fruitname.equals("oranges") && quantity>60){
                        pw.println(fruitname+" exceeded the quantity");
                        outofstock=quantity-instock;
                        instock=0;
                    }
                    else{
                        instock=60;
                        outofstock=0;
                    }
                %>
                <%=instock%>
            </th>
            <th><%=outofstock%></th>
        </tr><tr>
            <th>3</th>
            <th>Berries</th>
            <th>60</th>
            <th>
                <%
                    if(fruitname.equals("berries") && quantity<60){
                        instock=60-quantity;
                    }
                    else if( fruitname.equals("berries") && quantity>60){
                        pw.println(fruitname+" exceeded the quantity");
                        outofstock=quantity-instock;
                        instock=0;
                    }
                    else{
                        instock=60;
                        outofstock=0;
                    }
                %>
                <%=instock%>
            </th>
            <th><%=outofstock%></th>
        </tr><tr>
            <th>4</th>
            <th>Mangoes</th>
            <th>60</th>
            <th>
                <%
                    if(fruitname.equals("mango") && quantity<60){
                        instock=60-quantity;
                    }
                    else if( fruitname.equals("mango") && quantity>60){
                        pw.println(fruitname+" exceeded the quantity");
                        outofstock=quantity-instock;
                        instock=0;
                    }
                    else{
                        instock=60;
                        outofstock=0;
                    }
                %>
                <%=instock%>
            </th>
            <th><%=outofstock%></th>
        </tr>
        </tbody>
    </table>
</body>
</html>
