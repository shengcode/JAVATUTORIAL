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
// do a synchronized block
public class TableSynchronizedBlock {
    void printTable(int n){
        synchronized(this){
            System.out.println("this is the "+ n+ "th task I am creating");
           for(int i=1; i<=5; i++){
            System.out.println(n*i);
        }
        try {
            Thread.sleep(400);
        }catch (Exception e){
            System.out.println(e);
        }
        
        }
    
    }
}
