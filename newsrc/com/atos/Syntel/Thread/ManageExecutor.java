
package com.atos.Syntel.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ManageExecutor {
    public static void main (String[] args){
        ExecutorService executor =Executors.newFixedThreadPool(5);
        for(int i=0; i<15; i++){    
            TableSynchronizedBlock t= new TableSynchronizedBlock();
              final int a =i+1;
              executor.execute(new Executor_demo(t) {
                         public void run() {
                         //System.out.println("this is my task of "+ a);
                         t.printTable(a);
    }
});
        }
        executor.shutdown();
        while(!executor.isShutdown()){
            
        }
        System.out.println("Finished all threads");
    }
}
