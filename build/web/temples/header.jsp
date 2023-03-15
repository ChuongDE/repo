<%-- 
    Document   : header
    Created on : Feb 27, 2023, 10:00:30 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<hr>
<div id="header" class="col-md-11">

    <div class="search">
        <input class="search-input" width="80%" type="text" name=""
               id="" placeholder="Search"
               style="padding-left: 15px;">
        <div class="icon">
            <i class="fa-sharp fa-solid fa-magnifying-glass"></i>
        </div>
    </div>

    <img width="10%"
         src="./assets/IMG/thiet-ke-logo-nuoc-hoa-bee-design-02.jpg"
         alt="" class="logo">


</div>
<hr>
<div class="header col-md-11" style="margin: 0 auto;">
    <div class="hd2">
        <nav class="hd2-menu">
            <ul>
                <li><a href="home">HOME</a></li>
                <li><a href="#footer">ABOUT</a></li>
                <li>
                    <a href="#">PRODUCT<i class="fa-solid fa-chevron-down"></i></a>
                    <ul class="sub-menu">
                        <c:forEach items="${listCate}" var="o">
                            <li><a href="product?cid=${o.cateID}">${o.cateName}</a></li>
                        </c:forEach>

                    </ul>
                </li>
                <c:if test="${sessionScope.a == null}">
                    <li><a href="Login.jsp">LOGIN</a></li>
                    <li><a href="Login.jsp">SIGN UP</a></li>
                </c:if>
                    
                <c:if test="${sessionScope.a != null}">
                    <li><a href="#">HELLO ${sessionScope.a.username}</a></li>
                    <li><a href="logout">LOG OUT</a></li>
                </c:if>

            </ul>

            <ul class="hd2-cart" style="cursor: pointer;">
                <li>
                    <a href="#">
                        <i class="fa-solid fa-cart-shopping"></i>GIỎ HÀNG</a>
                    <ul class="sub-menu2" >
                        <li style="font-family: Verdana, Geneva, Tahoma, sans-serif; display: flex; margin-left: 8%;">TỔNG CỘNG</li>
                        <div class="menu22">

                            <li class="view-cart "><a href="#">XEM GIỎ HÀNG</a></li>

                            <li class="view-cart"><a href="#">THANH TOÁN</a></li>
                        </div>
                    </ul>
                </li>
            </ul>
        </nav>
    </div>
</div>
