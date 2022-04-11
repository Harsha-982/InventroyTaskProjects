
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:useBean id="AddressDetails" class="com.example.GroceryInventory.Address" scope="application"/>
<jsp:useBean id="CardDetails" class="com.example.GroceryInventory.CardDetails" scope="application"/>
<jsp:setProperty name="AddressDetails" property="*"></jsp:setProperty>
<jsp:setProperty name="CardDetails" property="*"></jsp:setProperty>

<body>
<h3>Delivery Address</h3>
<jsp:getProperty property="name"  name="AddressDetails"/><br>
<jsp:getProperty property="d_no" name="AddressDetails"/><br>
<jsp:getProperty property="home_Town" name="AddressDetails" /><br>
<jsp:getProperty property="street" name="AddressDetails"/><br>

<h3>CardDetails</h3>
<jsp:getProperty name="CardDetails" property="cardHolderName"/><br>
<jsp:getProperty name="CardDetails" property="cardNumber"/><br>
</body>
</html>



