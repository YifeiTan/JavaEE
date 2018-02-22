package yncrea.pw06.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Emeric on 16/02/2018.
 */
@Configuration
@ComponentScan(basePackages = {"yncrea.pw06.core.service"})
public class AppConfig {

    @Bean
    public Properties dbProperties() throws IOException{
        Properties properties = new Properties();
        properties.setProperty("driverClass", "com.mysql.jdbc.Driver");
        properties.setProperty("jdbcUrl", "jdbc:mysql://localhost:3306/yncrea_pw03");
        properties.setProperty("username", "root");
        properties.setProperty("password", "");
        return properties;
    }

}
