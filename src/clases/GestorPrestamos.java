package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorPrestamos {
	public static void run(Scanner scan) throws SQLException {
		
		int opcion;
		GestorBBDD gestorbbdd = new GestorBBDD();
		
		do {
			Menu.mostrarMenuPrestamos();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.REALIZAR_PRESTAMO:
				System.out.println("Proximamente...");
				
				break;
			case Menu.DEVOLVER_LIBRO:
				System.out.println("Proximamente...");
				
				break;
			case Menu.CONSULTAR_PRETAMOS_NO_DEVUELTOS:
				System.out.println("Proximamente...");
				//TODO El siguiente en hacer? (Su base del "visor" creado).

				break;
			case Menu.CONSULTAR_PRESTAMOS_SOCIOS:
				System.out.println("Proximamente...");
				
				break;
			case Menu.CONSULTAR_DISPONIBILIDAD:
				Prestamo consultaPrestamo = gestorbbdd.getPrestamo(FormularioDeDatos.pedirIdLibro(scan));
				if(consultaPrestamo.isDevuelto() == true) {
					Visor.mostrarMensaje("\u001B[32mEl libro esta disponible!\n\u001B[30m");
				}else {
					Visor.mostrarMensaje("\u001B[31mEl libro NO esta disponible!\n\u001B[30m");
				}
				
				break;
			case Menu.SALIR:
				break;
			default:
				System.out.println("\u001B[31mOpcion no valida!\nIntentalo de nuevo.\u001B[30m");
				break;
			}
			
		}while(opcion != 0);
		
		
	}
}
