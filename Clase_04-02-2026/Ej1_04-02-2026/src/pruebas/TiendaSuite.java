package pruebas;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TiendaSuite 
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite();
		
		suite.addTest( CestaCompraTest.suite() );
		// suite.addTest( ClienteTest.suite() );
		
		return suite;
	}
	
	public static void main(String[] args) 
	{
		TestRunner.run( suite() );

	}

}
