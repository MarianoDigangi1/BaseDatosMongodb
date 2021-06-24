package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

public class Venta{
	
	private LocalDate fecha;
	private String numeroTicket;
	private float totalVenta;
	private String formaPago;
	private Persona cliente;
	private Empleado empleadoAtencion;
	private Empleado empleadoCobro;
	private List<DetalleVenta> detalleVenta;
	
	public Venta() {}

	public Venta(LocalDate fecha, String numeroTicket, float totalVenta, String formaPago,
			Persona cliente, Empleado empleadoAtencion, Empleado empleadoCobro) {
		super();
		this.fecha = fecha;
		this.numeroTicket = numeroTicket;
		this.totalVenta = totalVenta;
		this.formaPago = formaPago;
		this.cliente = cliente;
		this.empleadoAtencion = empleadoAtencion;
		this.empleadoCobro = empleadoCobro;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getNumeroTicket() {
		return numeroTicket;
	}
	public void setNumeroTicket(String numeroTicket) {
		this.numeroTicket = numeroTicket;
	}
	public float getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(float totalVenta) {
		this.totalVenta = totalVenta;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	public Empleado getEmpleadoAtencion() {
		return empleadoAtencion;
	}
	public void setEmpleadoAtencion(Empleado empleadoAtencion) {
		this.empleadoAtencion = empleadoAtencion;
	}
	public Empleado getEmpleadoCobro() {
		return empleadoCobro;
	}
	public void setEmpleadoCobro(Empleado empleadoCobro) {
		this.empleadoCobro = empleadoCobro;
	}
	
	public List<DetalleVenta> getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
		this.detalleVenta = detalleVenta;
	}

	public Document toDocument() {
		/*List<Document> ds = new ArrayList<Document>();
		for(DetalleVenta d : this.detalleVenta) {
			ds.add(d.toDocument());
		}	*/
		return new Document("fecha", this.fecha)
				  .append("numeroTicket", this.numeroTicket)
				  .append("totalVenta", this.totalVenta)
				  .append("formaPago", this.formaPago)
				  .append("cliente", this.cliente.toDocument())
				  .append("empleadoAtencion", empleadoAtencion.toDocument())
				  .append("empleadoCobro", empleadoCobro.toDocument());
	}
}
