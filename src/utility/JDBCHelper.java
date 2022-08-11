/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import repository.DBContext;

public class JDBCHelper implements AutoCloseable {

    public ResultSet exquery(String sql, Object... args) {
        Connection connection = null;
        PreparedStatement preparedstatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBContext.getConnection();
            preparedstatement = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedstatement.setObject(i + 1, args[i]);
            }
            resultSet = preparedstatement.executeQuery();
        } catch (Exception e) {
        }
        return resultSet;
    }
    public static Integer executeUpdate(String sql, Object... args) {
        Connection connection = null;
        PreparedStatement preparedstatement = null;
        Integer affectedRows = null;
        try {
            connection = DBContext.getConnection();
            preparedstatement = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedstatement.setObject(i + 1, args[i]);
            }
            affectedRows = preparedstatement.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Lỗi thực thi câu lệnh: " + sql);
        } 
        return affectedRows;
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
