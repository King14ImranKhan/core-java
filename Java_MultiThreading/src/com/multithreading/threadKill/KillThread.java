package com.multithreading.threadKill;

class MyThreadEx implements Runnable { 
    private boolean exit; 
    private String name; 
    Thread t; 
    MyThreadEx(String threadname) 
    { 
        name = threadname; 
        t = new Thread(this, name); 
        System.out.println("New thread: " + t); 
        exit = false; 
        t.start(); // Starting the thread 
    } 
    public void run() 
    { 
        int i = 0; 
        while (!exit) { 
            System.out.println(name + ": " + i); 
            i++; 
            try { 
                Thread.sleep(100); 
            } 
            catch (InterruptedException e) { 
                System.out.println("Caught:" + e); 
            } 
        } 
        System.out.println(name + " Stopped."); 
    } 
    public void stop() 
    { 
        exit = true; 
    } 
} 
public class KillThread { 
    public static void main(String args[]) 
    { 
        MyThreadEx t1 = new MyThreadEx("First  thread"); 
        MyThreadEx t2 = new MyThreadEx("Second thread"); 
        try { 
            Thread.sleep(500); 
            t1.stop(); // stopping thread t1 
            t2.stop(); // stopping thread t2 
            Thread.sleep(500); 
        } 
        catch (InterruptedException e) { 
            System.out.println("Caught:" + e); 
        } 
        System.out.println("Exiting the main Thread"); 
    } 
} 
