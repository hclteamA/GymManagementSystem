<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Register - Brand</title>
    <link rel="stylesheet" href="<c:url value="resources/assets/bootstrap/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/fontawesome-all.min.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/font-awesome.min.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/assets/fonts/fontawesome5-overrides.min.css"/>">
</head>

<body class="bg-gradient-primary">
    <div class="container">
        <div class="card shadow-lg o-hidden border-0 my-5">
            <div class="card-body p-0">
                <div class="row">
                    <div class="col-lg-5 d-none d-lg-flex">
                        <div class="flex-grow-1 justify-content-center align-items-center bg-register-image" style="background: url(&quot;resources/assets/img/dogs/gy.jpg&quot;);"></div>
                    </div>
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h4 class="text-dark mb-4">Create an Account!</h4>
                            </div>
                            <form class="user" onsubmit="return validate2()" action="registerUser" method="post">
                                
                                <div class="row mb-3">
                                    <div class="col-sm-6 mb-3 mb-sm-0"><input class="form-control form-control-user" type="text" id="exampleFirstName-1" placeholder="Name" name="flast_name"></div>
                                    <div class="col-sm-6 "><label class="col-form-label" id="name"></label></div>
                                </div>
                                <div class="row mb-3">
                                    <div class="col-sm-6 mb-3 mb-sm-0"><input class="form-control form-control-user" type="text" id="exampleFirstName-3" placeholder="Email" name="email"></div>
                                    <div class="col-sm-6 "><label class="col-form-label" id="email">${msg1}</label></div>
                                </div>
                                <div class="row mb-3">
                                    <div class="col-sm-6 mb-3 mb-sm-0"><input class="form-control form-control-user" type="password" id="exampleFirstName-4" placeholder="Password" name="password"></div>
                                    <div class="col-sm-6 "><label class="col-form-label" id="pw"></label></div>
                                </div>
                                <div class="row mb-3">
                                    <div class="col-sm-6 mb-3 mb-sm-0"><input class="form-control form-control-user" type="password" id="exampleFirstName-2" placeholder="Re-Enter Password" name="repassword"></div>
                                    <div class="col-sm-6 "><label class="col-form-label" id="pw2"></label></div>
                                </div><button class="btn btn-primary d-block btn-user w-100" type="submit">Register Account</button>
                                <hr><a class="btn btn-primary d-block btn-google btn-user w-100 mb-2" role="button"><i class="fab fa-google"></i>&nbsp; Register with Google</a><a class="btn btn-primary d-block btn-facebook btn-user w-100" role="button"><i class="fab fa-facebook-f"></i>&nbsp; Register with Facebook</a>
                                <hr>
                            </form>
                            <div class="text-center"><a class="small" href="#">Forgot Password?</a></div>
                            <div class="text-center"><a class="small" href="login">Already have an account? Login!</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
   
    <script src="resources/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="resources/assets/js/theme.js"></script>
     <script>
function validate2(){
   let name= document.getElementById("exampleFirstName-1").value;
   
   let email= document.getElementById("exampleFirstName-3").value;
   let pw= document.getElementById("exampleFirstName-4").value;
   let pw2= document.getElementById("exampleFirstName-2").value;
   var matches = name.match(/\d+/g);
  
   var emailMatches =email.match(/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/);
   
     if(name.trim()==""){
    	document.getElementById("name").style.visibility = "visible";
        document.getElementById("name").innerText = 'Enter Name'; 
        document.getElementById("name").style.color = "red";
        
        return false;
   }else if(matches != null){
	   document.getElementById("name").style.visibility = "visible";
       document.getElementById("name").innerText = 'Enter valid Name'; 
       document.getElementById("name").style.color = "red";
       return false;
   }else if( email.trim()== ""){
	   document.getElementById("email").style.visibility = "visible";
       document.getElementById("email").innerText = 'Enter Email'; 
       document.getElementById("email").style.color = "red";
    return false;
    
   }else if(emailMatches == null){
	   document.getElementById("email").style.visibility = "visible";
       document.getElementById("email").innerText = 'Enter valid Email'; 
       document.getElementById("email").style.color = "red";
    return false;
	   
   }
   else if( pw.trim()== ""){
	   document.getElementById("pw").style.visibility = "visible";
       document.getElementById("pw").innerText = 'Enter Password'; 
       document.getElementById("pw").style.color = "red";
    return false;
    
   } else if(parseInt(pw.length)<8){
	  
	   document.getElementById("pw").style.visibility = "visible";
       document.getElementById("pw").innerText = 'Password should be minimum 8 Characters'; 
       document.getElementById("pw").style.color = "red";
      
    return false;
	   
   }
   else if( pw2.trim()== ""){
	   document.getElementById("pw2").style.visibility = "visible";
       document.getElementById("pw2").innerText = 'Re Enter Password'; 
       document.getElementById("pw2").style.color = "red";
    return false;
    
   }
   
  
   else if(pw!==pw2){
	   document.getElementById("pw2").style.visibility = "visible";
       document.getElementById("pw2").innerText = 'Password Not Matched!'; 
       document.getElementById("pw2").style.color = "red";
      
    return false;
	   
   }
   else{
       return true;
   }
}
    </script>
</body>

</html>