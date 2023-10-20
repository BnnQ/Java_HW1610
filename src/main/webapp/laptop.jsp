<%--@elvariable id="laptop" type="me.bnnq.homework.models.Laptop"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>${laptop.name}</title>
    <%@include file="layout.jsp" %>
</head>
<body>
<div class="container">
    <div class="card mb-3">
        <div class="card-body">
            <h5 class="card-title">${laptop.name}</h5>
            <p class="card-text">${laptop.description}</p>
            <div class="d-flex align-items-center justify-content-center gap-3">
                <c:forEach var="photo" items="${laptop.pathToPhotos}">
                    <img src="${photo}" class="img-fluid rounded-start mb-3" style="height: 200px!important" alt="${laptop.name}">
                </c:forEach>
            </div>
            <h6>Technical Specifications:</h6>
            <ul>
                <c:forEach var="entry" items="${laptop.technicalSpecifications}">
                    <li>${entry.key}: ${entry.value}</li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
</body>
</html>