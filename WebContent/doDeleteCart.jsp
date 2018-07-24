<%@ page language="java" import="dao.*,entity.*,java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String id=request.getParameter("id");
HashMap map =(HashMap)session.getAttribute("cart");

map.remove(id);
session.setAttribute("cart", map);

response.sendRedirect("cart.jsp");
%>