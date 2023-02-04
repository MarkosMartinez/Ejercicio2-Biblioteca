package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class GestorPrestamos {
	public static void run(Scanner scan) throws SQLException, ParseException {
		
		int opcion;
		GestorBBDD gestorbbdd = new GestorBBDD();
		
		do {
			Menu.mostrarMenuPrestamos();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.REALIZAR_PRESTAMO:
				Prestamo realizarPrestamo = gestorbbdd.getPrestamo(FormularioDeDatos.pedirIdLibro(scan));
				if(realizarPrestamo.getDevuelto() == 1) {
					Visor.mostrarMensaje("\u001B[31mEl libro ya esta en un prestamo!\n\u001B[30m");
				}else {
					
					Prestamo prestamo = new Prestamo();
					Libro prestamoLibro = gestorbbdd.getLibro(realizarPrestamo.getId_libro());
					Socio prestamoSocio = gestorbbdd.getSocio(FormularioDeDatos.pedirIdSocio(scan));
					if(prestamoSocio.getId() != -1) {
					prestamo = FormularioDeDatos.pedirFechaPrestamo(scan, prestamo);
					gestorbbdd.realizarPrestamo(prestamoLibro, prestamoSocio, prestamo);
					Visor.mostrarMensaje("\u001B[32mPrestamo realizado con exito!\n\u001B[30m");
					}
				}
				
				break;
			case Menu.DEVOLVER_LIBRO:
				Prestamo devolverLibro = gestorbbdd.getPrestamo(FormularioDeDatos.pedirIdLibro(scan));
				if(devolverLibro.getDevuelto() == 0) {
					Visor.mostrarMensaje("\u001B[31mEste libro no se puede delvolver!\n\u001B[30m");
				}else {
					devolverLibro = gestorbbdd.devolverLibro(devolverLibro);
					Visor.mostrarMensaje("\u001B[32mEl libro ha sido devuelto con exito!\n\u001B[30m");
				}
				
				break;
			case Menu.CONSULTAR_PRETAMOS_NO_DEVUELTOS:
				Visor.mostrarPrestamosNoDevueltos(gestorbbdd.consultarPrestamosNoDevueltos());

				break;
			case Menu.CONSULTAR_PRESTAMOS_SOCIOS:
				System.out.println("Proximamente...");
				
				break;
			case Menu.CONSULTAR_DISPONIBILIDAD:
				Prestamo consultaPrestamo = gestorbbdd.getPrestamo(FormularioDeDatos.pedirIdLibro(scan));
				if(consultaPrestamo.getDevuelto() != 1) {
					Visor.mostrarMensaje("\u001B[32mEl libro esta disponible!\n\u001B[30m");
				}else {
					Visor.mostrarMensaje("\u001B[31mEl libro NO esta disponible!\n\u001B[30m");
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
