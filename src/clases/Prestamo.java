package clases;

import java.util.Date;

public class Prestamo {

	private int id_libro;
	private int id_socio;
	private Date fecha;
	private int devuelto;
	
	public Prestamo() {
		
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date date) {
		this.fecha = date;
	}

	public int getDevuelto() {
		return devuelto;
	}

	public void setDevuelto(int devuelto) {
		this.devuelto = devuelto;
	}	
	
}
