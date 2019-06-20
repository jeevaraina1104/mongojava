import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MOngoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To Connect with the MongoDb Server
		MongoClient mongoClient = new MongoClient("localhost",27017);
		System.out.println("Connection Established Successfully");
		
		 MongoCredential credential; 
	      credential = MongoCredential.createCredential("sampleUser", "mydb1", 
	         "password".toCharArray()); 
		
		//To get the Database
	      // Accessing the database 
	      MongoDatabase database = mongoClient.getDatabase("mydb"); 
	      
	      //Creating a collection
	      MongoCollection<Document> collection = database.getCollection("mycol"); 
	      
	      Document document = new Document("title", "MongoDB1") 
	    	      .append("id", 1)	    	     
	    	      .append("by", "tutorialpoint");  
	    	      collection.insertOne(document); 
	    	      System.out.println("Document inserted successfully");     

	      System.out.println("Collection created successfully"); 
		
		
		
	}

}
