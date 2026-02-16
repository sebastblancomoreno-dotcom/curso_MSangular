package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.ProductoModelo;
import repositorio.ProductoRepositorio;

public class Inicio 
{
	public static void main(String[] args) 
	{
		String menu = """
						GESTIÓN DE PRODUCTOS
						--------------------
						1. Nuevo
						2. Buscar
						3. Listar
						4. Eliminar
						5. Editar
						6. Salir
						Introduce opción: """;
		int opcion;
		Scanner sc = new Scanner(System.in);
		ProductoModelo modelo;
		ArrayList<ProductoModelo> lsProductos;
		int idProducto;
		boolean ok;
		ProductoRepositorio repo = new ProductoRepositorio("localhost", 1521, "system", "admin", "free");
		
		do 
		{
			System.out.println(menu);
			opcion = Integer.valueOf( sc.nextLine() );
			
			switch(opcion)
			{
				case 1:
					try
					{
						modelo = new ProductoModelo();
						
						System.out.println("Introduce ID PRODUCTO: ");
						modelo.setIdProducto( Integer.valueOf( sc.nextLine() ) );
						
						System.out.println("Introduce PRODUCTO: ");
						modelo.setNombre( sc.nextLine() );
						
						System.out.println("Introduce PRECIO: ");
						modelo.setPrecio( Float.valueOf(sc.nextLine()) );
						
						System.out.println("Introduce STOCK: ");
						modelo.setStock( Integer.valueOf(sc.nextLine() ));
						
						ok = repo.nuevo(modelo);	
						
						if(ok)
						{
							System.out.println("¡GUARDADO!!");
						}
						else
						{
							System.out.println("NO SE HA GUARDADO.");
						}
					}
					catch (Exception e) 
					{
						System.out.println( e.getMessage() );
					}
					
					break;
				
				case 2:
					try
					{
						System.out.println("Introduce ID PRODUCTO: ");
						idProducto = Integer.valueOf( sc.nextLine() );
						
						modelo = repo.leer(idProducto);
						
						if(modelo != null)
						{
							System.out.println(modelo);							
						}
						else
						{
							System.out.println("NO SE HA ENCONTRADO.");
						}
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					
					break;
				
				case 3:
					try 
					{
						lsProductos = repo.listar();
						for(ProductoModelo p: lsProductos) System.out.println(p);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					break;
				
				case 4:
					try
					{
						System.out.println("Introduce ID PRODUCTO: ");
						idProducto = Integer.valueOf(sc.nextLine());
						
						ok = repo.eliminar(idProducto);
						
						if(ok)
						{
							System.out.println("¡ELIMINADO!!");
						}
						else
						{
							System.out.println("NO SE HA ELIMINADO.");
						}
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					break;
				
				case 5:
				break;
				
				case 6:
				break;
				
				default:
				break;
			}
		} while(opcion != 6);
	

	}
}
