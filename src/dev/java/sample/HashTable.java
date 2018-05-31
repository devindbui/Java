package dev.java.sample;

import java.util.Hashtable;
import java.util.Set;

public class HashTable {
	
	public static Hashtable<String, String> KeyValue() {
		Hashtable<String, String> keyvalue = new Hashtable<String, String>();
		
		 //add key-value pair to Hashtable
		keyvalue.put("first", "FIRST INSERTED");
		keyvalue.put("second", "SECOND INSERTED");
		keyvalue.put("third","THIRD INSERTED");
		
		return keyvalue;
	}
	
    public static void main(String a[]){
        
        Hashtable<String, String> hm = KeyValue();
        		
        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }
    }
    
    
	

}
