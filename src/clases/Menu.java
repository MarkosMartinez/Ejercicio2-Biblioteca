package clases;

import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	public static void menuPrincipal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.- Gestionar Libros\n2.- Gestionar Socios\n3.- Gestionar Prestamos");
		int respuesta = Integer.parseInt(scan.nextLine());
		
		if(respuesta == 1) {
			menuLibros();
		}else if (respuesta == 2) {
			menuSocios();
		}else if (respuesta == 3) {
			menuPrestamos();
		}else {
			System.out.println("Opcion no valida!");
		}
		scan.close();
	}
	
	public static void menuLibros() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la opcion que quieras\n1.- Insertar Libro\n2.- Eliminar Libro\n3.- Ver Libros");
		int respuesta = Integer.parseInt(scan.nextLine());
		
		if(respuesta == 1) {
		}else if (respuesta == 2) {
			
		}else if (respuesta == 3) {
			
		}else {
			System.out.println("Opcion no valida!");
		}
		
		scan.close();
	}

	public static void menuSocios() {
		Scanner scan = new Scanner(System.in);
	System.out.println("1.- Ver Socios");
	
	
	
	scan.close();
	}
	
	public static void menuPrestamos() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.- Realizar préstamo.");
		
		
		
		scan.close();
	}

}
