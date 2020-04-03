/*
 * In this class ArrayList.Java we will explain with an example how to create
   an Array in Java
Author: Luis Cornejo
Date: 06/03/2020
 */

/*
ArrayList in Java is used to store dynamically sized collection of elements. 
Contrary to Arrays that are fixed in size, an ArrayList grows its size automatically
when new elements are added to it.
*/

package javacollection;
import java.util.*;
import java.io.*;

/**
 *
 * @author Luis Cornejo
 */
public class ArrayLists {
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("How many elements you want to add to the array: ");
        Scanner reader = new Scanner(System.in);
        int x= reader.nextInt();
        //Declare the Array List
        int[]random_num  = new int[x];
        
        for(int i = 0; i < x; i++) {
         int random = (int) (Math.random()*1000)+1;
         random_num[i] = random;
         System.out.println(""+random+"");
      }
    }
    
    
}
