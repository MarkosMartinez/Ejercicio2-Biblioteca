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
				Visor.mostrarMensaje("\u001B[32mLibro insertado!\u001B[30m\n");
				
				break;
			case Menu.ELIMINAR_LIBRO:
				int idDelete = FormularioDeDatos.pedirIdLibro(scan);
				gestorbbdd.eliminarLibro(idDelete);
				Visor.mostrarMensaje("\u001B[32mLibro eliminado!\u001B[30m\n");
				
				break;
			case Menu.MODIFICAR_LIBRO:
				Libro libroModifi = gestorbbdd.getLibro(FormularioDeDatos.pedirIdLibro(scan));
				libroModifi = FormularioDeDatos.modificarDatosLibro(libroModifi, scan);
				gestorbbdd.modificarLibro(libroModifi);
				Visor.mostrarMensaje("\u001B[32mLibro modificado!\u001B[30m\n");

				break;
			case Menu.VER_LIBROS:
				Visor.mostrarLibros(gestorbbdd.verLibros());
				
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
