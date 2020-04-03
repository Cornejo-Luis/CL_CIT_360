/*
 * In this class Maps.java we will explain how to create a hashmap
Author:Luis Cornejo
Date 06/03/2020
 */

/*
Java HashMap is a hash table based implementation of Java’s Map interface.
A Map, is a collection of key-value pairs. It maps keys to values.
1. A HashMap cannot contain duplicate keys.
2. Java HashMap allows null values and the null key.
3. HashMap is an unordered collection. It does not guarantee any specific order of the elements.
4. Java HashMap is not thread-safe. 
*/

package javacollection;
import java.util.*;
import java.io.*;

/**
 *
 * @author Luis
 */
public class Maps {
    public static void main(String[] args){
        // Create a HashMap object called mamals
        
    HashMap<String, String> mamals = new HashMap<String, String>();
    mamals.put("bear, black","Euarctos americanus");
    mamals.put("jack","Lepus");
    mamals.put("kangaroo","Dipodomys");
    mamals.put("wood","Neotoma");
    mamals.put("Turkey,Wild","Meleagris gallopavo Linnaeus");
    mamals.put("Acorn","Melanerpes formicivorus");
    mamals.put("glossy snake","Arizona elegans Kennicott");
    mamals.put("tortoise, desert","Gopherus agassizi Cooper");
    System.out.println(mamals);
    }
}
