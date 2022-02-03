<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product ID</title>
</head>
<body>
<h1>Enter Product Details</h1>
<hr>
<form  action="insert">
    
    <ul>
        <li>
            <label for="name">Product Id:</label><br>
            <input type="text" name="pid" id="pid" value="" />
        </li>
        <li>
            <label for="email">Product name</label><br>
            <input type="text" name="pname" id="pname" value="" />
        </li>
        <li>
            <label for="comments">Product Price:</label><br>
            <textarea id="pprice" name="pprice" cols="25" rows="3"></textarea>
        </li>
        <li>
            <input type="submit" value="submit" />
            <input type="reset" value="reset" />
        </li>
    </ul>
</form>
</body>
</html>
