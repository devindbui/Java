package dev.java.tools;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetLocalHostName {
	 public static void main(String a[]){
	     
		  try {
	          //by localhost
			 InetAddress myHost = InetAddress.getLocalHost();
	        
	            System.out.println(myHost.getHostName());
	        } catch (UnknownHostException ex) {
	            ex.printStackTrace();
	        }
	    }
}
