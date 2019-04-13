<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<div class="container">
<div class="row">
<div class="col-md-4 col-md-offset-4">
<div class="login-panel panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">Inicio de sesión</h3>
</div>
<div class="panel-body">
<form:form method="POST" action="login" modelAttribute="usuario">
<fieldset>
<div class="form-group">
<form:input cssClass="form-control" path="correo" />
<form:errors element="div" path="correo" cssClass="alert alert-danger" />
</div>
<div class="form-group">
<form:password cssClass="form-control" path="password" />
<form:errors element="div" path="password" cssClass="alert alert-danger" />
</div>
<input type="submit" class="btn btn-lg btn-success btn-block" value="Iniciar sesión" />
</fieldset>
<c:choose>
<c:when test="${error==1}">
<div class="alert alert-danger">
Completa correctamente el formulario.
</div>
</c:when>
<c:when test="${error==2}">
<div class="alert alert-danger">
Datos de acceso incorrectos.
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