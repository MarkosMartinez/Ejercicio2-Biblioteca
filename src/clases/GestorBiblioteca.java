package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca {
	Scanner scan = new Scanner(System.in);
public void run() throws SQLException{

	int opcion_menu;

	do {
		Menu.mostrarMenuPrincipal();
		opcion_menu = Integer.parseInt(scan.nextLine());

		switch (opcion_menu) {
		case Menu.GESTIONAR_LIBROS:
			GestorLibros.run(scan);
			
			break;
		case Menu.GESTIONAR_SOCIOS:
			GestorSocios.run(scan);
			
			break;
		case Menu.GESTIONAR_PRESTAMOS:
			GestorPrestamos.run(scan);
			
			break;
		case Menu.SALIR:
			System.out.println("\nAgur!");
			break;
		default:
			System.out.println("\u001B[31mOpcion no valida!\nIntentalo de nuevo.\u001B[30m");
		}

	} while (opcion_menu != Menu.SALIR);
	}
}
