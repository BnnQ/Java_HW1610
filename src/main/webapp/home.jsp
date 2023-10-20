<%--@elvariable id="manufacturer" type="me.bnnq.homework.models.LaptopManufacturer"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Home</title>
    <%@include file="layout.jsp" %>
</head>
<body>
<div class="main-container">
    <h1>${manufacturer.name}, ${manufacturer.country}</h1>
    <img class="img-fluid" style="width: 350px; height: 100px" src="${manufacturer.pathToLogo}" alt="Manufacturer logo image"/>
    <p><strong>Number of employees: </strong> ${manufacturer.numberOfEmployees}</p>
    <p><strong>Description: </strong> ${manufacturer.shortDescription}</p>
</div>
</body>
</html>