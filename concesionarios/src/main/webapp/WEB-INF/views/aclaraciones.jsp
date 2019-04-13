<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<div class="container">
<div class="row">
<div class="col-md-8 col-md-offset-8">
<div class="login-panel panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">Aclaraciones</h3>
</div>
<div class="panel-body">
	<table>
				<c:forEach var="aclaraciones" items="${aclaraciones}">
                    
                    
                    <tr>
                    	<td><a href="fetch?tipo=aclaracion&id=${aclaraciones.getIdAclaracion()}">editar</a></td>
                        
                        <td>${aclaraciones.getIdAclaracion()}</td>
                        <td>${aclaraciones.getAclaracion()}</td>
                        
                    </tr>
                    
                </c:forEach>
	</table>

</div>
</div>
</div>
</div>
</div>