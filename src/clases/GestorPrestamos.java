package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
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
					Visor.mostrarMensaje(Colores.ROJO + "El libro ya esta en un prestamo!\n" + Colores.NEGRO);
				}else {
					
					Prestamo prestamo = new Prestamo();
					Libro prestamoLibro = gestorbbdd.getLibro(realizarPrestamo.getId_libro());
					Socio prestamoSocio = gestorbbdd.getSocio(FormularioDeDatos.pedirIdSocio(scan));
					if(prestamoSocio.getId() != -1) {
					prestamo = FormularioDeDatos.pedirFechaPrestamo(scan, prestamo);
					gestorbbdd.realizarPrestamo(prestamoLibro, prestamoSocio, prestamo);
					Visor.mostrarMensaje(Colores.VERDE + "Prestamo realizado con exito!\n" + Colores.NEGRO);
					}
				}
				
				break;
			case Menu.DEVOLVER_LIBRO:
				Prestamo devolverLibro = gestorbbdd.getPrestamo(FormularioDeDatos.pedirIdLibro(scan));
				if(devolverLibro.getDevuelto() == 0) {
					Visor.mostrarMensaje(Colores.ROJO + "Este libro no se puede delvolver!\n" + Colores.NEGRO);
				}else {
					devolverLibro = gestorbbdd.devolverLibro(devolverLibro);
					Visor.mostrarMensaje(Colores.VERDE + "El libro ha sido devuelto con exito!\n" + Colores.NEGRO);
				}
				
				break;
			case Menu.CONSULTAR_PRETAMOS_NO_DEVUELTOS:
				Visor.mostrarPrestamos(gestorbbdd.consultarPrestamosNoDevueltos());

				break;
			case Menu.CONSULTAR_PRESTAMOS_SOCIOS:
				int consultarPrestamosIdSocio = FormularioDeDatos.pedirIdSocio(scan);
				boolean tienePrestamos = gestorbbdd.tienePrestamos(consultarPrestamosIdSocio);
				
				if(!tienePrestamos) {
					Visor.mostrarMensaje(Colores.ROJO + "Este socio No tiene ningun prestamo!\n" + Colores.NEGRO);
				}else {
					ArrayList<Prestamo> prestamosDelSocio = gestorbbdd.consultarPrestamosSocios(consultarPrestamosIdSocio);
					Visor.mostrarPrestamos(prestamosDelSocio);
				}
				
				break;
			case Menu.CONSULTAR_DISPONIBILIDAD:
				Prestamo consultaPrestamo = gestorbbdd.getPrestamo(FormularioDeDatos.pedirIdLibro(scan));
				if(consultaPrestamo.getDevuelto() != 1) {
					Visor.mostrarMensaje(Colores.VERDE + "El libro esta disponible!\n" + Colores.NEGRO);
				}else {
					Visor.mostrarMensaje(Colores.ROJO + "El libro NO esta disponible!\n" + Colores.NEGRO);
				}
				
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
