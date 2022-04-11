
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="include.html"%>
<%
    if(session.getAttribute("name")==null){
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }
%>
<html>
<head>
    <title>Products</title>
    <style>
        .para{
            background-color: azure;
            height: content-box;
            width: content-box;
        }
    </style>
</head>
<body>
<fieldset class="para">
    <img src="https://m.media-amazon.com/images/I/81iPoakl-hL._AC_UL320_.jpg"><br>
    <h3>Dove</h3>
    <p>
        Brand :	Dove<br>
        Scent :	Anti-Frizz Oil Therapy<br>
        Hair Type :	Unruly, Frizzy, Dry, Damaged<br>
        Litres :250(ml)<br>
        Cost/unit : 140 (Indian ruppes)<br>
    </p>
</fieldset>
<fieldset>
    <img src="https://m.media-amazon.com/images/I/416gC3zJj0L._AC_UL320_.jpg">
    <p>
        Brand : Fuji Apples<br>
        Cost/unit : 20(Indian ruppes)<br>
    </p>

</fieldset>
</body>
</html>
