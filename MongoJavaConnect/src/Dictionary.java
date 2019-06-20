

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 


import org.bson.types.ObjectId;

public class Dictionary implements Serializable  {
	
	  
	  public ObjectId _id;
	  public String word;
	  public String mean;
	  
	  public Dictionary() {}
	  
	  public Dictionary(ObjectId _id, String word, String mean) {
		    this._id = _id;
		    this.word = word;
		    this.mean = mean;
		    
		  }
	  
	  public String get_id() { return _id.toHexString(); }
	  public void set_id(ObjectId _id) { this._id = _id; }
	  
	  public String getWord() { return word; }
	  public void setWord(String word) { this.word = word; }
	  
	  public String getMean() { return mean; }
	  public void setMean(String mean) { this.mean = mean; }

}
