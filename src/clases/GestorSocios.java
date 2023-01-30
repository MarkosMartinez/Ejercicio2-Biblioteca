package clases;

import java.util.Scanner;

public class GestorSocios {
	
	public void run(Scanner scan){
		
		int opcion;
		boolean opcionvalida = false;
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.VER_SOCIOS:
				
				//TODO Como hacer para ver los socios
				
				break;
			default:
				System.out.println("Opcion no valida!\nIntentalo de nuevo.");
				break;
			}
			
		}while(!opcionvalida);
		
		
	}

}
