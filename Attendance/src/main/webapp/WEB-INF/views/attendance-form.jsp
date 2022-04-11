<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
                <form action="save" method="post" class="pt-2">
                    <div class="mb-3">
                        <label for="memberId" class="form-label">Member ID</label>
                        <input type="text" name="memberId" class="form-control">
                    </div>
                    <div class="mb-3">
                        <label for="date" class="form-label">Date</label>
                        <input type="date" name="attendanceDate" class="form-control">
                    </div>
                    <div class="mb-3">
                        <label for="checkinTime" class="form-label">Check-in Time</label>
                        <input type="time" name="checkinTime" class="form-control">
                    </div>
                    <div class="mb-3">
                        <label for="workoutTyep" class="form-label">Workout Type</label>
                        <input type="text" name="workoutTyep" class="form-control">
                    </div>
                    <div class="mb-3">
                        <label for="checkoutTime" class="form-label">Check-out Time</label>
                        <input type="time" name="checkoutTime" class="form-control">
                    </div>
                    <button type="submit" class="btn btn-primary float-end">Submit</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>