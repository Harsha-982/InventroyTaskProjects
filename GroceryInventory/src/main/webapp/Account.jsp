<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Include.jsp"%>
<html>
<head>
    <title>YourAccount</title>
</head>
<body>
<%
    PrintWriter pw=response.getWriter();
    if(session.getAttribute("Username")==null){
        request.getRequestDispatcher("Login.jsp").forward(request,response);
    }
%>
<%!
    private Object Username;
    private Object EmailAddress;
%><%
    Username=session.getAttribute("Username");
    EmailAddress=session.getAttribute("EmailAddress");
%>
Username : <%=Username%><br>
EmailAddress : <%=EmailAddress%>
</body>
</html>
