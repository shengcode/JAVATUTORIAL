/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coms.atosSyntel.databaseBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author syntel
 */
public class PreparedStatement_basics {
    public static void main(String[] args){        
            Connection myOracleConnection=null;
            PreparedStatement myOraclePreparedStatement=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            myOracleConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            myOraclePreparedStatement= myOracleConnection.prepareStatement("Insert into customer (customerId, customerName,cust"
                    + "omerCategory)values(?,?,?)");
            myOraclePreparedStatement.setString(1,"id");
            myOraclePreparedStatement.setString(2,"name");
            myOraclePreparedStatement.setString(3,"category");
            int status = myOraclePreparedStatement.executeUpdate();
            System.out.println(status);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{            
                try {
                    myOraclePreparedStatement.close();
                    myOracleConnection.close();
                }catch (SQLException ex) {
                    System.out.println(ex.getMessage()); 
                }                
            }
        }
    }
