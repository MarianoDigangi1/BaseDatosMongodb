package MongoJava;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

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
	  MongoCollection<Document> persona = db.getCollection("persona");
	  
//	  Venta v = new Venta(
//			  LocalDate.of(1999, 7, 30),
//			  "0002-18952921",
//			  3000.0f,
//			  "tarjeta"
//			  );
//	  
//	  Gson gson = new Gson(); 
//	  String json = gson.toJson(v);
//	  System.out.println(json);
//	  
//	  venta.insertOne(v.toDocument());
	  
  	}
}