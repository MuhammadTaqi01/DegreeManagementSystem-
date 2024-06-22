/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smiu;

import java.sql.Connection;
import java.sql.DriverManager;
       
/**
 *
 * @author Syed Taqi
 */
public class DB {
    
    public static Connection connect(){
     Connection con = null;
     try{  
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smiu?zeroDateTimeBehavior=convertToNull", "root", "");
       }catch(Exception e){
        System.out.println(e);
       }
     return con;
}       
}
