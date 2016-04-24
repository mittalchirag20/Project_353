package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class TestEmail {
    
    private static String dbURL = "jdbc:derby://localhost:1527/Project353;create=true;user=itkstu;password=student";
    private static String tableName ="Project353.subscribe";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;
    
    public static void main(String args[]){
              try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
        ResultSet results=null;
         try
       {
           stmt = conn.createStatement();
           
           results=stmt.executeQuery("select subcribe from " + tableName + " where emailid like '%' " );
           conn.setAutoCommit(false);
           
          // stmt.close();
       }
       catch (SQLException sqlExcept)
       {
           sqlExcept.printStackTrace();
       }
        String subscribeornot="";
        if(null!=results){
            
                  try {
                      while(results.next())
                      { subscribeornot=results.getString(1);
                      if("Y".equalsIgnoreCase(subscribeornot)){
                          //Email code here
                      }
                      
                      
                      }     } catch (SQLException ex) {
                      Logger.getLogger(TestEmail.class.getName()).log(Level.SEVERE, null, ex);
                  }
        }
        
 
        System.out.println("abcdef");
    }
 
    
}
