package dev.java.sample;

import java.util.Arrays;
import java.util.List;

public class ArrayList2List {
	

    public static void main(String a[]){
        String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY", "DEVIN"};
        List<String> strList = Arrays.asList(strArr);
        System.out.println("Created List Size: "+strList.size());
        System.out.println(strList);
    }

}
