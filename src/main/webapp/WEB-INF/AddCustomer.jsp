<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    
    
    
    
    
    
    
    
    <!Doctype html>
    <html>
    
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    </head>
    <body>

<div class="container">
  <h2>Enter Customer Details</h2>
  
  <form action ="saveDetails" method = "post" >
    <div class="form-group">
      <label for="firstname">FirstName:</label>
      <input type="text" name = "firstName"class="form-control" id="firstname">
    </div>
    
        <div class="form-group">
      <label for="lastname">LastName:</label>
      <input type="text" name = "lastName" class="form-control" id="lastname">
    </div>
    
    <div class="form-group">
      <label for="email">email:</label>
      <input type="email" name = "email" class="form-control" id="email">
    </div>
  <input type="submit" class="btn btn-primary" value = "Submit"/>
</form>
</div>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>