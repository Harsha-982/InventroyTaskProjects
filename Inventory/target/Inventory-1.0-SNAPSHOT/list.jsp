<%@include file="include.html"%>
<html>
<body>
<%
    if(session.getAttribute("name")==null){
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }
%>
<fieldset>
    <legend>Inventory Mangement</legend>
    Click on Cost to find product cost
    <a href="Cost.jsp" target="_blank" ><button> Cost</button></a>
    <br><br>
    Click on Products to get list of products
    <a href="Products.jsp" target="_blank"><button>Products</button></a>
    <br><br>
    Click on Inventory to see stock details
    <a href="Inventory.jsp" target="_blank"><button>Inventory</button></a>
    <br><br>

</fieldset>
</body>
</html>