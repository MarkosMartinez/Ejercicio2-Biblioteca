package clases;

public class Menu {
	
	//Salir
	public static final int SALIR = 0;
	
	//mostrarMenuPrincipal
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
	
	//mostrarMenuLibros
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int VER_LIBROS = 3;
	
	//mostrarMenuSocios
	public static final int VER_SOCIOS = 1;
	
	//menuPrestamos
	public static final int REALIZAR_PRESTAMO = 1;

	
	public static void mostrarMenuPrincipal() {
		System.out.println("1.- Gestionar Libros\n2.- Gestionar Socios\n3.- Gestionar Prestamos");
	}
	
	public static void mostrarMenuLibros() {
		System.out.println("1.- Insertar Libro\n2.- Eliminar Libro\n3.- Ver Libros");
	}

	public static void mostrarMenuSocios() {
	System.out.println("1.- Ver Socios");
	}
	
	public static void menuPrestamos() {
		System.out.println("1.- Realizar préstamo.");
	}

}
