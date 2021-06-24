package Model;

import org.bson.Document;

public class Persona {

	private String nombre;
	private String apellido;
	private int dni;
	private String nroAfiliado;
	private Domicilio domicilio;
	private String obraSocial;
	
	public Persona() { }
	
	public Persona(String nombre, String apellido, int dni, String nroAfiliado, Domicilio domicilio
			, String obraSocial) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nroAfiliado = nroAfiliado;
		this.domicilio = domicilio;
		this.obraSocial = obraSocial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNroAfiliado() {
		return nroAfiliado;
	}

	public void setNroAfiliado(String nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public Document toDocument() {
		return new Document("nombre", this.nombre)
				  .append("apellido", this.apellido)
				  .append("dni", this.dni)
				  .append("nroAfiliado", this.nroAfiliado)
				  .append("domicilio", domicilio.toDocument())
				  .append("obraSocial", this.obraSocial);
	}
}
