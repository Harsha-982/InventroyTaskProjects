<%@ page import="java.io.PrintWriter" %>
<%@include file="Include.jsp"%>
<html>
<body>
<%
    PrintWriter pw= response.getWriter();
    if(session.getAttribute("Username")==null){
        pw.println("you haven't logged in");
    }
    else {
        session.removeAttribute("Username");
        session.invalidate();
        pw.println("Succesfully logged out");
    }
%>
</body>
</html>
