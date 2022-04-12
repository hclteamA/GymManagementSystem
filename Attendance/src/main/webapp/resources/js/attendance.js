function validateAttendance() {
	let memberId = document.forms["attendanceFrom"]["memberId"].value;
	let date = document.forms["attendanceFrom"]["date"].value;
	let checkinTime = document.forms["attendanceFrom"]["checkinTime"].value;
	let workoutType = document.forms["attendanceFrom"]["workoutType"].value;
	let checkoutTime = document.forms["attendanceFrom"]["checkoutTime"].value;
	
	let errorMessage = document.getElementById("errorMemberId");
	let errorDate = document.getElementById("errorDate");
	let errorCheckin = document.getElementById("errorCheckin");
	let errorWorkout = document.getElementById("errorWorkout");
	let errorCheckout = document.getElementById("errorCheckout");
	
	let numbers = /^[0-9]+$/;
	
	if(memberId == "") {
		errorMessage.innerHTML = 'Member ID is required.';
        return false;
    }
	if(!memberId.match(numbers)) {
		errorMessage.innerHTML = 'Enter the member ID in the correct format.';
        return false;
    }
	if(date == "") {
		errorDate.innerHTML = 'Date is required.';
        return false;
    }
	if(checkinTime == "") {
		errorCheckin.innerHTML = 'Check-in Time is required.';
        return false;
    }
	if(workoutType == "") {
		errorWorkout.innerHTML = 'Workout Type is required.';
        return false;
    }
	if(checkoutTime == "") {
		errorCheckout.innerHTML = 'Check-in Time is required.';
        return false;
    }

}