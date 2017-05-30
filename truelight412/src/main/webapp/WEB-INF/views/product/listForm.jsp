<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    
    
  <div class="container">    
  <div class="row">
   <c:forEach var="productList" items="${productList }">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">${productList.pro_Name}</div> 
        <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
      </div>
    </div>
    </c:forEach>
  </div>
  
</div>

 
    

    
  