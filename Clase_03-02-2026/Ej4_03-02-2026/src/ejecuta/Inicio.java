package ejecuta;

import java.util.ArrayList;
import java.util.Arrays;

import clases.Empresa;

public class Inicio
{

	public static void main(String[] args) 
	{
		ArrayList<Empresa> lsEmpresas = new ArrayList<Empresa>();
		
		lsEmpresas.add(new Empresa("SOPRA", 400));
		lsEmpresas.add(new Empresa("HIBERUS", 500));
		lsEmpresas.add(new Empresa("INDRA", 900));
		
		lsEmpresas.sort( (a, b) -> a.nombre.compareTo(b.nombre) );
		System.out.println("Listado de empresas ordenadas por nombre ascendente: ");
		
		for(Empresa empresa: lsEmpresas)
		{
			System.out.println(empresa);
		}
		
		
		lsEmpresas.sort( (a, b) -> b.nombre.compareTo(a.nombre));
		System.out.println("Listado de empresas ordenadas por nombre descendente: ");
		
		for(var empresa: lsEmpresas) System.out.println(empresa);
		
		
		lsEmpresas.sort( (a, b) -> a.numeroEmpleados - b.numeroEmpleados);
		System.out.println("Listado de empresas ordenadas por número de empleados ascendentemente: ");
		for(Empresa empresa: lsEmpresas) System.out.println(empresa);
		
		lsEmpresas.sort( (a, b) -> b.numeroEmpleados - a.numeroEmpleados);
		System.out.println("Listado de empresas ordenadas por número de empleados descendentemente: ");
		for(Empresa empresa: lsEmpresas) System.out.println(empresa);		
		
	}
}
