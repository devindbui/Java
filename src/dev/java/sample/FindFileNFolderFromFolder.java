package dev.java.sample;
import java.io.File;

public class FindFileNFolderFromFolder {
    public static void main(String a[]){
        File file = new File("C:\\Users\\Devin\\eclipse\\jee-oxygen\\eclipse");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }
}
