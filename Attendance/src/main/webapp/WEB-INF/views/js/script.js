function validateAttendance() {

    let memberId = document.forms["attendanceFrom"]["memberId"].value;
    let date = document.forms["attendanceFrom"]["date"].value;
    let checkinTime = document.forms["attendanceFrom"]["checkinTime"].value;
    let workoutType = document.forms["attendanceFrom"]["workoutType"].value;
    let checkoutTime = document.forms["attendanceFrom"]["checkoutTime"].value;

    let errorMessage = document.getElementById("errorMemberId");
    let errorMessageDate = document.getElementById("errorDate");
    let errorMessageCheckin = document.getElementById("error-checkin-time");

    let numbers = /^[0-9]+$/;

    if(memberId == "") {
        errorMessage.style.visibility = "visible";
        return false;
    }

    if(!memberId.match(numbers)) {
        errorMessage.style.visibility = "visible";
        return false;
    }

    if(date == "") {
        errorMessageDate.style.visibility = "visible";
        return false;
    }

    if(checkinTime == "") {
        errorCheckinTime.style.visibility = "visible";
        return false;
    }

}