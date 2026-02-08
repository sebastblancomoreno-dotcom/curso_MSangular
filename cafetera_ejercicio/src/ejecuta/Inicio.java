package ejecuta;

import java.util.Scanner;

import clases.Cafetera;

public class Inicio {
	public static void main(String[] args) {
		String menu = 
	"MENU\n" 
	+ "1. Encender\n"
	+ "2. Apagar\n" 
	+ "3. Servir taza\n" + "4. Servir vaso\n"
	+ "5. Rellenar\n" 
	+ "6. Mostrar agua restante\n" 
	+ "7. Salir\n" + "Introduce opcion:";
		Scanner sc = new Scanner(System.in);
		int opcion=0;

		try {
			Cafetera cafetera = new Cafetera(1000, 1000, 100, 250, false);
			do {
				try {
					System.out.println(menu);
					opcion = sc.nextInt();
					switch (opcion) {
					case 1: {
						cafetera.Encender();
						break;
					}
					case 2: {
						cafetera.Apagar();
						break;
					}
					case 3: {
				System.out.println(cafetera.servirTaza());		
						break;
					}
					case 4: {
				System.out.println(cafetera.servirVaso());		
						break;
					}
					case 5: {
						cafetera.Rellenar();
						break;
					}
					case 6: {
						System.out.println(cafetera.obtenerCapacidadActual()); 
						break;
					}
					case 7: {

						break;
					}
					default:
						System.out.println("Opcion incorrecta");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} while (opcion != 7);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			sc.close();
			System.out.println("FIN");
		}
	}
}
