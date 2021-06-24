package Model;

import org.bson.Document;

public class DetalleVenta {

	private Producto producto;
	private int cantProducto;
	private float totalUnitario;
	
	public DetalleVenta() {
		
	}
	public DetalleVenta(Producto producto, int cantProducto, float totalUnitario) {
		super();
		this.producto = producto;
		this.cantProducto = cantProducto;
		this.totalUnitario = totalUnitario;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantProducto() {
		return cantProducto;
	}
	public void setCantProducto(int cantProducto) {
		this.cantProducto = cantProducto;
	}
	public float getTotalUnitario() {
		return totalUnitario;
	}
	public void setTotalUnitario(float totalUnitario) {
		this.totalUnitario = totalUnitario;
	}
	public Document toDocument() {
		return new Document("producto", this.producto.toDocument())
					.append("cantProducto", this.cantProducto)
					.append("totalUnitario", this.totalUnitario);
	}
}
