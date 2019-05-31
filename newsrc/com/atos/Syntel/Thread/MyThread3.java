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
public class MyThread3 extends Thread {
    TableSynchronizedMethod t;
    
    MyThread3 (TableSynchronizedMethod t){
        this.t=t;    
    }
    
    public void run(){
        t.printTable(5);
    }
    
}
