<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
</head>
<body>
 <div align="center">
        <h1>Employee List</h1>
        <h3>
            <a href="newUser">New User</a>
        </h3>
        <table border="1">
 
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Telephone</th>
            <th>Action</th>
 
            <c:forEach var="User" items="${listUser}">
                <tr>
 
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.address}</td>
                    <td>${user.telephone}</td>
                    <td><a href="editUser?id=${user.id}">Edit</a>
                             <a
                        href="deleteUser?id=${user.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>