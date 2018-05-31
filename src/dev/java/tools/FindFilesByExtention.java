package dev.java.tools;
import java.io.File;
import java.io.FilenameFilter; 
public class FindFilesByExtention {

	
    public static void main(String a[]){
        File file = new File("C:\\Users\\Devin\\eclipse\\jee-oxygen\\eclipse\\readme");
        String[] files = file.list(new FilenameFilter() {
             
            @Override
            public boolean accept(File dir, String name) {
               // if(name.toLowerCase().endsWith(".csv")){
            	if(name.toLowerCase().endsWith(".html")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
            System.out.println(f);
        }
    }
}