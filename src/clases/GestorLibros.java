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
				System.out.println("Libro insertado!");
				
				break;
			case Menu.ELIMINAR_LIBRO:
				gestorbbdd.conectar();
				System.out.println("Escribe el ID del libro que quieres eliminar: ");
				int idDelete = Integer.parseInt(scan.nextLine());
				gestorbbdd.eliminarLibro(idDelete);
				gestorbbdd.cerrar();
				System.out.println("Libro eliminado!");
				
				break;
			case Menu.MODIFICAR_LIBRO:
				System.out.println("Escribe el ID del libro que quieres modificar: ");
				int idModifi = Integer.parseInt(scan.nextLine());
				Libro libroModifi = gestorbbdd.getLibro(idModifi);
				libroModifi = FormularioDeDatos.modificarDatosLibro(libroModifi, scan);
				gestorbbdd.modificarLibro(libroModifi);
				System.out.println("Libro modificado!\n");

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
