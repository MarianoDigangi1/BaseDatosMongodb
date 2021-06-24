package Model;

import org.bson.Document;

public class Producto {

	private boolean medicamento;
	private String descripcion;
	private String laboratorio;
	private int codigo;
	private float precio;
	
	public Producto() {}

	public Producto(boolean medicamento, String descripcion, String laboratorio, int codigo, float precio) {
		super();
		this.medicamento = medicamento;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.codigo = codigo;
		this.precio = precio;
	}

	public boolean isMedicamento() {
		return medicamento;
	}

	public void setMedicamento(boolean medicamento) {
		this.medicamento = medicamento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public Document toDocument() {
		return new Document("medicamento", this.medicamento)
			.append("descripcion", this.descripcion)
			.append("laboratorio", this.laboratorio)
			.append("codigo", this.codigo)
			.append("precio", precio);
	}
	
}
