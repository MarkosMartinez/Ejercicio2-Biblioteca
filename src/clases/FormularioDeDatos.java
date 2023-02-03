package clases;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FormularioDeDatos {

	
	//LIBROS
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
		Visor.mostrarMensaje("Escribe el id del Libro al que quieres acceder: ");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	
	
	
	//SOCIOS
	public static Socio pedirDatosSocio(Scanner scan) {
		Socio socio = new Socio();
		System.out.println("Escribe el nombre del socio: ");
		socio.setNombre(scan.nextLine());
		System.out.println("Escribe el apellido del socio: ");
		socio.setApellido(scan.nextLine());
		System.out.println("Escribe la direccion del socio: ");
		socio.setDireccion(scan.nextLine());
		System.out.println("Escribe el poblacion del socio: ");
		socio.setPoblacion(scan.nextLine());
		System.out.println("Escribe la provincia del socio: ");
		socio.setProvincia(scan.nextLine());
		System.out.println("Escribe el DNI del socio: ");
		socio.setDni(scan.nextLine());
		
		
		return socio;
	}
	
	public static int pedirIdSocio(Scanner scan) {
		Visor.mostrarMensaje("Escribe el id del Socio al que quieres acceder: ");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	
	public static Socio modificarDatosSocio(Socio socio, Scanner scan) throws SQLException {
		System.out.println("*Puedes dejar los datos vacios si quieres dejarlos como antes!");
		System.out.println("Escribe el nuevo nombre del socio (Anterior: " + socio.getNombre() + "): ");
		String nuevoNombre = scan.nextLine();
		if(nuevoNombre != "") {
			socio.setNombre(nuevoNombre);
		}
		System.out.println("Escribe el nuevo apellido del socio: (Anterior: " + socio.getApellido() + "): ");
		String nuevoApellido = scan.nextLine();
		if(nuevoApellido != "") {
			socio.setApellido(nuevoApellido);
		}
		System.out.println("Escribe la nueva direccion del socio: (Anterior: " + socio.getDireccion() + "): ");
		String nuevaDireccion = scan.nextLine();
		if(nuevaDireccion != "") {
			socio.setDireccion(nuevaDireccion);
		}
		System.out.println("Escribe la nueva poblacion del socio: (Anterior: " + socio.getPoblacion() + "): ");
		String nuevaPoblacion = scan.nextLine();
		if(nuevaPoblacion != "") {
			socio.setPoblacion(nuevaPoblacion);
		}
		System.out.println("Escribe la nueva provincia del socio: (Anterior: " + socio.getProvincia() + "): ");
		String nuevaProvincia = scan.nextLine();
		if(nuevaProvincia != "") {
			socio.setProvincia(nuevaProvincia);
		}
		System.out.println("Escribe el nuevo DNI del socio: (Anterior: " + socio.getDni() + "): ");
		String nuevoDni = scan.nextLine();
		if(nuevoDni != "") {
			socio.setDni(nuevoDni);
		}
		return socio;
	}

	public static Date pedirFechaPrestamo(Scanner scan) throws ParseException {
		System.out.println("Escribe la fecha del prestamo (dd/MM/yyyy)");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date fechaUtil = formato.parse(scan.nextLine());
		java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
		//TODO Arreglar la manera de agregar las fechas. Ahora: yyyy/MM/dd. Se puede cambiar?
		return fechaSql;
	}
	
}
