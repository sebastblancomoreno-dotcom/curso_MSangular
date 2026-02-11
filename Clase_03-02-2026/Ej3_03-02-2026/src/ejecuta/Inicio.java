package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Empresa;

public class Inicio 
{

	public static void main(String[] args) 
	{
		ArrayList<Empresa> lsEmpresas = new ArrayList<Empresa>();
		
		Empresa empresa1 = new Empresa("TELITEL", 20);
		Empresa empresa2 = new Empresa("SOPRA", 900);
		Empresa empresa3 = new Empresa("HIBERUS", 600);
		
		Empresa busqueda = new Empresa();
		Scanner sc = new Scanner(System.in);
		
		
		lsEmpresas.add(empresa1);
		lsEmpresas.add(empresa2);
		lsEmpresas.add(empresa3);

		System.out.println("Introduce el nombre de la empresa a buscar: ");
		busqueda.nombre = sc.nextLine();
		
		if(lsEmpresas.contains(busqueda))
		{
			System.out.println("Encontrado");
		}
		else
		{
			System.out.println("No encontrado");
		}
		
	}

}
