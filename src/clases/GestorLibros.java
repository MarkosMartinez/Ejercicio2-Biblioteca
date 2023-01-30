package clases;

import java.util.Scanner;

public class GestorLibros {

	public void run(Scanner scan){
		
		int opcion;
		boolean opcionvalida = false;
		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				FormularioDeDatos.pedirDatosLibro(scan);
				//TODO Lo pide pero falta hacer algo con el. Y mirar si pide bien los datos.
				
				break;
			case Menu.ELIMINAR_LIBRO:
				//TODO Existe esto o es modificar libro?
				
				break;
			case Menu.VER_LIBROS:
				//TODO como hacer para mostrar los libroS (con Visor.mostrarLibro();?)
				
				break;
			default:
				System.out.println("Opcion no valida!\nIntentalo de nuevo.");
				break;
			}
			
		}while(!opcionvalida);
		
		
	}
	
}
