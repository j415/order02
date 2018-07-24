<%@ page language="java" import="dao.*,entity.*,java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
//1.获得购物车Map
HashMap map=(HashMap)session.getAttribute("cart");
//2.判断购物车Map是否存在，不存在创建
if(map==null){
	map=new HashMap();
}
//3.把产品添加到购物车
	String id =(request.getParameter("id"));
	ProductDaoImp dao=new ProductDaoImp();
	Product p=dao.findById(Integer.parseInt(id));
	//3.2判断Map中是否有此商品
	CartItem cartItem=(CartItem)map.get(id);
	if (cartItem!=null){
		//>有-->  把数量+1
		cartItem.setSum(cartItem.getSum()+1);
	}else{
		//>无-->  把商品放入购物车 数量为1
		cartItem=new CartItem();
		cartItem.setP(p);
		cartItem.setSum(1);
	}
	//3.3产品加入集合
	map.put(id,cartItem); //id:15112 15113
	//out.print(map.size()+" "+map.keySet());
//4.把集合存储到session作用域
session.setAttribute("cart", map);
response.sendRedirect("cart.jsp");
%>