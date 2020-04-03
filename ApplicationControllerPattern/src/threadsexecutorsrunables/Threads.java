/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexecutorsrunables;
import java.util.*;

/**
 *
 * @author Luis
 */
public class Threads {

    public static class ThreadExample extends Thread{
       @Override
       public void run(){
           System.out.println("This in an example of thread");
       }
               
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Thread ThreadExample = new ThreadExample();
        ThreadExample.start();
    }
    
}
