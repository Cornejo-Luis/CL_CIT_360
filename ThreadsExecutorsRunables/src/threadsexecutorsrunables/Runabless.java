/*
 * In this class Runabless.java we will explain how to create a Runnable Thread
Author:Luis Cornejo
Date 07/03/2020
 */
/*
java Runnable is an interface that is to be implemented by a class 
whose instances are intended to be executed by a thread.
 */
package threadsexecutorsrunables;
import java.util.*;

/**
 *
 * @author Luis
 */
public class Runabless {
    
    public static void main(String[] args) 
    { 
        System.out.println("Main thread is- "+ Thread.currentThread().getName()); 
        Thread t1 = new Thread(new Runabless().new RunnableImplement()); 
        Thread t2 = new Thread(new Runabless().new RunnableImplement()); 
        Thread t3 = new Thread(new Runabless().new RunnableImplement());
        t1.start(); 
        t2.start(); 
        t3.start();
    } 
  
    private class RunnableImplement implements Runnable { 
  
        public void run() 
        { 
            System.out.println(Thread.currentThread().getName()+ ", wins!"); 
        } 
    } 
    
}
