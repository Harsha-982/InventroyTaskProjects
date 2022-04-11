<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Include.jsp"%>
<html>
<head>
    <title>Address</title>
</head>
<body>
<%
    PrintWriter pw=response.getWriter();
    if(session.getAttribute("Username")==null){
        request.getRequestDispatcher("Login.jsp").forward(request,response);
    }
%>

<form name='details' action="/Payment" method="post">
    <h3>Enter Delivery Address</h3><br>
    Name:<input type="text" name="name"><br>
    D_no:<input type="text" name="d_no"><br>
    Home_Town:<input type="text" name="home_Town"><br>
    Street:<input type="text" name="street"><br>

    <h3>Enter CardHolderDetails</h3><br>
    CardHolderName:<input type="text" name="cardHolderName"><br>
    CardNumber:<input type="text" name="cardNumber"><br>
    CVV:<input type="text" name="cVV">

<%
    String[] items=request.getParameterValues("items");
    for(int i=0; i<items.length;i++){
%>
    <input type="hidden" name="items" value="<%=items[i]%>">
    <%
        }
    %>
    <input type="submit" value="Add Card and Address">
</form>
</body>
</html>
