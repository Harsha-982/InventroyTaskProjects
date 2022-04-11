<%@ page import="java.io.PrintWriter" %>
<%@include file="include.html"%>
<html>
<body>
    <%
        PrintWriter pw= response.getWriter();
        if(session.getAttribute("name")==null){
            pw.println("you haven't logged in");
        }
        else {
            session.removeAttribute("name");
            session.removeAttribute("fruitname");
            session.removeAttribute("quantity");
            session.invalidate();
            pw.println("Succesfully logged out");
        }
    %>
</body>
</html>