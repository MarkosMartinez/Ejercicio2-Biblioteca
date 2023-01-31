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
				GestorBBDD gestorbbddinsert = new GestorBBDD();
				gestorbbddinsert.insertarLibro(FormularioDeDatos.pedirDatosLibro(scan));
				//TODO Mirar si esto esta bien
				
				break;
			case Menu.ELIMINAR_LIBRO:
				System.out.println("Escribe el ID del libro que quieres eliminar: ");
				int idDelete = Integer.parseInt(scan.nextLine());
				GestorBBDD gestorbbdddelete = new GestorBBDD();
				gestorbbdddelete.eliminarLibro(idDelete);
				//TODO Mirar si esto esta bien
				
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
