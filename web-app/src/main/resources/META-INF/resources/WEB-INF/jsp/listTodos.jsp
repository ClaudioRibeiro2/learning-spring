<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
    <title>Lista de Tarefas</title>
</head>
<body>
<div class="container">
    <div>Lista de Tarefas:</div>
    <table class="table">
        <thead>
        <tr>
            <th>Id</th>
            <th>Descricao</th>
            <th>Data para finalizar</th>
            <th>Feito?</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${tarefas}" var="tarefa">
            <tr>
                <td>${tarefa.id}</td>
                <td>${tarefa.descricao}</td>
                <td>${tarefa.dataFinal}</td>
                <td>${tarefa.feito}</td>
                <td><a href="apagar-tarefa?id=${tarefa.id}" class="btn btn-danger">EXPURGAR</a></td>
                <td><a href="atualizar-tarefa?id=${tarefa.id}" class="btn btn-success">EDITAR</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="criar-tarefa" class="btn btn-success">Criar uma tarefa.</a>
</div>
<script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
<script src="webjars\jquery\3.6.0\jquery.min.js"></script>
</body>
</html>