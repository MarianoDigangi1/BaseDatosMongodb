package Model;

import org.bson.Document;

public class Empleado{
	private Persona persona;
	private String cuil;
	private Sucursal sucursal;
	private boolean esEncargado;
	
	public Empleado() {}

	public Empleado(Persona persona,String cuil, Sucursal sucursal, boolean esEncargado) {
		this.persona = persona;
		this.cuil = cuil;
		this.sucursal = sucursal;
		this.esEncargado = esEncargado;
	}

	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public boolean isEsEncargado() {
		return esEncargado;
	}

	public void setEsEncargado(boolean esEncargado) {
		this.esEncargado = esEncargado;
	}
	
	public Document toDocument() {
		return new Document("persona", this.persona.toDocument())
				.append("cuil", this.cuil)
				.append("sucursal", this.sucursal.toDocument())
				.append("esEncargado", this.esEncargado);
	}
}
