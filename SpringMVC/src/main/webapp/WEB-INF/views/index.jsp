

<%@page import="java.util.List" %>
<html>
<body>
<h2>Hello World!</h2>
<h1>From Home Controller......</h1>
<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("Id");

%>

<h1>Welcome.......<%=name %></h1>
<h2>Ur Id is : <%=id %></h2>

<%
List<String> names=(List<String>)request.getAttribute("n");

%>

<%
for(String s:names){
	out.print(s);
}

%>
</body>
</html>
