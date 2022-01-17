package mimercado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mimercado.modelo.Producto;
import mimercado.modelo.Usuario;

public class ProductoDao {

	public List listar() throws SQLException {
		ArrayList<Producto> lista = new ArrayList<>();
		String sql = "select * from mimercado.productos";
		Conexion objeto_conexion = null;
		Connection conexion_bd = null;
		PreparedStatement prdStmt = null;

		try {
			objeto_conexion = new Conexion();
			conexion_bd = objeto_conexion.conectar();
			prdStmt = conexion_bd.prepareStatement(sql);
			ResultSet resultado = prdStmt.executeQuery();
			while (resultado.next()) {

				int id = resultado.getInt("id");
				String nombre = resultado.getString("nombre");
				int precio = resultado.getInt("precio");
				int inventario = resultado.getInt("inventario");
				String url = resultado.getString("url");
				String seccion = resultado.getString("seccion");
				String promocion = resultado.getString("promocion");
				Producto producto = new Producto(id, nombre, precio, inventario, url, seccion, promocion);
				lista.add(producto);

			}

			System.out.println(lista.get(0).getNombre());

			System.out.println("conexion realizada con exito");
		} catch (Exception e) {
			System.out.println("Se presento un ERROR al realizar la consulta a la BD " + e);
		} finally {
			conexion_bd.close();
			Conexion.cerrar();

		}

		return lista;
	}

	public boolean guardar_Producto(Producto producto) {
		Conexion con = null;
		Connection conexionBaseDatos = null;
		boolean ingresoDatos = true;
		if (conexionBaseDatos == null) {
			con = new Conexion();
			conexionBaseDatos = con.conectar();
		}

		PreparedStatement prdStmt = null;
		try {
			String strSenciaInsert = "insert into mimercado.productos"
					+ "(nombre, precio, inventario, url, seccion, promocion) " + "values " + "(?, ?, ?, ?, ?, ?) ";

			prdStmt = conexionBaseDatos.prepareStatement(strSenciaInsert);
			prdStmt.setString(1, producto.getNombre());
			prdStmt.setInt(2, producto.getPrecio());
			prdStmt.setInt(3, producto.getInventario());
			prdStmt.setString(4, producto.getUrl());
			prdStmt.setString(5, producto.getSeccion());
			prdStmt.setString(6, producto.getPromocion());

			prdStmt.execute();
		} catch (Exception e) {
			System.out.println("Se presento error al crear el registro " + e);
			ingresoDatos = false;
		} finally {
			try {
				conexionBaseDatos.close();
				Conexion.cerrar();
			} catch (Exception errorException) {
				System.out.println("Se presento error al cerrar la conexion a la base de datos " + errorException);
			}
		}

		return ingresoDatos;
	}

	public Producto encontrar(Producto producto) throws SQLException {

		Conexion objeto_conexion = null;
		Connection conexion_bd = null;
		PreparedStatement prdStmt = null;
		if (conexion_bd == null) {
			objeto_conexion = new Conexion();
			conexion_bd = objeto_conexion.conectar();
		}

		try {
			
			String sql = "select * from mimercado.productos where id=?";
			prdStmt = conexion_bd.prepareStatement(sql);
			prdStmt.setInt(1, producto.getId());
			ResultSet resultado = prdStmt.executeQuery();
			while (resultado.next()) {

				
				String nombre = resultado.getString("nombre");
				int precio = resultado.getInt("precio");
				int inventario = resultado.getInt("inventario");
				String url = resultado.getString("url");
				String seccion = resultado.getString("seccion");
				String promocion = resultado.getString("promocion");
				
				producto.setNombre(nombre);
				producto.setInventario(inventario);
				producto.setPrecio(precio);
				producto.setUrl(url);
				producto.setSeccion(seccion);
				producto.setPromocion(promocion);
				
				

			}
			
		
			
			
			
			
			

			System.out.println(producto.getNombre());

			System.out.println("conexion realizada con exito");
		} catch (Exception e) {
			System.out.println("Se presento un ERROR al realizar la consulta a la BD " + e);
		} finally {
			conexion_bd.close();
			Conexion.cerrar();

		}

		return producto;

	}
	
	public int insertar(Producto producto) throws SQLException {
		
		Conexion objeto_conexion = null;
		Connection conexion_bd = null;
		PreparedStatement prdStmt = null;
		int rows = 0;

		try {
			objeto_conexion = new Conexion();
			conexion_bd = objeto_conexion.conectar();
			String sql = "INSERT INTO mimercado.productos (nombre, precio, inventario, url, seccion, promocion)"
					+ "values(?, ?, ?, ?, ?, ?)";
			prdStmt = conexion_bd.prepareStatement(sql);
			
			prdStmt.setString(1, producto.getNombre());
			prdStmt.setInt(2, producto.getPrecio());
			prdStmt.setInt(3, producto.getInventario());
			prdStmt.setString(4, producto.getUrl());
			prdStmt.setString(5, producto.getSeccion());
			prdStmt.setString(6, producto.getPromocion());
			
			rows = prdStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Se presento un ERROR al realizar la consulta a la BD " + e);
		} finally {
			conexion_bd.close();
			Conexion.cerrar();

		}

		return rows;
		
	}
	
	
	public int actualizar (Producto producto) throws SQLException {
		Conexion objeto_conexion = null;
		Connection conexion_bd = null;
		PreparedStatement prdStmt = null;
		int rows = 0;

		try {
			objeto_conexion = new Conexion();
			conexion_bd = objeto_conexion.conectar();
			String sql = "UPDATE mimercado.productos"
					+ " SET nombre=?, precio=?, inventario=?, url=?, seccion=?, promocion=? where id =? ";
					
			prdStmt = conexion_bd.prepareStatement(sql);
			
			prdStmt.setString(1, producto.getNombre());
			prdStmt.setInt(2, producto.getPrecio());
			prdStmt.setInt(3, producto.getInventario());
			prdStmt.setString(4, producto.getUrl());
			prdStmt.setString(5, producto.getSeccion());
			prdStmt.setString(6, producto.getPromocion());
			prdStmt.setInt(7, producto.getId());
			rows = prdStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Se presento un ERROR al realizar la consulta a la BD " + e);
		} finally {
			conexion_bd.close();
			Conexion.cerrar();

		}

		return rows;
		
	}
	
	public int eliminar(Producto producto) throws SQLException {
		Conexion objeto_conexion = null;
		Connection conexion_bd = null;
		PreparedStatement prdStmt = null;
		int rows = 0;

		try {
			objeto_conexion = new Conexion();
			conexion_bd = objeto_conexion.conectar();
			String sql = "DELETE FROM mimercado.productos WHERE id=?";
					
			prdStmt = conexion_bd.prepareStatement(sql);
			
			
			prdStmt.setInt(1, producto.getId());
			rows = prdStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Se presento un ERROR al realizar la consulta a la BD " + e);
		} finally {
			conexion_bd.close();
			Conexion.cerrar();

		}

		return rows;
		
		
	}
	
	

}
