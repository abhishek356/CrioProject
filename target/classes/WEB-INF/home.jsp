 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%> 

    <%@ taglib  uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<link rel = "stylesheet" href = "<c:url value ="/resources/css/style.css"/>">


   <!--   <link rel = "stylesheet" href = "style.css" >-->
    <script type="text/javascript">
    function addCustomer(){
    	window.alert("method invoked");
    	document.getElementById("AddCustomer").value = "addcustomer"
    document.forms[0].action = "addCustomer";
    document.submit();
    }
    </script>
    <script type = "text/javascript">
    function Update()
    {
    	
    	window.alert(document.getElementById("update").value);
    	var email = document.getElementById("update").value;
    	console.log(email);
    	document.forms[0].action = "updateDetails/"+email;
    	document.submit();
    }
    </script>
    
    <script type ="text/javascript">
    
    function Delete()
    {
    	
    	var email = document.getElementById("delete").value;
    	if(window.confirm(email))
    		{
    		document.forms[0].action = "deleteDetails/"+email;
    		document.submit();
    		}
    }
    </script>

    
    
    
</head>
<body>
<form method = "post">
 <div class ="heading">
    <h2 id ="myHeader">CRM - Customer Relationship Manager</h2>
    </div>
    <br>
    <input id = "AddCustomer" name = "addcustomer" value ="AddCustomer" type = "submit" onclick="addCustomer()"/>
     
     <table class="table">
  <thead>
    <tr>
      <th scope="col">S.NO</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Email</th>
      <th scopt="col">Action</th>
    </tr>
  </thead>
  <tbody>
 <c:forEach  items="${CustomerList}" var="customer" varStatus="loop">
                <tr>
                    <td><c:out value="${loop.count}" /></td>
                    <td><c:out value="${customer.getFirstName()}" /></td>
                    <td><c:out value="${customer.getLastName()}" /></td>
                    <td><c:out value="${customer.getEmail()}" /></td>
                    <td><button style="btn btn-danger" id ="update" type = "link" onclick="Update()" value="<c:out value='${customer.getEmail()}'/>">Update</button> |
                   <button style="btn btn-danger" id ="delete" type = "link" onclick="Delete()" value="<c:out value='${customer.getEmail()}'/>">Delete</button></td>
                    
                </tr>
            </c:forEach>
  </tbody>
</table>
    
    </form>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
 
</body>
</html>