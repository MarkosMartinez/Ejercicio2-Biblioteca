package clases;

/*import java.util.ArrayList;*/

public class Visor {

	/*public static void mostrarLibros(ArrayList() libros) {
		
	}*/
	
	public static void mostrarLibro(Libro libro) {
		System.out.println("ID: " + libro.getId() + "\nTitulo: " + libro.getTitulo() + "\nAutor: " + libro.getAutor() + "\nNumero de paginas: " + libro.getNum_pag());
	}
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
}
