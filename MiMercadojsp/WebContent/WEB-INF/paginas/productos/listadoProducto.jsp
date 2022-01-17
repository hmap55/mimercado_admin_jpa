<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<section id="productos">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<h4>Gestion de inventario:</h4>
						<h5>Productos en el sistema:</h5>
					</div>
					<table class="table table-striped table-responsive table-hover">

						<thead class="thead-dark">
							<tr>
								<th>#</th>
								<th>Nombre</th>
								<th>Precio</th>
								<th>Inventario</th>
								<th>Imagen</th>
								<th>Sección</th>
								<th>Promoción</th>
								<th></th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="producto" items="${productos}">
								<tr>
									<td>${producto.id}</td>
									<td>${producto.nombre}</td>
									<td>${producto.precio}</td>
									<td>${producto.inventario}</td>
									<td><img src="${producto.url}" class="img-thumbnail"
										width="80" height="80" /></td>
									<td>${producto.seccion}</td>
									<td>${producto.promocion}</td>
									<td><a
										href="${pageContext.request.contextPath}/Servletproductos?accion=editar&idProducto=${producto.id}"
										class="btn btn-secundary"> <i
											class="fas fa-angle-double-right"></i>Editar
									</a></td>
								</tr>
							</c:forEach>
						</tbody>

					</table>

				</div>
			</div>

		</div>
		<!-- tarjetas totales -->
		<div class="row">

			<div class="col-md-6">
				<div class="card text-center bg-danger text-white mb-3">
					<div class="card-body">
						<h3>Valor de inventario:</h3>
						<h4 class="display-4">
						
							<fmt:formatNumber value="${saldoTotal}" type="currency" />

						</h4>

					</div>
				</div>
			</div>


			<div class="col-md-6">
				<div class="card text-center bg-success text-white mb-3">
					<div class="card-body">
						<h3>Total productos:</h3>
						<h4 class="display-4">
							<i class="fas fa-poll"></i> ${totalProductos}

						</h4>

					</div>
				</div>
			</div>
		</div>



	</div>


</section>


<jsp:include page="/WEB-INF/paginas/productos/agregarProducto.jsp"/>
