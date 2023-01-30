package clases;

import java.util.Scanner;

public class FormularioDeDatos {

	public static Libro pedirDatosLibro(Scanner scan) {
		Libro libro = new Libro();
		System.out.println("Escribe el titulo del libro: ");
		libro.setTitulo(scan.nextLine());
		System.out.println("Escribe el autor del libro: ");
		libro.setAutor(scan.nextLine());
		System.out.println("Escribe el numero de paginas del libro: ");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		
		return libro;
	}
	
	public static Libro modificarDatosLibro(Libro libro, Scanner scan) {
		System.out.println("Escribe el nuevo titulo del libro (Anterior: " + libro.getTitulo() + "): ");
		libro.setTitulo(scan.nextLine());
		System.out.println("Escribe el nuevo autor del libro: (Anterior: " + libro.getAutor() + "): ");
		libro.setAutor(scan.nextLine());
		System.out.println("Escribe el nuevo numero de paginas del libro: (Anterior: " + libro.getNum_pag() + "): ");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		return libro;
	}
	
	public static int pedirIdLibro(Scanner scan) {
		//TODO Mirar si esta bien.
		System.out.println("Escribe el id del libro que quieres pedir: ");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	
}
