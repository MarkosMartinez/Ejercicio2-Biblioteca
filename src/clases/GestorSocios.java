package clases;

import java.util.Scanner;

public class GestorSocios {
	
	public static void run(Scanner scan){
		
		int opcion;
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.VER_SOCIOS:
				
				//TODO Como hacer para ver los socios
				
				break;
			case Menu.SALIR:
				break;
			default:
				System.out.println("Opcion no valida!\nIntentalo de nuevo.");
				break;
			}
			
		}while(opcion != 0);
		
		
	}

}
