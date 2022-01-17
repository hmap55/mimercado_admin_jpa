<div class="modal fade" id="agregarProductoModal">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header bg-info text-white">
				<h5 class="modal-title">Agregar Producto</h5>
				<button class="close" data-dismiss="modal">
					<span>&times;</span>
				</button>

			</div>
			<form
				action="${pageContext.request.contextPath}/Servletproductos?accion=insertar"
				method="post"class="was-validated">
				<div class="modal-body">
					<div class="form-group">
						<label for="nombre">Nombre</label> <input type="text"
							class="form-control" name="nombre" required>
					</div>
					
					<div class="form-group">
						<label for="precio">Precio</label> <input type="number"
							class="form-control" name="precio" required>
					</div>
					
					<div class="form-group">
						<label for="inventario">Inventario</label> <input type="number"
							class="form-control" name="inventario"required>
					</div>
					
					<div class="form-group">
						<label for="url">Url imagen</label> <input type="text"
							class="form-control" name="url"required>
					</div>
					
					<div class="form-group">
						<label for="seccion">Seccion</label> <input type="text"
							class="form-control" name="seccion"required>
					</div>
					
					<div class="form-group">
						<label for="promocion">Promocion</label> <input type="text"
							class="form-control" name="promocion">
					</div>
					
					
				</div>
				<div class="modal-footer">
				<button class="btn btn-primary" type="submit">Guardar</button>
				</div>

			</form>
		</div>
	</div>
</div>