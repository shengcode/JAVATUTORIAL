/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.Syntel.Thread;

/**
 *
 * @author syntel
 */
public class ManagerSyncrhonize {
    public static void main (String [] args){
    /*TableSynchronizedMethod obj = new TableSynchronizedMethod ();
    MyThread3 t1= new MyThread3(obj);
    MyThread4 t2= new MyThread4(obj);
    
    
    t1.start();
    t2.start();
    
    
    TableSynchronizedBlock new_obj=new TableSynchronizedBlock();
    MyThread5 t3= new MyThread5(new_obj);
    MyThread6 t4= new MyThread6(new_obj);
    
    System.out.println("results for example with the synchronzied block ");
    t3.start();
    t4.start();
    */
    System.out.println("results for example with the synchronzied static method ");
    MyThread7 t5 = new MyThread7();
    MyThread8 t6 = new MyThread8();
    MyThread9 t7 = new MyThread9();
    t5.start();
    t6.start();
    t7.start();
    }
}
