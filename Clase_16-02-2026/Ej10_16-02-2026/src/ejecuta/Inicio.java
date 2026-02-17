package ejecuta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import clases.Vehiculo;

public class Inicio 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Declaramos las variables
		// ------------------------
		String url = "jdbc:oracle:thin:system/admin@localhost:1521/free";
		Connection conexion = DriverManager.getConnection(url);
		String sql = """
					SELECT IDVEHICULO, FABRICANTE, MODELO, COLOR, PRECIO
					FROM VEHICULO 
					ORDER BY FABRICANTE ASC""";
		Statement st = conexion.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Vehiculo vehiculo;
		
		String fabricante = "";
		String modelo = "";
		// fin declaración
		
		
		System.out.print("FABRICANTE");
		System.out.print("MODELO");
		System.out.print("COLOR");
		System.out.print("PRECIO");
		System.out.println("ID");
		System.out.println("==================================================");
		
		// Leemos los datos de la tabla vehiculo registro a registro
		while(rs.next())
		{
			vehiculo = new Vehiculo();
			
			vehiculo.idVehiculo = rs.getInt(1);
			vehiculo.fabricante = rs.getString(2);
			vehiculo.modelo = rs.getString(3);
			vehiculo.color = rs.getString(4);
			vehiculo.precio = rs.getFloat(5);
			
			// Vemos si cambiamos de grupo de fabricante
			if(fabricante.equals(vehiculo.fabricante) == false)
			{
				fabricante = vehiculo.fabricante;
				System.out.println(fabricante);
			}
			
			if(modelo.equals(vehiculo.modelo) == false)
			{
				modelo = vehiculo.modelo;
				System.out.println(modelo);
			}
			
			System.out.print(vehiculo.color);
			System.out.print(vehiculo.precio);
			System.out.println(vehiculo.idVehiculo);
		}
		
		rs.close();
		st.close();

		conexion.close();
	}
}
