/*
Crea una clase Cuenta (bancaria) con atributos para el número de cuenta (un entero largo), 
el DNI del cliente (String), el saldo actual y el interés anual que se aplica a la cuenta (porcentaje). 

Constructor por defecto y constructor con DNI, saldo e interés.

Getters y setters: Para el número de cuenta no habrá setter. El resto de campos tendrán getters y setters.

Métodos:
- actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario (interés anual dividido entre 365 aplicado al saldo actual).
- ingresar(int): permitirá ingresar una cantidad en la cuenta.
- retirar(int): permitirá sacar una cantidad de la cuenta (si hay saldo, de lo contrario lanzar una excepción).
- Método que nos permita mostrar todos los datos de la cuenta.

El número de cuenta se asignará de forma correlativa a partir de 100001, asignando el siguiente número al último asignado.
 */

package clases;

public class Cuenta 
{
	// Constructores
	// -------------
	public Cuenta()
	{
		this("", 0L, (byte)0);
	}
	public Cuenta(String p_dni, long p_saldo, byte p_interes)
	{
		// this.numero = Cuenta.idCuenta;
		// Cuenta.idCuenta++;
		this.numero = Cuenta.idCuenta++;
		
		setDni(p_dni);
		setSaldo(p_saldo);
		setInteres(p_interes);
	}
	
	// Campos
	// ------
	private static long idCuenta = 100001; 
	private long numero;
	
	private long saldo;
	private String dni;
	private byte interes;
	
	// Métodos
	// -------
	// - De instancia de esta clase
	public void actualizarSaldo()
	{
		setSaldo(getSaldo() + getSaldo() * getInteres());
	}
	
	public void ingresar(long p_cantidad)
	{
		setSaldo(getSaldo() + p_cantidad);
	}
	
	public void retirar(long p_cantidad) throws Exception
	{
		if(getSaldo() >= p_cantidad)
		{
			setSaldo(getSaldo() - p_cantidad);
		}
		else
		{
			throw new Exception("No se ha podido retirar el dinero. No hay saldo suficiente");
		}
	}
	
	// - Métodos invalidados 
	@Override
	public String toString()
	{
		return "NUM. CTA: " + getNumero() + "\n"
				+ "SALDO: " + getSaldo() + "\n"
				+ "INTERÉS: " + getInteres() + "\n"
				+ "DNI TIT.: " + getDni() + "\n";
	}
	
	// - Getters y setters
	public long getSaldo() {
		return saldo;
	}
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public byte getInteres() {
		return interes;
	}
	public void setInteres(byte interes) {
		this.interes = interes;
	}
	
	public long getNumero() 
	{
		return numero;
	}

	
}





