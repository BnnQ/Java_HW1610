<%--@elvariable id="news" type="me.bnnq.homework.models.News"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>${news.header}</title>
    <%@include file="layout.jsp" %>
</head>
<body>
<div class="container">
    <div class="card mb-3">
        <div class="card-body">
            <h5 class="card-title">${news.header}</h5>
            <p class="card-text">${news.content}</p>
            <c:forEach var="photo" items="${news.pathToPhotos}">
                <img src="${photo}" class="img-fluid rounded-start mb-3" alt="${news.header}">
            </c:forEach>
        </div>
    </div>
</div>
</body>
</html>