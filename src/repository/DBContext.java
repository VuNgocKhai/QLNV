/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class DBContext {
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "sa";
    private static final String SERVER = "DESKTOP-J1UDNQI\\MSSQLSERVER01";
    private static final String PORT = "1433";
    private static final String DATABASE_NAME = "FPL_ĐT";
    private static final boolean USING_SSL = true;
    
    private static String CONNECT_STRING;
    
    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            StringBuilder connectStringBuilder = new StringBuilder();
            connectStringBuilder.append("jdbc:sqlserver://")
                    .append(SERVER).append(":").append(PORT).append(";")
                    .append("databaseName=").append(DATABASE_NAME).append(";")
                    .append("user=").append(USERNAME).append(";")
                    .append("password=").append(PASSWORD).append(";")
                    .append("encrypt=true;trustServerCertificate=true;");
            
            CONNECT_STRING = connectStringBuilder.toString();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(CONNECT_STRING);
    }
    
}
