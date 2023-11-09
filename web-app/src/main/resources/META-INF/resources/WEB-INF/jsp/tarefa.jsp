<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
    <title>Criar tarefa</title>
</head>
<body>
    <div class="container">
        <h1>Detalhes da Tarefa</h1>
        <form:form method="post" modelAttribute="todo">
            <fieldset class="mb-3">
                <form:label path="descricao">Descricao:</form:label>
                <form:input type="text" required="required" path="descricao"/>
                <form:errors path="descricao" cssClass="text-warning"/>
            </fieldset>
            <fieldset class="mb-3">
                <form:label path="dataFinal">Data Final</form:label>
                <form:input type="text" required="required" path="dataFinal"/>
                <form:errors path="dataFinal" cssClass="text-warning"/>
            </fieldset>
            <form:input path="id" type="hidden"/>
            <form:input path="feito" type="hidden"/>
            <input type="submit" class="btn btn-dark">
        </form:form>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script type="text/javascript">
        $('#dataFinal').datepicker({
            format: 'dd-mm-yyyy'
        });
    </script>
</body>
</html>