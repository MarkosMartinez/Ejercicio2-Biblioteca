package clases;

//import java.sql.PreparedStatement;

public class GestorBBDD {
	
	Conector conector = new Conector();
	
	public void insertarLibro(String Libro) {
		conector.conectar();
//		PreparedStatement insertar = conector.prepareStatement("INSERT INTO arboles (titulo) VALUES (?);");
//		insertar.setString(1, "titulo");
//		insertar.execute();
		conector.cerrar();
		
	}
	
	public void eliminarLibro(String Libro) {
		
	}
	
	public Libro getLibro(int id) {
		
		return null;
	}

}
