package clases;

import java.util.ArrayList;

public class Visor {

	public static void mostrarLibros(ArrayList<Libro> libros) {
		System.out.println("Esta es la lista de libros en nuestra DB: ");
		for (int i = 0; i < libros.size(); i++) {
			System.out.println("ID: " + libros.get(i).getId() + "\nTitulo: " + libros.get(i).getTitulo() + "\nAutor: " + libros.get(i).getAutor() + "\nNumero de paginas: " + libros.get(i).getNum_pag() + "\n");
		}
		
	}
	
	public static void mostrarLibro(Libro libro) {
		System.out.println("ID: " + libro.getId() + "\nTitulo: " + libro.getTitulo() + "\nAutor: " + libro.getAutor() + "\nNumero de paginas: " + libro.getNum_pag());
	}
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
}
