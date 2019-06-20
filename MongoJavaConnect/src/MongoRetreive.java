import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MongoRetreive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient mongoClient = new MongoClient("localhost",27017);
		System.out.println("Connection Established Successfully");
		
		 MongoCredential credential; 
	      credential = MongoCredential.createCredential("sampleUser", "mydb1", 
	         "password".toCharArray()); 
		
		//To get the Database
	      // Accessing the database 
	      MongoDatabase database = mongoClient.getDatabase("mydb"); 
	      
	      //Creating a collection
	     // MongoCollection<Document> collection = database.getCollection("mycol"); 
	      
	      //Creating a collection
	      MongoCollection<Document> collection = database.getCollection("dictionary"); 
	      
	      MongoCollection<Document> collection1 = database.getCollection("usertype");

	      
	      
	      //To update the value
	      
	     // collection.updateOne(Filters.eq("id", 1), Updates.set("by", "tp"));       
	   //   System.out.println("Document update successfully...");  
	      
	      FindIterable<Document> iterDoc = collection1.find(); 
	      int i = 1; 

	      // Getting the iterator 
	      Iterator it = iterDoc.iterator(); 
	    
	      while (it.hasNext()) {  
	         System.out.println(it.next());  
	      i++; 
	      }
	      
	      
	      //Deleting the document
	     // collection.deleteOne(Filters.eq("id", 1)); 
	     // System.out.println("Document deleted successfully...");  
	      
	      // Retrieving the documents after updation 
	      // Getting the iterable object 
		/*
		 * FindIterable<Document> iterDoc1 = collection.find(); int i1 = 1;
		 * 
		 * // Getting the iterator Iterator it1 = iterDoc1.iterator();
		 * 
		 * while (it1.hasNext()) { System.out.println("Inserted Document: "+i1);
		 * System.out.println(it1.next()); i1++; }
		 */ 
	      
	      //Getting all the collection name in database
	    //  for (String name : database.listCollectionNames()) { 
	   //       System.out.println(name); 
	    //   } 
	}

}
