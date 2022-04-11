<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Attendance</title>
</head>
<body>
    <div id="title-div" class="fs-4 ps-3 fw-bold" style="letter-spacing: 2px;">
        ATTENDANCE
    </div>

    <div class="container-fluid mt-3 border-top">
        <div class="row">
            <div class="col-md-3 pe-4 border-end bg-primary">
                <div class="fs-5 mt-3">
                    <a href="attendance" class="link-light">Mark Attendance</a>
                </div>
                <div class="fs-5 mt-3">
                    <a href="list-attendance" class="link-light">Attendance List</a>
                </div>
                <div style="height: 600px;">

                </div>
            </div>
            <div class="col-md-9">
                <table class="table border">
                    <thead class="table-primary">
                        <tr>
                            <th scope="col">Member ID</th>
                            <th scope="col">Attendance Date</th>
                            <th scope="col">Check-in Time</th>
                            <th scope="col">Work-out Type</th>
                            <th scope="col">Check-out Time</th>
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach items="${list}" var="a">
	                        <tr>
	                            <td>${a.attendanceDate}</td>
	                            <td>${a.attendanceDate}</td>
	                            <td>${a.checkinTime}</td>
	                            <td>${a.workoutTime}</td>
	                            <td>${a.checkoutTime}</td>
	                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>