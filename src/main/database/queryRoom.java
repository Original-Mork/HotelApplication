/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin
 */
public class queryRoom extends Database{
    /**
     * Result set used to grab SQL query results
     */
    ResultSet rs = null;
    /**
     * SQL prepared statement to create AUTHENTICATION table 
     */
    PreparedStatement statement = null; 
    
    /**
     * Queries all records of the AUTHENTICATION table  
     */
    public void getAllRoom() {
        
        try{
            // Prepares statement for ROOM table 
                statement = conn.prepareStatement(
                        "SELECT * FROM APP.ROOM"
                );
                rs = statement.executeQuery();
                
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
