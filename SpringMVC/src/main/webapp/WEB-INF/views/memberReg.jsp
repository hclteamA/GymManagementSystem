<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
     <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
    <title>Member Registration</title>
    <link rel="stylesheet" href="<c:url value="resources/assets/bootstrap/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/fontawesome-all.min.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/font-awesome.min.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/fontawesome5-overrides.min.css"/>">
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
                    <li class="nav-item"><a class="nav-link active" href="memberReg"><i class="fas fa-user"></i><span>Member Registration</span></a></li>
                    <li class="nav-item"></li>
                    <li class="nav-item"></li>
                    <li class="nav-item"><a class="nav-link" href="admin"><i class="fas fa-user-circle"></i><span>Admin</span></a></li>
                    <li class="nav-item"></li>
                    <li class="nav-item"></li>
                    <li class="nav-item"><a class="nav-link" href="pos"><i class="far fa-money-bill-alt"></i><span>Payment</span></a></li>
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
                                            <div class="dropdown-list-image me-3"><img class="rounded-circle" src="resources/assets/img/avatars/avatar4.jpeg">
                                                <div class="bg-success status-indicator"></div>
                                            </div>
                                            <div class="fw-bold">
                                                <div class="text-truncate"><span>Hi there! I am wondering if you can help me with a problem I've been having.</span></div>
                                                <p class="small text-gray-500 mb-0">Emily Fowler - 58m</p>
                                            </div>
                                        </a><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="dropdown-list-image me-3"><img class="rounded-circle" src="resources/assets/img/avatars/avatar2.jpeg">
                                                <div class="status-indicator"></div>
                                            </div>
                                            <div class="fw-bold">
                                                <div class="text-truncate"><span>I have the photos that you ordered last month!</span></div>
                                                <p class="small text-gray-500 mb-0">Jae Chun - 1d</p>
                                            </div>
                                        </a><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="dropdown-list-image me-3"><img class="rounded-circle" src="resources/assets/img/avatars/avatar3.jpeg">
                                                <div class="bg-warning status-indicator"></div>
                                            </div>
                                            <div class="fw-bold">
                                                <div class="text-truncate"><span>Last month's report looks great, I am very happy with the progress so far, keep up the good work!</span></div>
                                                <p class="small text-gray-500 mb-0">Morgan Alvarez - 2d</p>
                                            </div>
                                        </a><a class="dropdown-item d-flex align-items-center" href="#">
                                            <div class="dropdown-list-image me-3"><img class="rounded-circle" src="resources/assets/img/avatars/avatar5.jpeg">
                                                <div class="bg-success status-indicator"></div>
                                            </div>
                                            <div class="fw-bold">
                                                <div class="text-truncate"><span>Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</span></div>
                                                <p class="small text-gray-500 mb-0">Chicken the Dog ? 2w</p>
                                            </div>
                                        </a><a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>
                                    </div>
                                </div>
                                <div class="shadow dropdown-list dropdown-menu dropdown-menu-end" aria-labelledby="alertsDropdown"></div>
                            </li>
                            <div class="d-none d-sm-block topbar-divider"></div>
                            <li class="nav-item dropdown no-arrow">
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#"><span class="d-none d-lg-inline me-2 text-gray-600 small">Trainer</span><img class="border rounded-circle img-profile" src="resources/assets/img/avatars/user.png"></a>
                                    <div class="dropdown-menu shadow dropdown-menu-end animated--grow-in"><a class="dropdown-item" href="#"><i class="fas fa-user fa-sm fa-fw me-2 text-gray-400"></i>&nbsp;Profile</a><a class="dropdown-item" href="#"><i class="fas fa-cogs fa-sm fa-fw me-2 text-gray-400"></i>&nbsp;Settings</a><a class="dropdown-item" href="#"><i class="fas fa-list fa-sm fa-fw me-2 text-gray-400"></i>&nbsp;Activity log</a>
                                        <div class="dropdown-divider"></div><a class="dropdown-item" href="#"><i class="fas fa-sign-out-alt fa-sm fa-fw me-2 text-gray-400"></i>&nbsp;Logout</a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
                <div class="container-fluid">
                    <h3 class="text-dark mb-4">User Registration</h3>
                    <div class="row mb-3">
                        <!-- <div class="col-lg-4"> 
                            <div class="card mb-3">
                                <div class="card-body text-center shadow"><img class="rounded-circle mb-3 mt-4" src="assets/img/dogs/user.png" width="160" height="160">
                                    <div class="mb-3"><button class="btn btn-primary btn-sm" type="button">Change Photo</button></div>
                                </div>
                            </div>
                        </div> -->
                        <div class="col-lg-8">
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
                                        <div class="card-header py-3">
                                            <p class="text-primary m-0 fw-bold">User Settings</p>
                                        </div>
                                        <div class="card-body">
                                            <form  name="Form" onsubmit="return validateForm()" action="processForm" method="post" >
                                                <div class="row">
                                                    <div class="col">
                                                        <!-- <div class="mb-3"><label class="form-label" for="username"><strong>Member ID</strong></label>
                                                            <div class="d-flex"><input class="form-control" type="text" id="username-1" placeholder="Member ID" name="id"><button class="btn btn-primary" type="button">Generate</button></div>
                                                        </div> -->
                                                    </div>
                                                </div>
                                                <div class="row">
                                                <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="mId"><strong>Member ID</strong></label><input class="form-control" type="text" id="mId" placeholder="Member ID" name="mId" title='Please Enter Valid ID' required value="${cid}"></div>
                                                        
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" ><strong>First Name</strong></label><input class="form-control" type="text" id="fname" placeholder="First Name" name="fname" pattern="^[A-Za-z\s]+$" title='Please Enter Valid Name' required></div>
                                                        <div class="col-sm-6 "><label class="col-form-label" id="fname"></label></div>
                                                        
                                                   
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="lname"><strong>Last Name</strong></label><input class="form-control" type="text" id="lname" placeholder="Last Name" name="lname" pattern="^[A-Za-z\s]+$" title='Please Enter Valid Name' required></div>
                                                        
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="mobile"><strong>Mobile Number</strong></label><input class="form-control" type="text" id="mobile" placeholder="Mobile" name="mobile" pattern='^\d{10}$' title='Phone Number (Format: 999(99)99999)'required></div>
                                                        <!-- <div class="error" id="mobileErr"></div> -->
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="email"><strong>Email</strong></label><input class="form-control" type="email" id="email" placeholder="example@mail.com" name="email" required></div>
                                                        <!-- <div class="error" id="emailErr"></div> -->
                                                    </div>
                                                </div>
                                                 <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3">
                                                        <!--  <label class="form-label" for="dob"><strong>Date of Birth</strong></label><input class="form-control" type="date" id="dob" name="dob" required>-->
                                                              <div class="row">
                                                                <div class="col">
                                                                    <div class="mb-3"><label class="form-label" for="gender"><strong>Gender</strong></label>
                                                                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-2" name="gender" value="male" checked><label class="form-check-label" for="formCheck-2">Male</label></div>
                                                                        <div class="form-check"><input class="form-check-input" type="radio" id="formCheck-1" name="gender"value="female"><label class="form-check-label" for="formCheck-1">Female</label></div>
                                                                        <div class="error" id="genderErr"></div> 
                                                                      </div>
                                                                 </div>
                                                           </div>
                                                        </div>
                                                     </div>
                                                 </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="address"><strong>Address</strong></label><textarea class="form-control" name="address" placeholder="address" id="address" required></textarea></div>
                                                        <!-- <div class="error" id="addressErr"></div> -->
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="embp" style="font-size: 12px;"><strong>Emergency Contact Person Name</strong></label><input class="form-control" type="text" id="embp" placeholder="Emergency Person" name="embp" pattern="^[A-Za-z\s]+$" title='Please Enter Valid Name' required></div>
                                                        <div class="error" id="embpErr"></div>
                                                    </div>
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="embpm" style="font-size: 12px;"><strong>Emergency Contact Person Mobile</strong></label><input class="form-control" type="text" id="embpm" placeholder="Emergency Person Mobile" name="embpm" pattern='^\d{10}$' title='Phone Number (Format: 099(99)99999)'required></div>
                                                        <!-- <div class="error" id="embpmErr"></div> -->
                                                    </div>
                                                </div>
                                                 <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="pack" aria-required="true"><strong>Package</strong></label><select class="form-select" id="pack" name="pack">
                                                               <option value="Weight" selected>Weight</option>
                                                               <option value="Weight & Cardio">Weight & Cardio</option>
                                                               <option value="03 Months Weight">03 Months Weight</option>
                                                                <option value="03 Months Weigh&Cardio">03 Months Weigh&Cardio</option>
                                                                 <option value="06 Months Weight">06 Months Weight</option>
                                                                  <option value="06 Months Weigh&Cardio">06 Months Weigh&Cardio</option>
                                                                   <option value="12 Months Weight">12 Months Weight</option>
                                                                    <option value="12 Months Weigh&Cardio">12 Months Weigh&Cardio</option>
                                                                     <option value="Zumba">Zumba</option>
                                                            </select></div>
                                                            <div class="error" id="packageErr"></div> 
                                                        </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <div class="mb-3"><label class="form-label" for="medical"><strong>Medical Condition</strong></label><textarea class="form-control" name="medical" placeholder="Medical Condition" id="medical" required></textarea></div>
                                                        <!-- <div class="error" id="medicalErr"></div>  -->
                                                    </div>
                                                </div>
                                                <div class="mb-3"><button class="btn btn-primary btn-sm" id="submit" type="submit">Save</button></div>



                                            </form>
                                        </div>
                                    </div>
                                 <!--     <div class="card shadow">
                                        <div class="card-header py-3">
                                            <p class="text-primary m-0 fw-bold">Update Member Details</p>
                                        </div> -->
                                       <!--   <div class="card-body">
                                            <form>
                                                <div class="mb-3"><label class="form-label" for="address"><strong>Member ID</strong></label><input class="form-control" type="text" id="address" placeholder="Member ID" name="memberid"></div>
                                                <div class="mb-3"><button class="btn btn-primary btn-sm" type="submit">Update</button></div>
                                            </form>
                                        </div> -->
                                     <!-- </div> -->
                                </div>
                            </div>
                        </div>
                    </div>
                 <!--    <div class="card shadow mb-5">
                        <div class="card-header py-3">
                            <p class="text-primary m-0 fw-bold">Member&nbsp;</p>
                            <p class="text-primary m-0 fw-bold">Member Registered : 300</p> -->
                    <!--  </div> -->    
             <!--             <div class="card-body">
                            <div class="row">
                                <div class="col">
                                    <form>
                                        <div class="mb-3"><label class="form-label" for="address"><strong>Member ID</strong></label><input class="form-control" type="text" id="address-1" placeholder="Member ID" name="memberid"></div>
                                        <div class="mb-3"></div>
                                        <div class="mb-3"><button class="btn btn-primary btn-sm" type="submit">Load&nbsp; Data</button></div>
                                        <div class="mb-3">
                                            <div class="table-responsive">
                                                <table class="table">
                                                    <thead>
                                                        <tr>
                                                            <th>Member ID</th>
                                                            <th>Name</th>
                                                            <th>Gender</th>
                                                            <th>DOB</th>
                                                            <th>Address</th>
                                                            <th>Telephone</th>
                                                            <th>Mobile</th>
                                                            <th>Package</th>
                                                            <th>Emg. C</th>
                                                            <th>Emg. M</th>
                                                            <th>Medical</th>
                                                            <th>Status</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody></tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>   -->
                
                </div>
            </div>
            <footer class="bg-white sticky-footer" style="height: 10px;">
                <div class="container my-auto">
                    <div class="text-center my-auto copyright"><span>Copyright ? hs 2022</span></div>
                </div>
            </footer>
        </div><a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a>
    </div>

	<script type="text/javascript">
  function validateForm() {
    var mId = document.forms["Form"]["mId"].value;
    var fname = document.forms["Form"]["fname"].value;
    var lname = document.forms["Form"]["lname"].value;
    var mobile = document.forms["Form"]["mobile"].value;
    var email = document.forms["Form"]["email"].value;
    var gender = document.forms["Form"]["gender"].value;
    var address = document.forms["Form"]["address"].value;
    var embp = document.forms["Form"]["embp"].value;
    var embpm = document.forms["Form"]["embpm"].value;
    var pack = document.forms["Form"]["pack"].value;
    var medical = document.forms["Form"]["medical"].value;
    
    
    
    
    if (mId == null || mId == "", fname == null || fname == "", lname == null || lname == "", mobile == null || mobile == "", email == null || email == "", gender == null || gender == "", address == null || address == "", embp == null || embp == "", embpm == null || embpm == "", pack == null || pack == "", medical == null || medical == "") {
      alert("Please Fill All Required Field");
      return false;
      
    }else
    alert("Record successfully insert");
    return true;
  }
</script>
	
	
    
    <script src="resources/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="resources/assets/js/theme.js"></script>
    <!-- <script src="assets/js/rgform.js"></script> -->
     <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    
</body>

</html>