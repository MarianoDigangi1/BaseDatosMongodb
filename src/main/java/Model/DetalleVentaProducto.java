package Model;

import org.bson.Document;

public class DetalleVentaProducto {

	private Venta venta;
	private Producto producto;
	private int cantProducto;
	private float totalUnitario;
	
	public DetalleVentaProducto() {
		
	}
	public DetalleVentaProducto(Venta venta, Producto producto, int cantProducto, float totalUnitario) {
		super();
		this.venta = venta;
		this.producto = producto;
		this.cantProducto = cantProducto;
		this.totalUnitario = totalUnitario;
	}
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
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
		return new Document("venta", this.venta.toDocument())
				.append("producto", this.producto.toDocument())
				.append("cantProducto", this.cantProducto)
				.append("totalUnitario", this.totalUnitario);
	}
}
