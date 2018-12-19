<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <title>Test Read Data</title>
</head>
<body>
<div class="container">
    <h2>User</h2>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th class="col-md-1">no</th>
            <th class="col-md-7">id</th>
            <th class="col-md-2">name</th>
        </tr>
        </thead>
        <tbody>
            <tr>
                <td>${user.userNo}</td>
                <td><a href="#">${user.id}</a></td>
                <td>${user.name}</td>
            </tr>
        </tbody>
    </table>
</div>
</body>
</html>
