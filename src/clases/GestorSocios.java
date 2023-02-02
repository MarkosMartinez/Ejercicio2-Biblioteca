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
				System.out.println("Socio insertado!");
				
				break;
			case Menu.ELIMINAR_SOCIOS:
	
				System.out.println("Proximamente...");
	
				break;
			case Menu.MODIFICAR_SOCIOS:
	
				System.out.println("Proximamente...");
	
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
