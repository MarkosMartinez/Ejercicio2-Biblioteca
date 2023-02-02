package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBBDD extends Conector{
	
	Conector conector = new Conector();
	
	//LIBROS
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
		PreparedStatement eliminar = conector.getCon().prepareStatement("DELETE FROM libros WHERE id = ?;");
		eliminar.setInt(1, id);
		eliminar.execute();
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
			System.out.println("Libro NO encontrado\nPor favor, reinicia el programa para evitar errores!");
			//TODO Hacer que salga o algo cuando no encuentre el libro!
		}
		
		
		pSt.close();
		conector.cerrar();
		return libro;
	}

	public ArrayList<Socio> verSocios() throws SQLException {
		ArrayList<Socio> socios = new ArrayList<>();
		conector.conectar();
	
		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM socios");
		ResultSet resultado = pSt.executeQuery();
		while(resultado.next()) {
			Socio socio = new Socio();
			socio.setId(resultado.getInt("id"));
			socio.setNombre(resultado.getString("nombre"));
			socio.setApellido(resultado.getString("apellido"));
			socio.setDireccion(resultado.getString("direccion"));
			socio.setPoblacion(resultado.getString("poblacion"));
			socio.setProvincia(resultado.getString("provincia"));
			socio.setDni(resultado.getString("dni"));
			socios.add(socio);
		}
		conector.cerrar();
		pSt.close();
		conector.cerrar();
		return socios;
		
	}
	
	
	
	//SOCIOS
	public void insertarSocio(Socio socio) throws SQLException {
		conector.conectar();
		PreparedStatement insertar = conector.getCon().prepareStatement("INSERT INTO socios (nombre, apellido, direccion, poblacion, provincia, dni) VALUES (?,?,?,?,?,?);");
		insertar.setString(1, socio.getNombre());
		insertar.setString(2, socio.getApellido());
		insertar.setString(3, socio.getDireccion());
		insertar.setString(4, socio.getPoblacion());
		insertar.setString(5, socio.getProvincia());
		insertar.setString(6, socio.getDni());
		insertar.execute();
		conector.cerrar();	
	}
	
	public void eliminarSocio(int id) throws SQLException {
		conector.conectar();
		PreparedStatement eliminar = conector.getCon().prepareStatement("DELETE FROM socios WHERE id = ?;");
		eliminar.setInt(1, id);
		eliminar.execute();
		conector.cerrar();
	}
	
	public Socio getSocio(int id) throws SQLException {
		Socio socio = new Socio();
		conector.conectar();
		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM socios WHERE id = ?");
		pSt.setInt(1, id);
		ResultSet resultado = pSt.executeQuery();
		if(resultado.next()) {
			socio.setId(resultado.getInt("id"));
			socio.setNombre(resultado.getString("nombre"));
			socio.setApellido(resultado.getString("apellido"));
			socio.setDireccion(resultado.getString("direccion"));
			socio.setPoblacion(resultado.getString("poblacion"));
			socio.setProvincia(resultado.getString("provincia"));
			socio.setDni(resultado.getString("dni"));
		}else {
			System.out.println("Socio NO encontrado\nPor favor, reinicia el programa para evitar errores!");
			//TODO Hacer que salga o algo cuando no encuentre el libro!
		}
		
		
		pSt.close();
		conector.cerrar();
		return socio;
	}
	
	public void modificarSocio(Socio socio) throws SQLException {
		conector.conectar();
		PreparedStatement modificar = conector.getCon().prepareStatement("UPDATE socios SET nombre= ?, apellido= ?, direccion= ?, poblacion=?, provincia=?, dni=? WHERE id = ?;");
		modificar.setString(1, socio.getNombre());
		modificar.setString(2, socio.getApellido());
		modificar.setString(3, socio.getDireccion());
		modificar.setString(4, socio.getPoblacion());
		modificar.setString(5, socio.getProvincia());
		modificar.setString(6, socio.getDni());
		modificar.setInt(7, socio.getId());
		modificar.execute();
		conector.cerrar();	
	}
	
}
