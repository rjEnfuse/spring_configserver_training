package io.enfuse.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class ExternalConfig {

    @Value("${postgres_url}")
    private String url;
    @Value("${postgres_usr}")
    private String username;
    @Value("${postgres_psw}")
    private String password;
    @Value("${postgres_driver}")
    private String driver;

    private String name;
    public ExternalConfig(@Value("${name}") String name) {
        this.name = name;
    }

    @Bean
    @Primary
    public DataSource dataSource() {
        DataSourceBuilder dsb = DataSourceBuilder.create();
        dsb.driverClassName(driver);
        dsb.username(username);
        dsb.password(password);
        dsb.url(url);

        if (dsb == null) {
            return null;
        }
        System.out.println("driver: "+driver);
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        System.out.println("url: "+url);
        return dsb.build();
    }

    public String getName() {
        return name;
    }
}
