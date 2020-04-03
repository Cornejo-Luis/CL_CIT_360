/*
 * In this class set.java we will explain how to create a different kind of set
Author:Luis Cornejo
Date 06/03/2020
 */

/*
 * A Set is a Collection that cannot contain duplicate elements. 
It models the mathematical set abstraction.
The Set interface contains only methods inherited from Collection and 
adds the restriction that duplicate elements are prohibited.
 */
package javacollection;
import java.util.*;

/**
 *
 * @author Luis
 */
public class Sets {
    public static void main(String[] args) {
    
        //I will insert elements using HashSet
        Set<String> Capital_Cities = new HashSet<String>(); 
        Capital_Cities.add("Berlin"); 
        Capital_Cities.add("Pekin"); 
        Capital_Cities.add("Quito"); 
        Capital_Cities.add("El Cairo"); 
        Capital_Cities.add("Budapest");
        Capital_Cities.add("Pekin");
        Capital_Cities.add("Tokio");
        Capital_Cities.add("Quito");
        Capital_Cities.add("Lima");
        System.out.print("Shows HashSet output without the duplicates");
        System.out.println(Capital_Cities); 
        
        //Using set to sort elements
        System.out.print("Sorted Set using TreeSet"); 
        Set<String> sort_tree_Set = new TreeSet<String>(Capital_Cities); 
        System.out.println(sort_tree_Set); 
        
    }
    
}
