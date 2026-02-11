package ejecuta;

import clases.Factura;

public class Inicio {

	public static void main(String[] args) 
	{
		Factura f1 = new Factura();
		Factura f2 = new Factura();
		
		f1.cliente = "López";
		f1.total = 200;
		
		f2.cliente = "García";
		f2.total = 100;
		
		System.out.println(f1);
		System.out.println(f2);
	}

}
