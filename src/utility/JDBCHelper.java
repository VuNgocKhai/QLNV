package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import repository.DBContext;

public class JDBCHelper {

    private Connection _connection;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;

    public ResultSet executeQuery(String sql, Object... args) {
        try {
            _connection = DBContext.getConnection();
            _preparedStatement = _connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                _preparedStatement.setObject(i + 1, args[i]);
            }
            _resultSet = _preparedStatement.executeQuery();

        } catch (Exception ex) {
            System.out.println("Lỗi truy vấn câu lệnh: " + sql);
        }

        return _resultSet;
    }

    public Integer executeUpdate(String sql, Object... args) {
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
}
