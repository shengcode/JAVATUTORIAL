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
public class MyThread7 extends Thread{
    public void run(){
        TableStaticSynchronziedMethod.printTable(5);
    }
}
