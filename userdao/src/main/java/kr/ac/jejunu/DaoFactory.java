package kr.ac.jejunu;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.Driver;

@Configuration
public class DaoFactory {
    @Value("${db.drivername}")
    private String driverClassName; // = "com.mysql.cj.jdbc.Driver";
    @Value("${db.url}")
    private String url;// = "jdbc:mysql://localhost:3306/jeju";
    @Value("${db.username}")
    private String username; // = "jeju";
    @Value("${db.password}")
    private String password; // = "d0dduck10";

    @Bean
    public UserDao userDao() throws ClassNotFoundException {
        return new UserDao(jdbcContext());
    }

    public JdbcContext jdbcContext() throws ClassNotFoundException {
        return new JdbcContext(dataSource());
    }

    @Bean
    public DataSource dataSource() throws ClassNotFoundException {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClass(
                (Class<? extends Driver>) Class.forName(driverClassName));
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
