package ejecuta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Inicio 
{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:system/admin@localhost:1521/free";
		Connection conexion = DriverManager.getConnection(url);

		Statement st;
		PreparedStatement ps;
		ResultSet rs;
		
		String sql;
		int cantidad;
		
		
		// Insertamos un registro en la tabla Producto
		// -------------------------------------------
		sql = "INSERT INTO PRODUCTO(NOMBRE, PRECIO, STOCK) "
			+ "VALUES( ?, ?, ?)";
		
		ps = conexion.prepareStatement(sql);
		
	
		ps.setString(1, "RATON");
		ps.setFloat(2, 9.99F);
		ps.setInt(3, 100);
		
		cantidad = ps.executeUpdate();
		System.out.println("Insertado " + cantidad + " registro");
		
		ps.close();

		// conexion.close();
		
		

		
		// Editamos el registro
		// --------------------
//		sql = "UPDATE PRODUCTO "
//			+ "SET IDPRODUCTO = ?, NOMBRE = ?, PRECIO = ?, STOCK = ? "
//			+ "WHERE IDPRODUCTO = ?";
//		ps = conexion.prepareStatement(sql);
//		
//		ps.setInt(1, 1);
//		ps.setString(2, "RATON NEW");
//		ps.setFloat(3, 99.99F);
//		ps.setInt(4, 1000);
//		ps.setInt(5, 1);
//		
//		cantidad = ps.executeUpdate();
//		
//		System.out.println("Editado " + cantidad + " registro");
//		ps.close();
		
		
		
		// Eliminamos un registro
		// ----------------------
		sql = "DELETE FROM PRODUCTO "
				+ "WHERE IDPRODUCTO = ?";
		
		ps = conexion.prepareStatement(sql);
		ps.setInt(1, 11);
		
		cantidad = ps.executeUpdate();
		
		System.out.println("Eliminado " + cantidad + " registro");
		ps.close();
		
	}
}