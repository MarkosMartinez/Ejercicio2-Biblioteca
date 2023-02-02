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
	public static final int MODIFICAR_LIBRO = 3;
	public static final int VER_LIBROS = 4;
	
	//mostrarMenuSocios
	public static final int VER_SOCIOS = 1;
	public static final int INSERTAR_SOCIOS = 2;
	public static final int ELIMINAR_SOCIOS = 3;
	public static final int MODIFICAR_SOCIOS = 4;
	
	//menuPrestamos
	public static final int REALIZAR_PRESTAMO = 1;
	public static final int DEVOLVER_LIBRO = 2;
	public static final int CONSULTAR_PRETAMOS_NO_DEVUELTOS = 3;
	public static final int CONSULTAR_PRESTAMOS_SOCIOS = 4;
	public static final int CONSULTAR_DISPONIBILIDAD = 5;

	
	public static void mostrarMenuPrincipal() {
		System.out.println(GESTIONAR_LIBROS + ".- Gestionar Libros\n" + GESTIONAR_SOCIOS + ".- Gestionar Socios\n" + GESTIONAR_PRESTAMOS + ".- Gestionar Prestamos\n" + SALIR + ".- Salir");
	}
	
	public static void mostrarMenuLibros() {
		System.out.println(INSERTAR_LIBRO + ".- Insertar Libro\n" + ELIMINAR_LIBRO + ".- Eliminar Libro\n" + MODIFICAR_LIBRO + ".- Modificar Libros\n" + VER_LIBROS + ".- Ver Libros\n" + SALIR + ".- Salir");
	}

	public static void mostrarMenuSocios() {
	System.out.println(VER_SOCIOS + ".- Ver Socios\n" + INSERTAR_SOCIOS + ".- Insertar Socio\n" + ELIMINAR_SOCIOS + ".- Eliminar Socio\n" + MODIFICAR_SOCIOS + ".- Modificar Socio\n" + SALIR + ".- Salir");
	}
	
	public static void mostrarMenuPrestamos() {
		System.out.println(REALIZAR_PRESTAMO + ".- Realizar préstamo\n" + DEVOLVER_LIBRO + ".- Devolver Libro\n" + CONSULTAR_PRETAMOS_NO_DEVUELTOS + ".- Consultar prestamos no devueltos\n" + CONSULTAR_PRESTAMOS_SOCIOS + ".- Consultar prestamos de un socio\n" + CONSULTAR_DISPONIBILIDAD + ".- Consultar disponibilidad\n" + SALIR + ".- Salir");
	}

}
