<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="include.html"%>
<br>
<hr>
<html>
<body style="color: darkblue">
<%
    if(session.getAttribute("name")==null){
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }
%>
<div>
    <h3 style="font-family: 'Arial Black'" >Fruits</h3>
    <form action="Fruits">
        <select name="fruits">
            <option value="">--Please choose an item(cost)--</option>
            <option value="mango">Mango(10)</option>
            <option value="apple">Apple(20)</option>
            <option value="berries">Barries(3)</option>
            <option value="bannana">Bannana(3)</option>
            <option value="oranges">Orange(5)</option>
        </select><br><br/>
        Quantity<br>
        <input type="text" name="quantity">
        <input type="submit">
    </form>
</div>

<div>
    <h3 style="font-family: 'Arial Black'" >Shampoos</h3>
    <form action="Shampoos">
        <select name="shampoo">
            <option value="">--Please select an item(cost)</option>
            <option value="Dove">Dove</option>
            <option value="Meera">Meera</option>
            <option value="Nyle">Nyle</option>
            <option value="Karthika">Karthika</option>
        </select><br></br>
        <select name="quantity">
            <option value="choose quantity(ml)"></option>
            <option value="250">250ml</option>
            <option value="500">500ml</option>
            <option value="750">750ml</option>
            <option value="1000">1000ml</option>
        </select><br></br>
        <input type="submit">
    </form>
</div>
</body>
</html>
