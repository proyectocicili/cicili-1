<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<div class="container">
<div class="row">
<div class="col-md-4 col-md-offset-4">
<div class="login-panel panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">Registro Aclaracion</h3>
</div>
<div class="panel-body">
<form:form method="POST" action="registrarAclaracion" modelAttribute="aclaracion">
<fieldset>

<div class="form-group">
<form:hidden cssClass="form-control" path="idAclaracion" />
<form:errors element="div" path="idAclaracion" cssClass="alert alert-danger" />
</div>


<div class="form-group">
<form:input cssClass="form-control" path="aclaracion" />
<form:errors element="div" path="aclaracion" cssClass="alert alert-danger" />
</div>


<input type="submit" class="btn btn-lg btn-success btn-block" value="Registrar" />
</fieldset>
<c:choose>
<c:when test="${error==1}">
<div class="alert alert-danger">
Completa correctamente el formulario.
</div>
</c:when>
<c:when test="${error==2}">
<div class="alert alert-danger">
Error al registrar concesionario.
</div>
</c:when>
<c:when test="${error==3}">
<div class="alert alert-danger">
Ha sucedido un error, por favor intentalo de nuevo.
</div>
</c:when>
</c:choose>
</form:form>
</div>
</div>
</div>
</div>
</div>