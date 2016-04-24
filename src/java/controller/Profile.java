package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
@ManagedBean
@SessionScoped
public class Profile {
    
    private String emailID;

    public String getEmailID() {
       
        return emailID;
        //return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    private static String tableName ="Project353.subscribe";
 
    
    public String subscribe(){
//              
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String Project353 = "jdbc:derby://localhost:1527/Project353";
            Connection DBConn = DriverManager.getConnection(Project353, "itkstu", "student");
            String insertString;
            Statement stmt = DBConn.createStatement();
           
           
           insertString = "INSERT INTO " + tableName +" VALUES ('" + emailID + "' ,'Y')";
           
           
           
           //results=stmt.executeQuery("select UserID from " + tableName + " where userid like'" + this.theModel.getUserID() + "'" );
        stmt.executeUpdate(insertString);
        
        DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Subscribed Successfully");
        return "SubscribeDone.xhtml";
    }
        
    public String unSubscribe(){
//              
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        try {
            String Project353 = "jdbc:derby://localhost:1527/Project353";
            Connection DBConn = DriverManager.getConnection(Project353, "itkstu", "student");
            String insertString;
            Statement stmt = DBConn.createStatement();
           
           
           insertString = "INSERT INTO " + tableName +" VALUES ('" + emailID + "' ,'N')";
           
           
           
           //results=stmt.executeQuery("select UserID from " + tableName + " where userid like'" + this.theModel.getUserID() + "'" );
        stmt.executeUpdate(insertString);
        
        DBConn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Unsubscribed Successfully");
        return "unSubscribeDone.xhtml";
    }
    
    
//     public void unsubscribe(){
//               try
//        {
//            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
//            //Get a connection
//            String Project353 = "jdbc:derby://localhost:1527/Project353";
//            conn = DriverManager.getConnection(Project353, "itkstu", "student"); 
//        }
//        catch (Exception except)
//        {
//            except.printStackTrace();
//        }
//        ResultSet results=null;
//         try
//       {
//           stmt = conn.createStatement();
//           
//           
//           stmt.executeUpdate("INSERT into " + tableName + " (EmailID, subcribe) values ('" + emailID + "' ,'N')");
//           
//           
//           
//           //results=stmt.executeQuery("select UserID from " + tableName + " where userid like'" + this.theModel.getUserID() + "'" );
//           conn.setAutoCommit(false);
//           stmt.close();
//           conn.close();
//          // stmt.close();
//       }
//       catch (SQLException sqlExcept)
//       {
//           sqlExcept.printStackTrace();
//       }
//        String useriddb="";
//        
// 
//        System.out.println("Unsubscribed Successfully");
//     }
}
