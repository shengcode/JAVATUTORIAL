
package com.atos.Syntel.IOStream;
import java.io.File;
import javax.activation.MimetypesFileTypeMap;
public class GetFileInputTypeTest {
   
     public static void main (String [] args){
        
        
       
        File myfile= new File("C:/mytraining_stuff/FileTestCases/testfile.txt");
        if(myfile==null){
            System.out.println("not able to find the file");
        }
        else {
            System.out.println("found the file");
        }
         System.out.println(new MimetypesFileTypeMap().getContentType(
           new File("C:/mytraining_stuff/FileTestCases/testfile.txt")));
    }
}
    
    