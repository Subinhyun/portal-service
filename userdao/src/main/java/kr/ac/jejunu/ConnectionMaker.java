package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectionMaker {
    public Connection getConnection() throws ClassNotFoundException, SQLException;
//        // 드라이버 로딩
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        // 커넥션
//        return DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/jeju",
//                "jeju",
//                "d0dduck10"
//        );

}