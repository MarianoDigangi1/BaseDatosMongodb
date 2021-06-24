package Model;

import org.bson.Document;

public class Empleado extends Persona{

	private String cuil;
	private Sucursal sucursal;
	private boolean esEncargado;
	
	public Empleado() {}

	public Empleado(String nombre, String apellido, int dni, String nroAfiliado, Domicilio domicilio,
			String obraSocial,String cuil, Sucursal sucursal, boolean esEncargado) {
		super(nombre, apellido, dni, nroAfiliado, domicilio, obraSocial);
		this.cuil = cuil;
		this.sucursal = sucursal;
		this.esEncargado = esEncargado;
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
		return new Document(super.toDocument())
				.append("cuil", this.cuil)
				.append("sucursal", sucursal.toDocument())
				.append("esEncargado", this.esEncargado);
	}
}
