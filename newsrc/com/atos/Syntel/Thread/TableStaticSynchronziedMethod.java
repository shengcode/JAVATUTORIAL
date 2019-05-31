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
public class TableStaticSynchronziedMethod {
    synchronized static void printTable(int n){
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
