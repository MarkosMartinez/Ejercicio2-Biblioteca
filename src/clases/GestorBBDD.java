package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD {
	
	Conector conector = new Conector();
	
	public void insertarLibro(Libro libro) throws SQLException {
		conector.conectar();
		PreparedStatement insertar = conector.getCon().prepareStatement("INSERT INTO libros (titulo, autor, num_pag) VALUES (?,?,?);");
		insertar.setString(1, libro.getTitulo());
		insertar.setString(2, libro.getAutor());
		insertar.setInt(3, libro.getNum_pag());
		insertar.execute();
		conector.cerrar();	
	}
	
	public void eliminarLibro(int id) throws SQLException {
		conector.conectar();
		PreparedStatement insertar = conector.getCon().prepareStatement("DELETE FROM libros WHERE id = ?;");
		insertar.setInt(1, id);
		insertar.execute();
		
		
		
		conector.cerrar();
	}
	
	public Libro getLibro(int id) {
		
		return null;
	}

}
