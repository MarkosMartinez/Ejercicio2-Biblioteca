package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public void run(Scanner scan) throws SQLException{
		
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
				System.out.println("Escribe el ID del libro que quieres eliminar: ");
				GestorBBDD gestorbbdd = new GestorBBDD(); //Ver si haciendo un objeto o cambiando GestorBBDD.java a static (mas facil)
				gestorbbdd.eliminarLibro(0);
				//TODO Desde GestorBBDD y para que existe modificar libro?
				
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
