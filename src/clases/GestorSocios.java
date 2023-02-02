package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {
	
	public static void run(Scanner scan) throws SQLException{
		
		int opcion;
		GestorBBDD gestorbbdd = new GestorBBDD();
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.VER_SOCIOS:
				Visor.mostrarSocios(gestorbbdd.verSocios());
				
				break;
			case Menu.INSERTAR_SOCIOS:
				Socio socio = FormularioDeDatos.pedirDatosSocio(scan);
				gestorbbdd.insertarSocio(socio);
				Visor.mostrarMensaje("Socio insertado!\n");
				
				break;
			case Menu.ELIMINAR_SOCIOS:
				int idDelete = FormularioDeDatos.pedirIdSocio(scan);
				gestorbbdd.eliminarSocio(idDelete);
				Visor.mostrarMensaje("Socio eliminado!\n!");
	
				break;
			case Menu.MODIFICAR_SOCIOS:
				Socio socioModifi = gestorbbdd.getSocio(FormularioDeDatos.pedirIdSocio(scan));
				socioModifi = FormularioDeDatos.modificarDatosSocio(socioModifi, scan);
				gestorbbdd.modificarSocio(socioModifi);
				Visor.mostrarMensaje("Socio modificado!\n");
	
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
