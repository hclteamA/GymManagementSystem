<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Profile - Brand</title>
    <link rel="stylesheet" href="<c:url value="resources/assets/bootstrap/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/fontawesome-all.min.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/font-awesome.min.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/fonts/fontawesome5-overrides.min.css"/>">
</head>

<body id="page-top">
    <div id="wrapper">
        <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
            <div class="container-fluid d-flex flex-column p-0"><a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                    <div class="sidebar-brand-icon rotate-n-15"><i class="fas fa-dumbbell"></i></div>
                    <div class="sidebar-brand-text mx-3"><span>The GYM</span></div>
                </a>
                <hr class="sidebar-divider my-0">
                <ul class="navbar-nav text-light" id="accordionSidebar">
                    <li class="nav-item"><a class="nav-link" href="index"><i class="fas fa-tachometer-alt"></i><span>Dashboard</span></a></li>
                   
                    <li class="nav-item"><a class="nav-link" href="profile"><i class="fas fa-user"></i><span>Register</span></a></li>
                    <li class="nav-item"></li>
                    <li class="nav-item"></li>
                    <li class="nav-item"><a class="nav-link" href="register"><i class="fas fa-user-circle"></i><span>Register</span></a></li>
                    <li class="nav-item"></li>
                    <li class="nav-item"></li>
                    <li class="nav-item"><a class="nav-link active" href="pos"><i class="far fa-money-bill-alt"></i><span>Payment</span></a></li>
                </ul>
                <div class="text-center d-none d-md-inline"><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button></div>
            </div>
        </nav>
        <div class="d-flex flex-column" id="content-wrapper">
            <div id="content">
                <nav class="navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top">
                    <div class="container-fluid"><button class="btn btn-link d-md-none rounded-circle me-3" id="sidebarToggleTop" type="button"><i class="fas fa-bars"></i></button>
                        <form class="d-none d-sm-inline-block me-auto ms-md-3 my-2 my-md-0 mw-100 navbar-search">
                            <div class="input-group"></div>
                        </form>
                        <ul class="navbar-nav flex-nowrap ms-auto">
                            <li class="nav-item dropdown d-sm-none no-arrow"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#"><i class="fas fa-search"></i></a>
                                <div class="dropdown-menu dropdown-menu-end p-3 animated--grow-in" aria-labelledby="searchDropdown">
                                    <form class="me-auto navbar-search w-100">
                                        <div class="input-group"><input class="bg-light form-control border-0 small" type="text" placeholder="Search for ...">
                                            <div class="input-group-append"><button class="btn btn-primary py-0" type="button"><i class="fas fa-search"></i></button></div>
                                        </div>
                                    </form>
                                </div>
                            </li>
                            <li class="nav-item dropdown no-arrow mx-1">
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#"></a>
                                    <div class="dropdown-menu dropdown-menu-end dropdown-list animated--grow-in">
                                        <h6 class="dropdown-header">alerts center</h6><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="me-3">
                                                <div class="bg-primary icon-circle"><i class="fas fa-file-alt text-white"></i></div>
                                            </div>
                                            <div><span class="small text-gray-500">December 12, 2019</span>
                                                <p>A new monthly report is ready to download!</p>
                                            </div>
                                        </a><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="me-3">
                                                <div class="bg-success icon-circle"><i class="fas fa-donate text-white"></i></div>
                                            </div>
                                            <div><span class="small text-gray-500">December 7, 2019</span>
                                                <p>$290.29 has been deposited into your account!</p>
                                            </div>
                                        </a><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="me-3">
                                                <div class="bg-warning icon-circle"><i class="fas fa-exclamation-triangle text-white"></i></div>
                                            </div>
                                            <div><span class="small text-gray-500">December 2, 2019</span>
                                                <p>Spending Alert: We've noticed unusually high spending for your account.</p>
                                            </div>
                                        </a><a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>
                                    </div>
                                </div>
                            </li>
                            <li class="nav-item dropdown no-arrow mx-1">
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#"></a>
                                    <div class="dropdown-menu dropdown-menu-end dropdown-list animated--grow-in">
                                        <h6 class="dropdown-header">alerts center</h6><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="dropdown-list-image me-3"><img class="rounded-circle" src="assets/img/avatars/avatar4.jpeg">
                                                <div class="bg-success status-indicator"></div>
                                            </div>
                                            <div class="fw-bold">
                                                <div class="text-truncate"><span>Hi there! I am wondering if you can help me with a problem I've been having.</span></div>
                                                <p class="small text-gray-500 mb-0">Emily Fowler - 58m</p>
                                            </div>
                                        </a><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="dropdown-list-image me-3"><img class="rounded-circle" src="assets/img/avatars/avatar2.jpeg">
                                                <div class="status-indicator"></div>
                                            </div>
                                            <div class="fw-bold">
                                                <div class="text-truncate"><span>I have the photos that you ordered last month!</span></div>
                                                <p class="small text-gray-500 mb-0">Jae Chun - 1d</p>
                                            </div>
                                        </a><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="dropdown-list-image me-3"><img class="rounded-circle" src="assets/img/avatars/avatar3.jpeg">
                                                <div class="bg-warning status-indicator"></div>
                                            </div>
                                            <div class="fw-bold">
                                                <div class="text-truncate"><span>Last month's report looks great, I am very happy with the progress so far, keep up the good work!</span></div>
                                                <p class="small text-gray-500 mb-0">Morgan Alvarez - 2d</p>
                                            </div>
                                        </a><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="dropdown-list-image me-3"><img class="rounded-circle" src="assets/img/avatars/avatar5.jpeg">
                                                <div class="bg-success status-indicator"></div>
                                            </div>
                                            <div class="fw-bold">
                                                <div class="text-truncate"><span>Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</span></div>
                                                <p class="small text-gray-500 mb-0">Chicken the Dog � 2w</p>
                                            </div>
                                        </a><a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>
                                    </div>
                                </div>
                                <div class="shadow dropdown-list dropdown-menu dropdown-menu-end" aria-labelledby="alertsDropdown"></div>
                            </li>
                            <div class="d-none d-sm-block topbar-divider"></div>
                            <li class="nav-item dropdown no-arrow">
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#"><span class="d-none d-lg-inline me-2 text-gray-600 small">Trainer</span><img class="border rounded-circle img-profile" src="assets/img/avatars/user.png"></a>
                                    <div class="dropdown-menu shadow dropdown-menu-end animated--grow-in"><a class="dropdown-item" href="#"><i class="fas fa-user fa-sm fa-fw me-2 text-gray-400"></i>&nbsp;Profile</a><a class="dropdown-item" href="#"><i class="fas fa-cogs fa-sm fa-fw me-2 text-gray-400"></i>&nbsp;Settings</a><a class="dropdown-item" href="#"><i class="fas fa-list fa-sm fa-fw me-2 text-gray-400"></i>&nbsp;Activity log</a>
                                        <div class="dropdown-divider"></div><a class="dropdown-item" href="#"><i class="fas fa-sign-out-alt fa-sm fa-fw me-2 text-gray-400"></i>&nbsp;Logout</a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
                <div class="container-fluid">
                    <h3 class="text-dark mb-4">Payment</h3>
                    <div class="row mb-3">
                        <div class="col-lg-8 align-items-center">
                            <div class="row mb-3 d-none">
                                <div class="col">
                                    <div class="card textwhite bg-primary text-white shadow">
                                        <div class="card-body">
                                            <div class="row mb-2">
                                                <div class="col">
                                                    <p class="m-0">Peformance</p>
                                                    <p class="m-0"><strong>65.2%</strong></p>
                                                </div>
                                                <div class="col-auto"><i class="fas fa-rocket fa-2x"></i></div>
                                            </div>
                                            <p class="text-white-50 small m-0"><i class="fas fa-arrow-up"></i>&nbsp;5% since last month</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="card textwhite bg-success text-white shadow">
                                        <div class="card-body">
                                            <div class="row mb-2">
                                                <div class="col">
                                                    <p class="m-0">Peformance</p>
                                                    <p class="m-0"><strong>65.2%</strong></p>
                                                </div>
                                                <div class="col-auto"><i class="fas fa-rocket fa-2x"></i></div>
                                            </div>
                                            <p class="text-white-50 small m-0"><i class="fas fa-arrow-up"></i>&nbsp;5% since last month</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <div class="card shadow mb-3">
                                        <div class="card-header d-flex flex-column flex-shrink-1 py-3">
                                            <p class="text-primary m-0 fw-bold">Invoice Number :&nbsp;&nbsp;</p><label class="form-label">Label</label>
                                            <p class="text-primary m-0 fw-bold">&nbsp; &nbsp;Membership Status :&nbsp;&nbsp;</p><label class="form-label">Label</label>
                                            <p class="text-primary m-0 fw-bold">&nbsp; Member Status :&nbsp;&nbsp;</p><label class="form-label">Label</label>
                                        </div>
                                        <div class="card-body">
                                            <form>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="username" ><strong>Member ID</strong></label><input class="form-control" type="text" id="mID" placeholder="Member ID" name="mid"><label id ="mIDL"  for="username"><br></label></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="email"><br></label><input class="form-control" type="email" id="email-1" name="name"></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="username"><strong>Status</strong></label><input class="form-control" type="text" id="username-1" name="st"></div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="username"><strong>New Member</strong></label><select class="form-select">
                                                                <optgroup label="This is a group"></optgroup>
                                                            </select></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="email"><strong>Due Date</strong></label><input class="form-control" type="email" id="email" name="duedate"></div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="first_name"><strong>Package</strong></label><input class="form-control" type="text" id="first_name" name="package"></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="last_name"><strong>Price</strong></label><input class="form-control" type="text" id="last_name" name="price"></div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="first_name"><strong>Discount</strong></label><input class="form-control" type="text" id="first_name-1" name="package"></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"></div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="first_name"><strong>Total</strong></label><input class="form-control" type="text" id="first_name-2" name="package"></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"></div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3">
                                                            <div class="table-responsive">
                                                                <table class="table">
                                                                    <thead>
                                                                        <tr>
                                                                            <th>Workout Type</th>
                                                                            <th>Price</th>
                                                                            <th>Discount</th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody>
                                                                        <tr></tr>
                                                                        <tr></tr>
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="first_name"><strong>Net Total</strong></label><input class="form-control" type="text" id="net" name="package"></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"></div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="first_name"><strong>Payment</strong><br></label><input class="form-control" type="text" id="pay" name="package"></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"></div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="first_name"><strong>Balance</strong></label><input class="form-control" type="text" id="balance" name="package"></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"></div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="first_name"><strong>Due Amount</strong></label><input class="form-control" type="text" id="due" name="package"></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"></div>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                    <div class="card shadow"></div>
                                </div>
                            </div>
                        </div>
                        <div class="col" style="background: linear-gradient(var(--bs-blue) 0%, white), var(--bs-blue);">
                            <div class="row">
                                <div class="col">
                                    <div class="mb-3" style="margin: 10px;"><label class="form-label" for="username" style="color: rgb(10,10,10);"><strong>Name&nbsp;</strong></label><input type="text" id="searchName" name="name" style="background: var(--bs-blue);"><label id="nameLabel" for="username"><br></label></div>
                                </div>
                            </div>
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th style="color: rgb(10,10,10);">Name</th>
                                            <th style="color: rgb(10,10,10);">M ID</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr></tr>
                                        <tr></tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <footer class="bg-white sticky-footer" style="height: 10px;">
                <div class="container my-auto">
                    <div class="text-center my-auto copyright"><span>Copyright � hs 2022</span></div>
                </div>
            </footer>
        </div><a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a>
    </div>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/theme.js"></script>
    <script>
        
        var input = document.getElementById("mID");
        var search = document.getElementById("searchName");
        var net = document.getElementById("net");
        var pay = document.getElementById("pay");
        var bal = document.getElementById("balance"); 
        var due = document.getElementById("due");
   

// Execute a function when the user releases a key on the keyboard
input.addEventListener("keyup", function(event) {
   
  // Number 13 is the "Enter" key on the keyboard
  if (event.keyCode === 13) {
  
    // Cancel the default action, if needed
    let pw= document.getElementById("mID").value;
    event.preventDefault();
    // Trigger the button element with a click
    if(pw.trim()==""){
        
        document.getElementById("mIDL").style.visibility = "visible";
        document.getElementById("mIDL").innerText = 'Empty Field not allowed'; 
        document.getElementById("mIDL").style.color = "red";


   }else if(pw.match(/^[0-9]+$/) == null)
    {document.getElementById("mIDL").style.visibility = "visible";
        document.getElementById("mIDL").innerText = 'Only Numbers allowed!'; 
        document.getElementById("mIDL").style.color = "red";
       
    }
    else{
        document.getElementById("mIDL").innerText = ''; 
    }
  }
});

net.addEventListener("keyup", function(event) {
  // Number 13 is the "Enter" key on the keyboard
  if (event.keyCode === 13) {
    // Cancel the default action, if needed
    let pw= document.getElementById("net").value;
    event.preventDefault();
    // Trigger the button element with a click
    if(pw.trim()==""){
alert("No blank allowed!");

   }else if(pw.match(/^[0-9]+$/) == null)
    {
        document.getElementById("net").style.color="red"; 
        alert("Only Number allowed!");
    }
  }
});

pay.addEventListener("keyup", function(event) {
  // Number 13 is the "Enter" key on the keyboard
  if (event.keyCode === 13) {
    // Cancel the default action, if needed
    let pw= document.getElementById("pay").value;
    event.preventDefault();
    // Trigger the button element with a click
    if(pw.trim()==""){
alert("No blank allowed!");

   }else if(pw.match(/^[0-9]+$/) == null)
    {
        document.getElementById("pay").style.color="red"; 
        alert("Only Number allowed!");
    }
  }
});

bal.addEventListener("keyup", function(event) {
  // Number 13 is the "Enter" key on the keyboard
  if (event.keyCode === 13) {
    // Cancel the default action, if needed
    let pw= document.getElementById("bal").value;
    event.preventDefault();
    // Trigger the button element with a click
    if(pw.trim()==""){
alert("No blank allowed!");

   }else if(pw.match(/^[0-9]+$/) == null)
    {
        document.getElementById("bal").style.color="red"; 
        alert("Only Number allowed!");
    }
  }
});

due.addEventListener("keyup", function(event) {
  // Number 13 is the "Enter" key on the keyboard
  if (event.keyCode === 13) {
    // Cancel the default action, if needed
    let pw= document.getElementById("due").value;
    event.preventDefault();
    // Trigger the button element with a click
    if(pw.trim()==""){
alert("No blank allowed!");

   }else if(pw.match(/^[0-9]+$/) == null)
    {
        document.getElementById("due").style.color="red"; 
        alert("Only Number allowed!");
    }
  }
});

search.addEventListener("keyup", function(event) {
  // Number 13 is the "Enter" key on the keyboard
  let na= document.getElementById("searchName").value;
  if(na.trim()!=""){
    var matches = na.match(/\d+/g);
if (matches != null) {
    
    document.getElementById("nameLabel").style.visibility = "visible";
        document.getElementById("nameLabel").innerText = 'Enter Valid Name'; 
        document.getElementById("nameLabel").style.color = "red";
    document.getElementById("searchName").value="";
}else{
    document.getElementById("nameLabel").innerText = ''; 
}
   
  }
 
//   if (event.keyCode === 13) {
//     // Cancel the default action, if needed
//     let pw= document.getElementById("mID").value;
//     event.preventDefault();
//     // Trigger the button element with a click
//     if(pw.trim()==""){
// alert("No blank allowed!");

//    }else if(pw.match(/^[0-9]+$/) == null)
//     {
//         alert("Only Number allowed!");
//     }
//   }
});
    </script>
</body>

</html>