<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Login - Brand</title>
    <link rel="stylesheet" href="<c:url value="resources/assets/bootstrap/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/fontawesome-all.min.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/font-awesome.min.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/fontawesome5-overrides.min.css"/>">
</head>

<body class="bg-gradient-primary">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-9 col-lg-12 col-xl-10">
                <div class="card shadow-lg o-hidden border-0 my-5">
                    <div class="card-body p-0">
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-flex">
                                <div class="flex-grow-1 bg-login-image" style="background: url(&quot;resources/assets/img/dogs/gy.jpg&quot;);"></div>
                            </div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h4 class="text-dark mb-4">Welcome Back!</h4>
                                    </div>
                                    <form class="user" onsubmit="return validate()" action="usercheck" method="post">
                                        <div class="mb-3"><input class="form-control form-control-user" type="text" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Enter Email Address..." name="email"><label id="e" class="form-label ">${msg1}</label></div>
                                        <div class="mb-3"><input class="form-control form-control-user" type="password" id="exampleInputPassword" placeholder="Password" name="password"><label id="p" class="form-label ">${msg2}</label></div>
                                       
                                        <div class="mb-3">
                                            <div class="custom-control custom-checkbox small">
                                                <div class="form-check"><input class="form-check-input custom-control-input" type="checkbox" id="formCheck-1"><label class="form-check-label custom-control-label" for="formCheck-1">Remember Me</label></div>
                                            </div>
                                        </div><button class="btn btn-primary d-block btn-user w-100" type="submit">Login</button>
                                        <hr><a class="btn btn-primary d-block btn-google btn-user w-100 mb-2" role="button"><i class="fab fa-google"></i>&nbsp; Login with Google</a><a class="btn btn-primary d-block btn-facebook btn-user w-100" role="button"><i class="fab fa-facebook-f"></i>&nbsp; Login with Facebook</a>
                                        <hr>
                                    </form>
                                    <div class="text-center"><a class="small" href="#">Forgot Password?</a></div>
                                    <div class="text-center"><a class="small" href="register">Create an Account!</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="<c:url value="resources/assets/bootstrap/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="resources/assets/js/theme.js"/>"></script>
     <script>
function validate(){
   let uname= document.getElementById("exampleInputEmail").value;
   let pw= document.getElementById("exampleInputPassword").value;
    if(uname.trim()=="" ||pw.trim()== ""){
	   document.getElementById("e").style.visibility = "visible";
       document.getElementById("e").innerText = 'Enter Email/Username'; 
       document.getElementById("e").style.color = "red";
	   document.getElementById("p").style.visibility = "visible";
       document.getElementById("p").innerText = 'Enter Password'; 
       document.getElementById("p").style.color = "red";
    return false;
   }
    else if(uname.trim()==""){
	   document.getElementById("e").style.visibility = "visible";
       document.getElementById("e").innerText = 'Enter Email/Username'; 
       document.getElementById("e").style.color = "red";
return false;
   }else if( pw.trim()== ""){
	   document.getElementById("p").style.visibility = "visible";
       document.getElementById("p").innerText = 'Enter Password'; 
       document.getElementById("p").style.color = "red";
    return false;
    
   }
   else{
       return true;
   }
}
    </script>
</body>

</html>