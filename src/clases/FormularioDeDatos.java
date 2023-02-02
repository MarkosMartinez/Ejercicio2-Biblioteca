package clases;

import java.sql.SQLException;
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
	
	public static Libro modificarDatosLibro(Libro libro, Scanner scan) throws SQLException {
		System.out.println("*Puedes dejar los datos vacios si quieres dejarlos como antes!");
		System.out.println("Escribe el nuevo titulo del libro (Anterior: " + libro.getTitulo() + "): ");
		String nuevoTitulo = scan.nextLine();
		if(nuevoTitulo != "") {
			libro.setTitulo(nuevoTitulo);
		}
		System.out.println("Escribe el nuevo autor del libro: (Anterior: " + libro.getAutor() + "): ");
		String nuevoAutor = scan.nextLine();
		if(nuevoAutor != "") {
			libro.setAutor(nuevoAutor);
		}
		System.out.println("Escribe el nuevo numero de paginas del libro: (Anterior: " + libro.getNum_pag() + "): ");
		String nuevoNumPag = scan.nextLine();
		if(nuevoNumPag != "") {
			libro.setNum_pag(Integer.parseInt(nuevoNumPag));
		}
		return libro;
	}
	
	public static int pedirIdLibro(Scanner scan) {
		System.out.println("Escribe el id del libro al que quieres acceder: ");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	
}
