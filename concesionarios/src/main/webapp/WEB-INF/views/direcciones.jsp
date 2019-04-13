<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<div class="container">
<div class="row">
<div class="col-md-4 col-md-offset-4">
<div class="login-panel panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">Direcciones</h3>
</div>
<div class="panel-body">
	<table>
				<c:forEach var="direcciones" items="${direcciones}">
                    
                    
                    <tr>
                    	<td><a href="fetch?tipo=direccion&id=${direcciones.getIdDireccion()}">editar</a></td>
                        
                        <td>${direcciones.getIdDireccion()}</td>
                        <td>${direcciones.getCalle()}</td>
                        <td>${direcciones.getInterior()}</td>
                        <td>${direcciones.getExterior()}</td>
                        
                    </tr>
                    
                </c:forEach>
	</table>

</div>
</div>
</div>
</div>
</div>