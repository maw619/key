<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Claves</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<style>
.holder{
/* border:none; */
}
.cell{
	max-width:30px;
}

.cell{
	max-width:70px;
}


body > div.table > div.row.header > div:nth-child(6){
	
	
}
body > div.table > div.row.header > div:nth-child(1){
	max-width:5px;
	color:green;
	word-wrap:break-word;
} 




@media screen and (max-width: 580px) {
  .table {
    display: block;
    width:100%;
  }
}


@media screen and (max-width: 480px) {
  .row {
    padding: 8px 0;
    display: block;
  }
}



@media screen and (max-width: 480px) {
  .cell {
    padding: 2px 12px;
    display: block;
  }
}


</style>
<body>


<div class="holder">
 <input type="button" value="Add" onclick="window.location.href='showFormForAdd'; return false;" class="btn"/>

<!--  <input type="button" value="Update" -->
<!-- onclick="window.location.href='showFormAdd'; return false;" class="btn2"/> -->

<!--  <input type="button" value="Delete" -->
<!-- onclick="window.location.href='showFormAdd'; return false;" class="btn3"/> -->

</div>

  <div class="table">
   
      <div class="row header" ><!-- header start -->
     	  <div class="cell" id="1">cl_key</div>
	      <div class="cell">URL </div>
	      <div class="cell">USERNAME</div>
	      <div class="cell">PASSWORD </div>
	      <div class="cell" id="6">PASS2</div>
	      <div class="cell">CATEGORIA </div>
	      <div class="cell">REMARKS</div>
	      <div class="cell">Action</div>
      </div><!-- header end -->
   
    <c:forEach var="tempClave" items="${list}"> 
		    
		     <!-- Update link with id -->
		    <c:url var="updateLink" value="/keys/showFormForUpdate">
		    <c:param name="userkey" value="${tempClave.key }" />
		    </c:url>
		    
		     <!-- delete link with id -->
		     <c:url var="deleteLink" value="/keys/delete">
		    <c:param name="userkey" value="${tempClave.key }" />
		    </c:url>
    <div class="row">
     	   <div class="cell"> ${tempClave.key }</div>
	       <div class="cell"><a href="http://${tempClave.clurl }">${tempClave.clurl }</a> </div>
	       <div class="cell"> ${tempClave.lusername }</div>
	       <div class="cell"> ${tempClave.pass1 }</div>
	       <div class="cell"> ${tempClave.pass2 } </div>
	       <div class="cell"> ${tempClave.cat } </div>
	       <div class="cell">${tempClave.remarks } </div>
	       
	       
	       <div class="cell"><a href = "${updateLink }">Update</a>
	      
	       <a href = "${deleteLink }" onclick="if (!(confirm('Are you sure you want to delete this from database?'))) return false"> | Delete</a></div>
	      
    </div>
    </c:forEach>
  </div>
</body>
</html>