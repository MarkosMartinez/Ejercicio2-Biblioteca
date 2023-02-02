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
				Visor.mostrarMensaje("\u001B[32mSocio insertado!\u001B[30m\n");
				
				break;
			case Menu.ELIMINAR_SOCIOS:
				int idDelete = FormularioDeDatos.pedirIdSocio(scan);
				gestorbbdd.eliminarSocio(idDelete);
				Visor.mostrarMensaje("\u001B[32mSocio eliminado!\u001B[30m\n");
	
				break;
			case Menu.MODIFICAR_SOCIOS:
				Socio socioModifi = gestorbbdd.getSocio(FormularioDeDatos.pedirIdSocio(scan));
				if(socioModifi.getId() != -1) {
				socioModifi = FormularioDeDatos.modificarDatosSocio(socioModifi, scan);
				gestorbbdd.modificarSocio(socioModifi);
				Visor.mostrarMensaje("\u001B[32mSocio modificado!\u001B[30m\n");
				}
	
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
