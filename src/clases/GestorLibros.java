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
				Visor.mostrarMensaje(Colores.VERDE + "Libro insertado!\n" + Colores.NEGRO);
				
				break;
			case Menu.ELIMINAR_LIBRO:
				int idDelete = FormularioDeDatos.pedirIdLibro(scan);
				gestorbbdd.eliminarLibro(idDelete);
				Visor.mostrarMensaje(Colores.VERDE + "Libro eliminado!\n" + Colores.NEGRO);
				
				break;
			case Menu.MODIFICAR_LIBRO:
				Libro libroModifi = gestorbbdd.getLibro(FormularioDeDatos.pedirIdLibro(scan));
				if(libroModifi.getId() != -1) {
				libroModifi = FormularioDeDatos.modificarDatosLibro(libroModifi, scan);
				gestorbbdd.modificarLibro(libroModifi);
				Visor.mostrarMensaje(Colores.VERDE + "Libro modificado!\n" + Colores.NEGRO);
			}

				break;
			case Menu.VER_LIBROS:
				Visor.mostrarLibros(gestorbbdd.verLibros());
				
				break;
			case Menu.SALIR:
				break;
			default:
				System.out.println(Colores.ROJO + "Opcion no valida!\nIntentalo de nuevo." + Colores.NEGRO);
				break;
			}
			
		}while(opcion != 0);
		
		
	}
	
}
