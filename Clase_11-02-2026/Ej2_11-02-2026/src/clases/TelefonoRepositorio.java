package clases;

import java.util.ArrayList;

public class TelefonoRepositorio implements ICrud  
{
	// Constructor
	// -----------
	
	// Campos
	// ------
	private ArrayList<Telefono> lsTelefonos = new ArrayList<Telefono>();
	

	// Métodos
	// -------
	@Override
	public Telefono leer(Telefono busqueda) 
	{
		int posicion;
		Telefono t;
		
		posicion = this.lsTelefonos.indexOf(busqueda);
		
		if(posicion == -1)
		{
			t = null;
		}
		else
		{
			t = this.lsTelefonos.get(posicion);
		}
		
		return t;
	}	
	
	@Override
	public Telefono leer(int idTelefono) 
	{
		// Hacemos una búsqueda secuencial
		boolean encontrado;
		Telefono telefono = null;
		
		encontrado = false;
		for(int i=0; encontrado == false && i < this.lsTelefonos.size(); i++)
		{
			telefono = lsTelefonos.get(i);
			
			if(idTelefono == telefono.getIdTelefono() )
			{
				encontrado = true;
			}
		}
		
		if(encontrado == false)
		{
			telefono = null;
		}

		return telefono;
		/*
		Telefono telefono;
		Telefono busqueda;
		int posicion;
		
		busqueda = new Telefono();
		busqueda.setIdTelefono(idTelefono);
		
		posicion = lsTelefonos.indexOf(busqueda);
		telefono = lsTelefonos.get(posicion);
		
		return telefono;
		*/
	}

	@Override
	public ArrayList<Telefono> listar() 
	{
		return this.lsTelefonos;
	}

	@Override
	public boolean nuevo(Telefono telefono) 
	{
		Telefono t;
		boolean ok;
		
		t = leer(telefono);
		
		if(t == null)
		{
			this.lsTelefonos.add(telefono);
			ok = true;
		}
		else
		{
			ok = false;
		}

		return ok;
	}

	@Override
	public boolean eliminar(int idTelefono) 
	{
		boolean ok;
		Telefono telefono = new Telefono();
		
		telefono.setIdTelefono(idTelefono);
		ok = this.lsTelefonos.remove(telefono);
		
		return ok;
	}

	@Override
	public boolean eliminar(Telefono telefono) 
	{
		return this.lsTelefonos.remove(telefono);
	}

	@Override
	public boolean editar(int idTelefono, Telefono telefono) 
	{
		boolean ok;
		int posicion; // posición dónde encuentra el registro
		Telefono busqueda = new Telefono();
		
		busqueda.setIdTelefono(idTelefono);
		posicion = this.lsTelefonos.indexOf(busqueda);
		
		if(posicion == -1)
		{
			ok = false;
		}
		else
		{
			ok = true;
			this.lsTelefonos.set(posicion, telefono);	
		}
		
		return ok;
	}

	
}
