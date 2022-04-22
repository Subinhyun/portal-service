package kr.ac.jejunu.userdao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() {
        return new UserDao(getConnectionMaker());
    }
    @Bean
    public JejuconnectionMaker getConnectionMaker() {
        return new JejuconnectionMaker();
    }
}
