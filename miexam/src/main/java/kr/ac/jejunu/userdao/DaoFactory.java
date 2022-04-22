package kr.ac.jejunu.userdao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {

    public UserDao getUserDao() {
        return new UserDao(getConnectionMaker());
    }

    private JejuconnectionMaker getConnectionMaker() {
        return new JejuconnectionMaker();
    }
}
