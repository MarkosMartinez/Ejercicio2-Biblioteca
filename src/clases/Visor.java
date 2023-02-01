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
	
	public static void mostrarSocios(ArrayList<Socio> socios) {
		System.out.println("Esta es la lista de socios en nuestra DB: ");
		for (int i = 0; i < socios.size(); i++) {
			System.out.println("ID: " + socios.get(i).getId() + "\nNombre: " + socios.get(i).getNombre() + "\nApellido: " + socios.get(i).getApellido() + "\nDireccion: " + socios.get(i).getDireccion() + "\nPoblacion: " + socios.get(i).getPoblacion() + "\nProvincia: " + socios.get(i).getProvincia() + "\nDNI: " + socios.get(i).getDni()+ "\n");
		}
		
	}
	
}
