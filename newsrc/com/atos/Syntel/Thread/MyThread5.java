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
public class MyThread5 extends Thread {
    TableSynchronizedBlock b;
  
     MyThread5 (TableSynchronizedBlock b){
        this.b=b;    
    }
   
    public void run(){
        b.printTable(5);
    }
}
