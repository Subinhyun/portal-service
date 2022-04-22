package kr.ac.jejunu.userdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HallaConnection extends UserDao {
    @Override
    public Connection getConncetion(String url) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection =
                DriverManager.getConnection(url, "jeju", "d0dduck10");
        return connection;
    }
}
