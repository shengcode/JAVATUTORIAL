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
public class Executor_demo implements Runnable {
    TableSynchronizedBlock b;
    
    public Executor_demo(TableSynchronizedBlock b){
        this.b=b;
    
    }    
    @Override
    public void run() {
        //b.printTable(n);
    }
    
}
