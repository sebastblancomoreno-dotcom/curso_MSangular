package pruebas;

import clases.CestaCompra;
import clases.Producto;
import clases.ProductoNotFoundException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class CestaCompraTest extends TestCase 
{
	// Constructor
	// -----------
	public CestaCompraTest(String p_nombreTest)
	{
		super(p_nombreTest);
	}
	
	// Campos
	// ------
	private CestaCompra cesta;
	private Producto _defaultBook;
	
	// Métodos
	// -------
	
	// Se invoca antes de cada test
	@Override
	protected void setUp() throws Exception
	{
		
		this.cesta = new CestaCompra();
		this._defaultBook = new Producto("Programación extrema", 23.95);
		
		this.cesta.nuevoProducto(this._defaultBook);
	}

	// Se invoca después de cada test
	@Override
	protected void tearDown() throws Exception 
	{
		this.cesta = null;
		this._defaultBook = null;
	}
	
	// Métodos para hacer los test
	public void testNuevoProducto()
	{
		// Este método comprueba que al añadir un nuevo producto, 
		// se calcule bien el total y la cantidad de artículos que hay en la cesta
		
		double totalCesta;
		
		// Añadimos un nuevo producto a la cesta
		Producto newBook = new Producto("Refactorización", 53.95);
		this.cesta.nuevoProducto(newBook);
		
		totalCesta = this._defaultBook.getPrecio() + newBook.getPrecio();
		
		assertEquals(totalCesta, this.cesta.obtenerTotal(), 0.0);
		assertEquals(2, this.cesta.contarProductos());
	}
	
	public void testVaciarCesta()
	{
		// Comprobamos el método vaciar cesta
		
		this.cesta.vaciarCesta();
		assertTrue(this.cesta.hayProductos() == false);
	}
	
	public void testEliminarProducto() throws ProductoNotFoundException
	{
		// Comprobamos que al eliminar un producto, se resta el precio del total.
		// Además se actualiza el número de productos que hay en la cesta
		
		this.cesta.eliminarProducto(this._defaultBook);
		
		assertEquals(0, this.cesta.contarProductos()); 
		assertEquals(0.0, this.cesta.obtenerTotal(), 0.0);
	}
	
	public void testProductoNotFound()
	{
		// Comprobamos que la excepción se maneja cuando es preciso
		
		Producto book = new Producto("JPA Experto", 8.99);
		
		try 
		{
			this.cesta.eliminarProducto(book);
			
			fail("Debería lanzar una excepción");
		} 
		catch (ProductoNotFoundException e) 
		{
			System.out.println("No se ha eliminado, el producto no existe");
		}
	}
	
	public static Test suite()
	{
		TestSuite suite = new TestSuite(CestaCompraTest.class);
		
		/*
		 TestSuite suite = new TestSuite();
		 
		 suite.addTest(new CestaCompraTest("testVaciarCesta"));
		 suite.addTest(new CestaCompraTest("testNuevoProducto"));
		 */
		
		return suite;
	}
	
	
	public static void main(String[] args) 
	{
		TestRunner.run( suite() );

	}
}
