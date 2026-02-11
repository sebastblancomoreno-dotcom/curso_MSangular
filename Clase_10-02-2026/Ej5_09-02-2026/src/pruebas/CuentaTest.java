package pruebas;

import clases.Cuenta;
import clases.CuentaException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class CuentaTest extends TestCase
{
	// Constructores
	// -------------
	public CuentaTest(String p_nombre)
	{
		super(p_nombre);
	}
	
	// Campos
	// ------
	private Cuenta cuenta;
	
	
	// Métodos
	// -------
	// - Invalidados de la clase TestCase

	// Este método se ejecuta antes de cada test unitario
	@Override
	protected void setUp() throws Exception 
	{
		String dni = "00000000T";
		int saldo = 100;
		int interes = 10;
		
		this.cuenta = new Cuenta(dni, saldo, interes);
	}

	// Este método se ejecuta después de cada test unitario
	@Override
	protected void tearDown() throws Exception 
	{
		this.cuenta = null;
	}
	
	// Métodos de prueba
	public void testRetirar()
	{
		int dinero = 20;
		
		try 
		{
			this.cuenta.retirar(dinero);
			assertEquals(80, this.cuenta.getSaldo());
		} 
		catch (CuentaException e) 
		{
			fail("No debería lanzar una excepción");
			System.out.println( e.getMessage() );
		}
	}
	
	public void testRetirarDineroNoDisponible()
	{
		int dinero = 110;
		
		try 
		{
			this.cuenta.retirar(dinero);
			fail("Debería lanzar una excepción");
		} 
		catch (CuentaException e) {
			System.out.println( e.getMessage() );
		}
	}
	
	public void testIngresar()
	{
		int dinero = 200;
		
		try 
		{
			this.cuenta.ingresar(dinero);
			assertEquals(300, this.cuenta.getSaldo());
		} 
		catch (CuentaException e) 
		{
			fail("No debería lanzar una excepción");
			System.out.println(e.getMessage());
		}
	}
	
	public void testIngresarCantidadNegativa()
	{
		int dinero = -200;
		
		try 
		{
			this.cuenta.ingresar(dinero);
			fail("Debería lanzar una excepción");
		} 
		catch (CuentaException e) 
		{
			System.out.println(e.getMessage());
		}
	}	
	
	public void testActualizarSaldo()
	{
		try 
		{
			this.cuenta.actualizarSaldo();
			assertEquals(110, this.cuenta.getSaldo());
		} 
		catch (CuentaException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	

	// Método para indicar los test que debe ejecutarse
	public static Test conjuntoTest()
	{
		// - indicamos que ejecute todos los test de la clase CuentaTest
		// TestSuite ts = new TestSuite(CuentaTest.class); 
		
		
		// - indicar que ejecute solo los test seleccionados
		TestSuite ts = new TestSuite();
		
		ts.addTest( new CuentaTest("testRetirar") );
		ts.addTest( new CuentaTest("testIngresar") );
		ts.addTest( new CuentaTest("testActualizarSaldo") );
		ts.addTest( new CuentaTest("testIngresarCantidadNegativa") );
		ts.addTest( new CuentaTest("testRetirarDineroNoDisponible") );
		
		return ts;
	}
	
	
	// Método main
	public static void main(String args[])
	{
		Test t = conjuntoTest();
		
		junit.textui.TestRunner.run( t );
	}
	
}
