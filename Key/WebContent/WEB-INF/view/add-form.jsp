<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Add Form</title>
<%-- <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" /> --%>
</head>


<style>

body {
  
  font-size: 30px;
  line-height: 20px;
  font-weight: 400;
  color: #3b3b3b;
  -webkit-font-smoothing: antialiased;
  font-smoothing: antialiased;
  background: #2b2b2b; 

}

table{
  position:absolute;
  top:50%;
  left:50%;
  transform:translate(-50%,-50%);
  color: #2980b9;
  border: 2px #55acee solid;
  background:#2b2b2b;
  padding:10px;
  font-size:25px;
  width:60%;
  height:50%;
  border-radius:5%;
  display:table;
  padding-bottom:125px;
  

}
td{
	padding:5px;
	margin:30px;
	text-align:right;
	width:30%;
}
tr{
	align:center;
}

input{
width:100%;
font-size:25px;
}


input.savebtn{
  cursor: pointer;
  border-radius: 5px;
  text-decoration: none;
  font-size: 30px;
  transition: .3s;
  -webkit-transition: .3s;
  -moz-transition: .3s;
  -o-transition: .3s;
  display: inline-block;
  color: #27ae60;
  border: 2px #27ae60 solid;
  background:#2b2b2b;
  position:absolute;
  top:83%;
  left:50%;
  transform:translate(-50%,-50%);
  width:50%;
  border-radius:50%;
  height:100px;
  width:100px;
  margin-top:20px;
}
input.savebtn:hover {
   background-color: #27ae60;
   color: #fff
}
.btnholder{
	  position:absolute;
	  top:50%;
	  left:50%;
	  transform:translate(-50%,-50%);
	  width:1000px;
	  height:1000px;
}
p#id{
	font-size:40px;
}
a{
	position:absolute;
	top:90%;
	left:50%;
	transform:translate(-50%,-50%);
	color:white;
	z-index:1;
}

</style>
<body>

<div class="btnholder">
	<p id="a">
	<a href="${pageContext.request.contextPath}/keys/list"><i>Go back</i></a>
	</p>
		<form:form action="saveRecord" modelAttribute="beetle" method="POST">
			

	<!-- need to associate this data with record id-->
	<form:hidden path="key" />
	
	
			<table>
			<tbody>	
			<td><input type="submit" value="Save" class="savebtn" /></td>
			
			    <tr>
 					<td><label>User Key:</label></td> 
				<td><form:input path="fkuserkey" /></td> 
 				</tr>
				<tr>
					<td><label>Url:</label></td>
					<td><form:input path="clurl" /></td>
				</tr>
					
				<tr>
					<td><label>User name:</label></td>
					<td><form:input path="lusername" /></td>
				</tr>
				<tr>
					<td><label>Password 1:</label></td>
					<td><form:input path="pass1" /></td>
				</tr>
				<tr>
					<td><label>Password 2:</label></td>
					<td><form:input path="pass2" /></td>
				</tr>
				<tr>
					<td><label>Category:</label></td>
					<td><form:input path="cat" /></td>
				</tr>
				<tr>
					<td><label>Llave:</label></td>
					<td><form:input path="llave" /></td>
				</tr>
				<tr>
					<td><label>Remarks:</label></td>
					<td><form:input path="remarks" /></td>
				</tr>
				<tr>
					<td><label></label></td>
					
					<td></td>
					
				</tr>

			</tbody>
					
	
	
			
	
		</table>
		
		</form:form>
	
		</div>
</body>
</html>




















