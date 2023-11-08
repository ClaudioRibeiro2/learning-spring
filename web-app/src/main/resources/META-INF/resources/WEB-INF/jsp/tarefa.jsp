<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
    <title>Criar tarefa</title>
</head>
<body>
    <div class="container">
        <h1>Detalhes da Tarefa</h1>
        <form:form method="post" modelAttribute="todo">
            Descricao: <form:input type="text" name="descricao" required="required" path="descricao"/>
            <form:errors path="descricao" cssClass="text-warning"/>
            <form:input path="id" type="hidden"/>
            <form:input path="feito" type="hidden"/>
            <input type="submit" class="btn btn-dark">
        </form:form>
    </div>
    <script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
    <script src="webjars\jquery\3.6.0\jquery.min.js"></script>
</body>
</html>