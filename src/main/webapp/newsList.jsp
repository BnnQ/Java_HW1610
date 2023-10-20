<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>News</title>
    <%@include file="layout.jsp" %>
</head>
<body>
<div class="container">
    <%--@elvariable id="newsList" type="java.util.List<me.bnnq.homework.models.News>"--%>
    <c:forEach var="news" items="${newsList}">
        <div class="card mb-3">
            <div class="row g-0">
                <a class="col-md-4" href="news?id=${news.id}">
                    <img src="${news.pathToPhotos[0]}" class="img-fluid rounded-start" alt="${news.header}">
                </a>
                <div class="col-md-8">
                    <div class="card-body">
                        <a class="card-title h5 link-success" href="news?id=${news.id}">${news.header}</a>
                        <p class="card-text">${news.shortDescription}</p>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
