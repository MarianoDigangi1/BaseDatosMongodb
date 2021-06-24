package MongoJava;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import org.bson.Document;
import org.bson.types.ObjectId;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import Model.DetalleVenta;
import Model.Domicilio;
import Model.Empleado;
import Model.Persona;
import Model.Producto;
import Model.Sucursal;
import Model.Venta;

public class MongoDB {
  
  public static void main (String[] args) {
	  //conexion local
	  String uri = "mongodb://localhost";
	    
	  MongoClient mongoClient = MongoClients.create(uri);
	  //me conecto a la base de datos farmacia o la creo si no existe
	  MongoDatabase db = mongoClient.getDatabase("Farmacia");  
	  //creando las tablas
	 
	  MongoCollection<Document> venta = db.getCollection("venta");
	  //MongoCollection<Document> persona = db.getCollection("persona");
	  DetalleVenta dv = new DetalleVenta(new Producto(),2, 5978.3f);
	  List<DetalleVenta> dvs = new ArrayList<>();
	  dvs.add(dv);
			  
	  Domicilio d = new Domicilio("calle",1111,"provincia","localidad");
	  Domicilio d2 = new Domicilio("calleas",1111,"provincia","localidad");
	  Domicilio d3 = new Domicilio("callejgfgf",1111,"provincia","localidad");
	  Domicilio d4 = new Domicilio("callejgfgf",2501,"provincia","localidad");
	  
	  Persona p = new Persona("Pepe","asd",123895912,"",d,"");
	  Persona p2 = new Persona("Pepe","asdfsdgdf",123895912,"",d2,"");
	  Persona p3 = new Persona("Pepe","ghoaomk",123895912,"",d3,"");
	  
	  Sucursal s = new Sucursal(d4,1);
	  
	  Empleado e1 = new Empleado(p2,"12-123895912-1",s,false);
	  Empleado e2 = new Empleado(p3,"20-123895912-6",s,true);
	  Venta v = new Venta(
						  LocalDate.of(1999, 7, 30),
						  "0001-18952921",
						  3000.0f,
						  "tarjeta",
						  p,e1,e2
			  	);
	  venta.insertOne(v.toDocument());
	  List<Document> ds = new ArrayList<Document>();
	  ds.add(dv.toDocument());
	  ds.add(dv.toDocument());
		
	  venta.findOneAndUpdate(Filters.eq("numeroTicket","0001-18952921"), Updates.pushEach("detalleVenta", ds));
	  FindIterable<Document> retornoQuery = venta.find(Filters.eq("numeroTicket","0001-18952921"));
	  for(Document docu : retornoQuery) {  		  
		  System.out.println(docu);
	  }
  }
}