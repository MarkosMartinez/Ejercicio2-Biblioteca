package clases;

import java.util.Scanner;

public class GestorLibros {

	public void run(Scanner scan){
		
		int opcion;
		boolean opcionvalida = false;
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.GESTIONAR_LIBROS:
				
				//TODO
				
				break;
			case Menu.GESTIONAR_SOCIOS:
				
				//TODO
				
				break;
			case Menu.GESTIONAR_PRESTAMOS:
				
				//TODO
				
				break;
			default:
				System.out.println("Opcion no valida!\nIntentalo de nuevo.");
				break;
			}
			
		}while(!opcionvalida);
		
		
	}
	
}
