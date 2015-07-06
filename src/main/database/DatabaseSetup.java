/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Morgan
 */
public class DatabaseSetup {
    protected Connection conn;

    protected void openConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:derby:"
                        + System.getProperty("user.dir")
                        + System.getProperty("file.separator")
                        + "hotelDB;create=true");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseSetup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    protected void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseSetup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
