/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.database;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin
 */
public class DatabaseTables extends Database{
    /**
     * Result set used to grab SQL query results
     */
    ResultSet rs = null;
    /**
     * SQL prepared statement to create AUTHENTICATION table 
     */
    PreparedStatement createAuthenticationTable = null; 
    /**
     * SQL prepared statement to create ROOM table 
     */
    PreparedStatement createRoomTable = null;
    /**
     * SQL prepared statement to create BOOKINGS table 
     */
    PreparedStatement createBookingsTable = null; 
    /**
     * SQL prepared statement to create BOOKINGS table 
     */
    PreparedStatement createServiceTable = null;  
    /**
     * SQL prepared statement to create BOOKINGS table 
     */
    PreparedStatement createServiceLogTable = null;
    
    /**
     * Opens new connection and run SQL prepared statements for table creation
     */
    
    public void setupDatabase(){
        conn = openConnection();
        DatabaseTables dbt = new DatabaseTables();
        dbt.createAuthentication();
    }
    
    /**
     * Create Authentication table if it does not exist already 
     */
    public void createAuthentication() {
        
        try{
            // Queries database for existing table name and stores within result set
            DatabaseMetaData dbmd = conn.getMetaData();
            rs = dbmd.getTables(null, "APP", "AUTHENTICATION", null);
            
            // If table does not exist, proceed to create 
            if (!rs.next()) {
                //If the AUTHENTICATION table does not already exist we create it
                createAuthenticationTable = conn.prepareStatement(
                        "CREATE TABLE APP.AUTHENTICATION ("
                                + "\"EMP_ID\" INT NOT NULL PRIMARY KEY "
                                + "GENERATED ALWAYS AS IDENTITY "
                                + "(START WITH 100100, INCREMENT BY 1), "
                                + "\"PASSWORD\" VARCHAR(50), "
                                + "\"FIRST_NAME\" VARCHAR(50), "
                                + "\"LAST_NAME\" VARCHAR(50), "
                                + "\"POSITION\" VARCHAR(50), "
                                + "\"CREATE\" BOOLEAN),"
                                + "\"READ\" BOOLEAN),"
                                + "\"UPDATE\" BOOLEAN),"
                                + "\"DELETE\" BOOLEAN)"
                );
                createAuthenticationTable.execute();
                
                // indicate successful creation of AUTHENTICATION table
                System.out.println("AUTHENTICATION table successfully created");
            }
            else {
                // if table already exists, indicate preexistence of AUTHENTICATION table
                System.out.println("AUTHENTICATION table already created previously");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Create ROOM table if it does not exist already 
     */
    public void createRoom() {
        
        try{
            // Queries database for existing table name and stores within result set
            DatabaseMetaData dbmd = conn.getMetaData();
            rs = dbmd.getTables(null, "APP", "ROOM", null);
            
            // If table does not exist, proceed to create 
            if (!rs.next()) {
                //If the ROOM table does not already exist we create it
                createRoomTable = conn.prepareStatement(
                        "CREATE TABLE APP.ROOM ("
                                + "\"ROOM_ID\" INT NOT NULL PRIMARY KEY "
                                + "GENERATED ALWAYS AS IDENTITY "
                                + "(START WITH 1, INCREMENT BY 1), "
                                + "\"ROOM_NUMBER\" VARCHAR(10), "
                                + "\"ROOM_TYPE\" VARCHAR(50), "
                                + "\"ROOM_DESCRIPTION\" VARCHAR(250), "
                                + "\"ROOM_COST\" DOUBLE"
                );
                createRoomTable.execute();
                
                // indicate successful creation of ROOM table
                System.out.println("ROOM table successfully created");
            }
            else {
                // if table already exists, indicate preexistence of ROOM table
                System.out.println("ROOM table already created previously");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Create BOOKINGS table if it does not exist already 
     */
    public void createBookings() {
        
        try{
            // Queries database for existing table name and stores within result set
            DatabaseMetaData dbmd = conn.getMetaData();
            rs = dbmd.getTables(null, "APP", "BOOKINGS", null);
            
            // If table does not exist, proceed to create 
            if (!rs.next()) {
                //If the BOOKINGS table does not already exist we create it
                createBookingsTable = conn.prepareStatement(
                        "CREATE TABLE APP.BOOKINGS ("
                                + "\"BOOKINGS_REFERENCE_CODE\" INT NOT NULL PRIMARY KEY "
                                + "GENERATED ALWAYS AS IDENTITY "
                                + "(START WITH 200100, INCREMENT BY 1), "
                                + "\"BOOKING_FIRST_NAME\" VARCHAR(50),"
                                + "\"BOOKING_LAST_NAME\" VARCHAR(50)"
                );
                createBookingsTable.execute();
                
                // indicate successful creation of BOOKINGS table
                System.out.println("BOOKINGS table successfully created");
            }
            else {
                // if table already exists, indicate preexistence of BOOKINGS table
                System.out.println("BOOKINGS table already created previously");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Create BOOKING_DETAILS table if it does not exist already 
     */
    public void createBookingDetails() {
        
        try{
            // Queries database for existing table name and stores within result set
            DatabaseMetaData dbmd = conn.getMetaData();
            rs = dbmd.getTables(null, "APP", "BOOKING_DETAILS", null);
            
            // If table does not exist, proceed to create 
            if (!rs.next()) {
                //If the BOOKINGS table does not already exist we create it
                createBookingsTable = conn.prepareStatement(
                        "CREATE TABLE APP.BOOKING_DETAILS ("
                                + "\"BOOKINGS_DETAILS_ID\" INT NOT NULL PRIMARY KEY "
                                + "GENERATED ALWAYS AS IDENTITY "
                                + "(START WITH 300100, INCREMENT BY 1), "
                                + "\"BOOKINGS_REFERENCE_CODE\" INT NOT NULL,"
                                + "FOREIGN KEY(BOOKINGS_REFERENCE_CODE)"
                                + "REFERENCE BOOKINGS (BOOKINGS_REFERENCE_CODE)"
                                + "\"BOOKING_NUMBER_OF_PEOPLE\" VARCHAR(50), "
                                + "\"ROOM_NUMBER\" VARCHAR(50), "
                                + "\"BOOKING_START_DATE\" DATE, "
                                + "\"BOOKING_END_DATE\" DATE, "
                                + "\"STAY_COST\" DOUBLE"
                );
                createBookingsTable.execute();
                
                // indicate successful creation of BOOKINGS table
                System.out.println("BOOKING_DETAILS table successfully created");
            }
            else {
                // if table already exists, indicate preexistence of BOOKINGS table
                System.out.println("BOOKING_DETAILS table already created previously");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Create BOOKING_DETAILS table if it does not exist already 
     */
    public void createService() {
        
        try{
            // Queries database for existing table name and stores within result set
            DatabaseMetaData dbmd = conn.getMetaData();
            rs = dbmd.getTables(null, "APP", "SERVICE", null);
            
            // If table does not exist, proceed to create 
            if (!rs.next()) {
                //If the BOOKINGS table does not already exist we create it
                createServiceTable = conn.prepareStatement(
                        "CREATE TABLE APP.SERVICE ("
                                + "\"SERVICE_ID\" VARCHAR(50) NOT NULL PRIMARY KEY "
                                + "\"SERVICE_DESCRIPTION\" VARCHAR(50), "
                                + "\"SERVICE_COST\" DOUBLE"
                );
                createServiceTable.execute();
                
                // indicate successful creation of SERVICE table
                System.out.println("SERVICE table successfully created");
            }
            else {
                // if table already exists, indicate preexistence of SERVICE table
                System.out.println("SERVICE table already created previously");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Create BOOKING_DETAILS table if it does not exist already 
     */
    public void createServiceLog() {
        
        try{
            // Queries database for existing table name and stores within result set
            DatabaseMetaData dbmd = conn.getMetaData();
            rs = dbmd.getTables(null, "APP", "SERVICE_LOG", null);
            
            // If table does not exist, proceed to create 
            if (!rs.next()) {
                //If the SERVICE_LOG table does not already exist we create it
                createServiceLogTable = conn.prepareStatement(
                        "CREATE TABLE APP.SERVICE_LOG ("
                                + "\"SERVICE_LOG_ID\" VARCHAR(50) NOT NULL PRIMARY KEY "
                                + "\"SERVICE_ID\" VARCHAR(50) NOT NULL,"
                                + "FOREIGN KEY(SERVICE_ID)"
                                + "REFERENCE SERVICE (SERVICE_ID)"
                                + "\"BOOKINGS_REFERENCE_CODE\" INT NOT NULL,"
                                + "FOREIGN KEY (BOOKINGS_REFERENCE_CODE)"
                                + "REFERENCE BOOKINGS (BOOKINGS_REFERENCE_CODE)"
                                + "\"DATE_VALID\" DATE, "
                                + "\"VALID\" BOOLEAN"
                );
                createServiceLogTable.execute();
                
                // indicate successful creation of SERVICE_LOG table
                System.out.println("SERVICE_LOG table successfully created");
            }
            else {
                // if table already exists, indicate preexistence of SERVICE_LOG table
                System.out.println("SERVICE_LOG table already created previously");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
