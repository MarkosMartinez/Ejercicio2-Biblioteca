package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBBDD extends Conector{ //Es extends?
	
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
	
	public void modificarLibro(Libro libro) throws SQLException {
		conector.conectar();
		PreparedStatement modificar = conector.getCon().prepareStatement("UPDATE libros SET titulo= ?, autor= ?, num_pag= ? WHERE id = ?;");
		modificar.setString(1, libro.getTitulo());
		modificar.setString(2, libro.getAutor());
		modificar.setInt(3, libro.getNum_pag());
		modificar.setInt(4, libro.getId());
		modificar.execute();
		conector.cerrar();	
	}
	
	public ArrayList<Libro> verLibros() throws SQLException {
		ArrayList<Libro> libros = new ArrayList<>();
		conector.conectar();
	
		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM libros");
		ResultSet resultado = pSt.executeQuery();
		while(resultado.next()) {
			Libro libro = new Libro();
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getString("autor"));
			libro.setNum_pag(resultado.getInt("num_pag"));
			libros.add(libro);
		}
		conector.cerrar();
		pSt.close();
		conector.cerrar();
		return libros;
		
	}
	
	
	
	public Libro getLibro(int id) throws SQLException {
		Libro libro = new Libro();
		conector.conectar();
		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM libros WHERE id = ?");
		pSt.setInt(1, id);
		ResultSet resultado = pSt.executeQuery();
		if(resultado.next()) {
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getString("autor"));
			libro.setNum_pag(resultado.getInt("num_pag"));
		}else {
			System.out.println("Libro NO encontrado!");
		}
		
		
		pSt.close();
		conector.cerrar();
		return libro;
	}

}
