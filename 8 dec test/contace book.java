package Com.Question1;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {

	public static void main(String[] args) {
		
        Set<String> a = new HashSet<String>();
        Set<String> b = new HashSet<String>();
        Set<String> c = new HashSet<String>();
        
        a.add("Saurabh Kumar");
        a.add("7091410741");
        a.add("abc@gmail.com");
       
        
        b.add("Swati sinha");
        b.add("789765435");
        b.add("xyz@gmail.com");
        
        //Duplicate input
        c.add("Saurabh Kumar");
        c.add("7091410741");
        c.add("abc@gmail.com");
        
 
        // Printing elements of HashSet object
        System.out.println(a);
        System.out.println(b);

	}

}