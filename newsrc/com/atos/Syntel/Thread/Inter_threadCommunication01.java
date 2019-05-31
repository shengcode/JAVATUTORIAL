
package com.atos.Syntel.Thread;

public class Inter_threadCommunication01 {
    public static void main (String[] args){
    
    final Account c= new Account();
        
        //Anonymous Thread
        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        
        new Thread(){
            public void run(){
                c.deposit(10000);
            }
        }.start();
     
    }
}
