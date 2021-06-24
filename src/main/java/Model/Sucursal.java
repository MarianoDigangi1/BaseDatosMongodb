package Model;

import org.bson.Document;

public class Sucursal {

	private Domicilio domicilio;
	private int puntoVenta;
	
	public Sucursal() {}

	public Sucursal(Domicilio domicilio, int puntoVenta) {
		super();
		this.domicilio = domicilio;
		this.puntoVenta = puntoVenta;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public int getPuntoVenta() {
		return puntoVenta;
	}

	public void setPuntoVenta(int puntoVenta) {
		this.puntoVenta = puntoVenta;
	}
	
	public Document toDocument() {
		return new Document("domicilio",this.domicilio.toDocument())
				.append("puntoVenta",this.puntoVenta);
	}
}
