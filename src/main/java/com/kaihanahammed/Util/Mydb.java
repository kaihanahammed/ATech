package com.kaihanahammed.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kaihan_Ahammed
 * @version 1
 */
public class Mydb {

    private String dblink = null;
    private String username = null;
    private String password = null;
    
    private Connection connection = null;
    private Statement statement = null;
    
    public Mydb(String db_link, String user_name,String pass) {
        dblink = db_link;
        username = user_name;
        password = pass;
    }
    
    private void initdb(){
        try {
            connection = DriverManager.getConnection(dblink, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Mydb.class.getName()).log(Level.SEVERE, "initdb connection exception.", ex);
        }
        
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Mydb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void closedb(){
        try {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mydb.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Mydb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public ResultSet runsql(String sql){
        ResultSet resultSet = null;
        
        this.initdb();
        try {
            if (statement.execute(sql)) {
                resultSet = statement.getResultSet();
            } else {
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mydb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.closedb();
        return resultSet;
    }
    
}
