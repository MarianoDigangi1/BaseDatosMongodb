package Model;

import org.bson.Document;

public class Domicilio {

	private String calle;
	private int numero;
	private String provincia;
	private String localidad;
	
	public Domicilio() {}

	public Domicilio(String calle, int numero, String provincia, String localidad) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.provincia = provincia;
		this.localidad = localidad;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Document toDocument() {
		return new Document("calle",this.calle)
				.append("numero", this.numero)
				.append("provincia", this.provincia)
				.append("localidad", this.localidad);
	}
}
