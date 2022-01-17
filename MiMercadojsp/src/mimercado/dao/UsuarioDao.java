package mimercado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import mimercado.modelo.Usuario;



public class UsuarioDao {
	
static Conexion con = null;
	
	public String getUsuario(Usuario usuario){
		
       Conexion objeto_conexion=null;
       Connection conexion_bd = null;
       PreparedStatement prdStmt = null;
       
       boolean status = false;
       String nombreCompleto="";
       
       try{
           
    	    objeto_conexion = new Conexion();
            conexion_bd = objeto_conexion.conectar();
            String sentenciaSql = 	"	SELECT   	* "
            						+ "	FROM 		mimercado.usuarios"
            						+ "	where  		correo =? and password=?";
            
            
            prdStmt = conexion_bd.prepareStatement(sentenciaSql);
            
		    prdStmt.setString (1, usuario.getCorreo());
		    prdStmt.setString (2, usuario.getPassword());
		    
            ResultSet resultado = prdStmt.executeQuery();
            while(resultado.next()) {
            	String nombre = resultado.getString(3);
            	String apellido = resultado.getString(4);
            	
            	nombreCompleto = nombre + " " + apellido;
            }
            
            if (nombreCompleto.equals("")) {
            	status = false;
            }
            else {
            	status = true;
            }
           
            
            System.out.println("conexion realizada " + status + " " + nombreCompleto);

           
       }catch(Exception e)
       {
           System.out.println("Se presento un ERROR al realizar la consulta a la BD "+e);
       }
       return nombreCompleto;
   }
	
	public boolean guardar_Cliente(Usuario cliente)
	{
       Conexion con = null;
       Connection conexionBaseDatos  = null;
       boolean ingresoDatos = true;
       if(conexionBaseDatos==null)
       {
    	   con = new Conexion();
           conexionBaseDatos= con.conectar();
       }
        
       PreparedStatement prdStmt     = null;
       try
       {
           String strSenciaInsert = "insert into mimercado.usuarios  " +
                                    "(cedula, nombre, apellido, correo, celular, password) " +
                                    "values " +
                                    "(?, ?, ?, ?, ?, ?) ";
           
           prdStmt = conexionBaseDatos.prepareStatement(strSenciaInsert);
           prdStmt.setString(1, cliente.getCedula());
           prdStmt.setString(2, cliente.getNombre());
           prdStmt.setString(3, cliente.getApellido());
           prdStmt.setString(4, cliente.getCorreo());
           prdStmt.setString(5, cliente.getCelular());
           prdStmt.setString(6, cliente.getPassword());
           
           prdStmt.execute();
           System.out.println("usuario " + cliente.getNombre() + " guardado" );
       }catch(Exception e)
       {
           System.out.println("Se presento error al crear el registro "+e);
           ingresoDatos = false;
       }
       finally{
           try
           {
                conexionBaseDatos.close();
                Conexion.cerrar();
           }
           catch(Exception errorException)
           {
               System.out.println("Se presento error al cerrar la conexion a la base de datos "+errorException);
           }
       }
       
       return ingresoDatos;
   }


}
