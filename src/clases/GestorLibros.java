package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public static void run(Scanner scan) throws SQLException{
		
		int opcion;
		GestorBBDD gestorbbdd = new GestorBBDD();
		
		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				Libro libro = FormularioDeDatos.pedirDatosLibro(scan);
				gestorbbdd.insertarLibro(libro);
				Visor.mostrarMensaje("Libro insertado!\n");
				
				break;
			case Menu.ELIMINAR_LIBRO:
				int idDelete = FormularioDeDatos.pedirIdLibro(scan);
				gestorbbdd.eliminarLibro(idDelete);
				Visor.mostrarMensaje("Libro eliminado!\n");
				
				break;
			case Menu.MODIFICAR_LIBRO:
				Libro libroModifi = gestorbbdd.getLibro(FormularioDeDatos.pedirIdLibro(scan));
				libroModifi = FormularioDeDatos.modificarDatosLibro(libroModifi, scan);
				gestorbbdd.modificarLibro(libroModifi);
				Visor.mostrarMensaje("Libro modificado!\n");

				break;
			case Menu.VER_LIBROS:
				Visor.mostrarLibros(gestorbbdd.verLibros());
				
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
