<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
    <title>Lista de Todo's</title>
</head>
<body>
<div class="container">
    <div>Lista de Afazeres:</div>
    <table class="table">
        <thead>
        <tr>
            <th>Id</th>
            <th>Descricao</th>
            <th>Data para finalizar</th>
            <th>Feito?</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.descricao}</td>
                <td>${todo.dataFinal}</td>
                <td>${todo.feito}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
<script src="webjars\jquery\3.6.0\jquery.min.js"></script>
</body>
</html>