<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Laptop Models</title>
    <%@include file="layout.jsp" %>
</head>
<body>
<div class="container">
    <%--@elvariable id="laptopList" type="java.util.List<me.bnnq.homework.models.Laptop>"--%>
    <c:forEach var="laptop" items="${laptopList}">
        <div class="card mb-3">
            <div class="row g-0">
                <a class="col-md-4" href="laptop?id=${laptop.id}">
                    <img src="${laptop.pathToPhotos[0]}" class="img-fluid rounded-start" alt="${laptop.name}">
                </a>
                <div class="col-md-8">
                    <div class="card-body">
                        <a class="card-title h5 link-success" href="laptop?id=${laptop.id}">${laptop.name}</a>
                        <p class="card-text">${laptop.description}</p>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
